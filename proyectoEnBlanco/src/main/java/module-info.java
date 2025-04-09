module com.mycompany.datepicker{
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.datepicker to javafx.fxml;
    exports com.mycompany.datepicker;
}
