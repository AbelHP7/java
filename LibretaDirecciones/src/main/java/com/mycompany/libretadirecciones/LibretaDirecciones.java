package com.mycompany.libretadirecciones;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;

public class LibretaDirecciones extends Application {

     private static Scene escenaPrincipal;
     
     private BorderPane contenedorPrincipal;

     private AnchorPane vistaPersona;

     
     private ObservableList datosPersona = FXCollections.observableArrayList();

     //Datos de ejemplo

    public LibretaDirecciones(){

        datosPersona.add(new Persona("Jairo", "García Rincón"));

        datosPersona.add(new Persona("Juan", "Pérez Martínez"));

        datosPersona.add(new Persona("Andrea", "Chenier López"));

        datosPersona.add(new Persona("Emilio", "González Pla"));

        datosPersona.add(new Persona("Mónica", "de Santos Sánchez"));
    }

    //Método para devolver los datos como lista observable de persona
    public ObservableList getDatosPersona() {

        return datosPersona;

    }

   @Override

    public void start(Stage escenarioPrincipal) throws IOException {


            FXMLLoader vista = new FXMLLoader(LibretaDirecciones.class.getResource("VistaPrincipal.fxml"));
            
            contenedorPrincipal = vista.load();
            
            escenaPrincipal = new Scene(contenedorPrincipal);

            escenarioPrincipal.setScene(escenaPrincipal);

            escenarioPrincipal.setTitle("Libreta de direcciones");
            
            //Establezco el icono de aplicación

            escenarioPrincipal.getIcons().add(new Image("file:./src/main/resources/com/mycompany/libretadirecciones/icono.png")); //Ojo con la ruta!!
        
            
            //Doy acceso al controlador VistaPersonaCOntroller a LibretaDirecciones

            VistaPrincipalController controller = vista.getController();

            controller.setLibretaDirecciones(this);


            escenarioPrincipal.show();

            muestraVistaPersona();


    }

    public void muestraVistaPersona() 
    {
     
         try {
             FXMLLoader vista = new FXMLLoader(LibretaDirecciones.class.getResource("VistaPersona.fxml"));
             
             escenaPrincipal.setRoot(vista.load());
              //Doy acceso al controlador VistaPersonaCOntroller a LibretaDirecciones

            VistaPersonaController controller = vista.getController();

            controller.setLibretaDirecciones(this);
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
                     
         }      
    }


    public boolean muestraEditarPersona(Persona persona) 
{

        boolean resul=false;
        
         try {
            Scene escenaEdicion;
            FXMLLoader vista = new FXMLLoader(LibretaDirecciones.class.getResource("EditarPersona.fxml"));
            escenaEdicion = new Scene(vista.load());
             
            Stage escenarioEdicion=new Stage();
            escenarioEdicion.setScene(escenaEdicion);
            escenarioEdicion.setTitle("Editar Persona");
            escenarioEdicion.initModality(Modality.WINDOW_MODAL);
            
             //Asigno el escenario de edición y la persona seleccionada al controlador

            EditarPersonaController controller = vista.getController();

            controller.setEscenarioEdicion(escenarioEdicion);

            controller.setPersona(persona);

            escenarioEdicion.showAndWait();
        
            resul=controller.isGuardarClicked();
            
         } catch (Exception ex) {
             ex.printStackTrace();
         }
               
        //devuelvo el botón pulsado

        return resul;
    }
     //Cargo personas de un fichero

    public void cargaPersonas(File archivo){


        try {

            //Contexto

            JAXBContext context = JAXBContext.newInstance(Empaquetador.class);

            Unmarshaller um = context.createUnmarshaller();


            //Leo XML del archivo y hago unmarshall

            Empaquetador empaquetador = (Empaquetador) um.unmarshal(archivo);


            //Borro los anteriores

            datosPersona.clear();

            datosPersona.addAll(empaquetador.getPersonas());



        } catch (Exception e) {

            //Muestro alerta

            Alert alerta = new Alert(Alert.AlertType.ERROR);

            alerta.setTitle("Error");

            alerta.setHeaderText("No se pueden cargar datos de la ruta "+ archivo.getPath());

            alerta.setContentText(e.toString());

            alerta.showAndWait();


        }


    }


    //Guardo personas en un fichero

    public void guardaPersonas(File archivo) {


        try {

            //Contexto

            JAXBContext context = JAXBContext.newInstance(Empaquetador.class);

            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);


            //Empaqueto los datos de las personas

            Empaquetador empaquetador = new Empaquetador();

            empaquetador.setPersonas(datosPersona);


            //Marshall y guardo XML a archivo

            m.marshal(empaquetador, archivo);



        } catch (Exception e) { // catches ANY exception

            //Muestro alerta

            Alert alerta = new Alert(Alert.AlertType.ERROR);

            alerta.setTitle("Error");

            alerta.setHeaderText("No se puede guardar en el archivo "+ archivo.getPath());

            alerta.setContentText(e.toString());

            alerta.showAndWait();

        }

    }
    public static void main(String[] args) {
        launch();
    }

    Object getPrimaryStage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
