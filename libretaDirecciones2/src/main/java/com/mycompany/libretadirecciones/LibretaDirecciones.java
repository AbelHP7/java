package com.mycompany.libretadirecciones;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
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
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;

public class LibretaDirecciones extends Application {

     private static Scene escenaPrincipal;
     
     private BorderPane contenedorPrincipal;

     private AnchorPane vistaPersona;

     private ConectorSQL conexionSql;

     
     private ObservableList datosPersona = FXCollections.observableArrayList();

     //Datos de ejemplo

    public LibretaDirecciones(){

    }

    //Método para devolver los datos como lista observable de persona
    public ObservableList getDatosPersona() {

        return datosPersona;

    }



   @Override

    public void start(Stage escenarioPrincipal) throws IOException, SQLException {

            //Establezco conexión con la base de datos local
            conexionSql = new ConectorSQL("jdbc:mysql://127.0.0.1:3306/dam?useSSL=false", "dam", "dam");
            //Cargo personas de la base de datos (borrando las anteriores)
            datosPersona.clear();
            datosPersona.addAll(conexionSql.getPersonas());
            
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
            
            //Guardar en la base de datos
            conexionSql.putPersonas(datosPersona);



        } catch (Exception e) { // catches ANY exception

            //Muestro alerta

            Alert alerta = new Alert(Alert.AlertType.ERROR);

            alerta.setTitle("Error");

            alerta.setHeaderText("No se puede guardar en el archivo "+ archivo.getPath());

            alerta.setContentText(e.toString());

            alerta.showAndWait();

        }

    }
    public void crearGrafico() {

        //Cargo la vista estadísticas
       
         try {
            Scene escenaGrafico;
            FXMLLoader vista = new FXMLLoader(LibretaDirecciones.class.getResource("VistaEstadisticas.fxml"));
            escenaGrafico = new Scene(vista.load());
            
             //Inicializo un nuevo escenario y asigno el principal
            Stage escenarioEstadisticas = new Stage();
            escenarioEstadisticas.setScene(escenaGrafico);
            escenarioEstadisticas.setTitle("Estadísticas");
            
            escenarioEstadisticas.getIcons().add(new Image("file:./src/main/resources/com/mycompany/LibretaDirecciones/iconoStats32.png")); //Ojo con la ruta!!
                
            escenarioEstadisticas.initModality(Modality.WINDOW_MODAL);
            
            //Asigno el controlador
            VistaEstadisticasController controller = vista.getController();
            
            controller.setDatosPersona(datosPersona);
            
            //Muestro el escenario
            escenarioEstadisticas.show();
            
         } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
          
    }
    
    public void crearPDF() throws IOException{

        //Creo un nuevo documento, una página y la añado
        PDDocument documento = new PDDocument();
        PDPage pagina = new PDPage();
        documento.addPage(pagina);
        documento.getPage(0);

        //Inicio un nuevo stream de contenido
        PDPageContentStream contentStream = new PDPageContentStream(documento, pagina);

        //Establezco la posición Y de la primera líena y el tipo de fuente
        int linea = 700;
        contentStream.setFont(new PDType1Font(Standard14Fonts.FontName.TIMES_ROMAN), 12);

        //Recorro la lista de personas
        List<Persona> personas = datosPersona;
        for (Persona p : personas)
        {
            //Inicio un nuevo texto y escribo los datos
            contentStream.beginText();
                contentStream.newLineAtOffset(25, linea);
                contentStream.showText(p.getNombre()+" ");
                contentStream.showText(p.getApellidos()+" ");
                contentStream.showText(p.getDireccion()+" ");
            contentStream.endText();
            //Cambio de línea
            linea -= 25;
        }

        //Cierro el content stream
        contentStream.close();

        //INicio el file chooser
        FileChooser fileChooser = new FileChooser();

        //Filtro para la extensión
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter(
                "PDF files (*.pdf)", "*.pdf");
        fileChooser.getExtensionFilters().add(extFilter);

        //Muestro el diálogo de guardar
        File archivo = fileChooser.showSaveDialog(getPrimaryScene().getWindow());


        if (archivo != null) {

            //Me aseguro de que tiene la extensión correcta y si no la cambio
            String extension = "";
            if (!archivo.getPath().endsWith(extension)){
                extension = ".pdf";
            }
            //Escribo en el archivo y lo cierro
            archivo = new File(archivo.getPath() + extension);
            documento.save(archivo);
            documento.close();

        }
    }

    public static void main(String[] args) {
        launch();
    }

    public Scene getPrimaryScene() {
        return escenaPrincipal;
    }
}
