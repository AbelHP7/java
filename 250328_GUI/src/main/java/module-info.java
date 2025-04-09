module com.mycompany._gui {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany._gui to javafx.fxml;
    exports com.mycompany._gui;
}
