module com.mycompany.proyectosegundotrimestre {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyectosegundotrimestre to javafx.fxml;
    exports com.mycompany.proyectosegundotrimestre;
}
