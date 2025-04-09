module com.mycompany.proyectoFXML {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyectoFXML to javafx.fxml;
    exports com.mycompany.proyectoFXML;
}
