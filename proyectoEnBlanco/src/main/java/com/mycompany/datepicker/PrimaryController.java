package com.mycompany.datepicker;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;


public class PrimaryController implements Initializable
{

    @FXML
    private DatePicker dtfecha;
    @FXML
    private Label lbl;
    @FXML
    private Button bt;
    
   
    
@FXML
void selectDate(ActionEvent event) {
    if (dtfecha.getValue() != null) {
        lbl.setText(dtfecha.getValue().toString());
    } else {
        lbl.setText("No se ha seleccionado ninguna fecha.");
    }
}

    public PrimaryController()
    //constructor del controlador
    {
        //en el constructor se puede ejecutar código que NO interactúe con la interfaz ya que los
        //controles todavía no están creados. Por ejemplo:
        
        List<Integer> l = new ArrayList<>();
        
        l.add(8);
        l.add(3);
        l.add(5);
        
        l.remove(0); //eliminamos el elemento en la posición 0
        
        System.out.println("Tamaño de la lista: " + l.size());
        
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        
    }
    
    
}
