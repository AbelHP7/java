/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.libretadirecciones;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class VistaPrincipalController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private LibretaDirecciones libretaDirecciones;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setLibretaDirecciones(LibretaDirecciones libretaDirecciones) 
    {
        this.libretaDirecciones = libretaDirecciones;
    }
}
