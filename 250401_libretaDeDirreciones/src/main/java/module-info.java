module com.mycompany._libretadedirreciones {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany._libretadedirreciones to javafx.fxml;
    exports com.mycompany._libretadedirreciones;
}
