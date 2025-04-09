package com.mycompany.libretadirecciones;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    public void start(Stage escenarioPrincipal) {
         try {
            FXMLLoader vista = new FXMLLoader(LibretaDirecciones.class.getResource("VistaPrincipal.fxml"));
            
            contenedorPrincipal = vista.load();
            
            escenaPrincipal = new Scene(contenedorPrincipal);
            
            escenarioPrincipal.setScene(escenaPrincipal);
            escenarioPrincipal.setTitle("Libreta de direcciones");
            escenarioPrincipal.show();
        
            muestraVistaPersona();

         } catch (Exception ex) {
              System.out.println(ex.getMessage());
         }
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
     
    public static void main(String[] args) {
        launch();
    }
}
