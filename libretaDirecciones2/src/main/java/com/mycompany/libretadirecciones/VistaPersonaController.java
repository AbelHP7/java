/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.libretadirecciones;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableView;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;



public class VistaPersonaController implements Initializable 
{
    @FXML

    private TableView tablaPersonas;

    @FXML

    private TableColumn nombreColumn;

    @FXML

    private TableColumn apellidosColumn;

    @FXML

    private Label nombreLabel;

    @FXML

    private Label apellidosLabel;

    @FXML

    private Label direccionLabel;

    @FXML

    private Label codigoPostalLabel;

    @FXML

    private Label ciudadLabel;

    @FXML

    private Label fechaDeNacimientoLabel;

    // Referencia a la clase principal
    private LibretaDirecciones libretaDirecciones;
    
    //Muestro el diálogo editar persona cuando el usuario hace clic en el botón de Crear

    @FXML

    private void crearPersona() {

        Persona temporal = new Persona();
        
        temporal.clear();

        boolean guardarClicked = libretaDirecciones.muestraEditarPersona(temporal);

        if (guardarClicked) {

            libretaDirecciones.getDatosPersona().add(temporal);

        }

    }


    //Muestro el diálogo editar persona cuando el usuario hace clic en el botón de Editar

    @FXML

    private void editarPersona() {

        Persona seleccionada = (Persona) tablaPersonas.getSelectionModel().getSelectedItem();

        if (seleccionada != null) {

            boolean guardarClicked = libretaDirecciones.muestraEditarPersona(seleccionada);

            if (guardarClicked) {

                mostrarDetallesPersona(seleccionada);

            }


        }
        else 
        {

            //Muestro alerta

            Alert alerta = new Alert(Alert.AlertType.WARNING);

            alerta.setTitle("Alerta");

            alerta.setHeaderText("Persona no seleccionada");

            alerta.setContentText("Por favor, selecciona una persona");

            alerta.showAndWait();

        }

    }

    //El constructor es llamado ANTES del método initialize
    public VistaPersonaController() {

    }

    //Inicializa la clase controller y es llamado justo después de cargar el archivo FXML
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Inicializo la tabla con las dos primera columnas
        String nombre = "nombre";
        String apellidos = "apellidos";

        nombreColumn.setCellValueFactory(new PropertyValueFactory<>(nombre));
        apellidosColumn.setCellValueFactory(new PropertyValueFactory<>(apellidos));
        //Inicializa la clase controller y es llamado justo DESPUÉS de cargar el archivo FX
        //Borro los detalles de la persona
        mostrarDetallesPersona(null);      
        //OPCIÓN 2: evitar la expresión lambda y escribir todo el código a sobreescribir de la interfaz dentro del argumento del método 'addListener(ChangeListener cl)'
        //Hemos de realizar dos imports:
        //import javafx.beans.value.ChangeListener;
        //import javafx.beans.value.ObservableValue;
        tablaPersonas.getSelectionModel().selectedItemProperty().addListener(
                new ChangeListener()
                {
                    @Override public void changed(ObservableValue o,Object oldValue, Object newValue){
                        mostrarDetallesPersona((Persona)newValue);
                }
        });
    }
    //Es llamado por la aplicación principal para inicializar valores de la tabla
    //a través de una referencia recibida como argumento (mirar el método muestraVistaPersona() de la clase LibretaDirecciones)
    public void setLibretaDirecciones(LibretaDirecciones libretaDirecciones) 
    {
        this.libretaDirecciones = libretaDirecciones;

        //Añado la lista obervable a la tabla
        //Si en el método initialize no usamos los métodos setCellValueFactory, ahora tendríamos que recorrer la lista e
        //insertar los valores uno a uno en la tabla

        tablaPersonas.setItems(libretaDirecciones.getDatosPersona());
    }

//Muestra los detalles de la persona seleccionada

    private void mostrarDetallesPersona(Persona persona)
    { if (persona != null) {

            //Relleno los labels desde el objeto persona

            nombreLabel.setText(persona.getNombre());

            apellidosLabel.setText(persona.getApellidos());

            direccionLabel.setText(persona.getDireccion());

            codigoPostalLabel.setText(Integer.toString(persona.getCodigoPostal()));

            ciudadLabel.setText(persona.getCiudad());

            //TO-DO: Tenemos que convertir la fecha de nacimiento en un String

            fechaDeNacimientoLabel.setText(UtilidadDeFechas.formato(persona.getFechaDeNacimiento()));

        } else {

            //Persona es null, vacío todos los labels.

            nombreLabel.setText("");

            apellidosLabel.setText("");

            direccionLabel.setText("");

            codigoPostalLabel.setText("");

            ciudadLabel.setText("");

            fechaDeNacimientoLabel.setText("");

        }
        
    }
    //Borro la persona seleccionada cuando el usuario hace clic en el botón de Borrar

    @FXML

    private void borrarPersona() {

        //Capturo el indice seleccionado y borro su item asociado de la tabla

        int indiceSeleccionado = tablaPersonas.getSelectionModel().getSelectedIndex();

        if (indiceSeleccionado >= 0){

            //Borro item

            tablaPersonas.getItems().remove(indiceSeleccionado);


        } else {

            //Muestro alerta

            Alert alerta = new Alert(AlertType.WARNING);

            alerta.setTitle("Atención");

            alerta.setHeaderText("Persona no seleccionada");

            alerta.setContentText("Por favor, selecciona una persona de la tabla");

            alerta.showAndWait();


        }

    }
}
