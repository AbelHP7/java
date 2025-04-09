/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
/**
 *
 * @author usuario
 */
public class Mavenproject3 {

    public static void main(String[] args) {
       
        Socio s1 = new Socio(1, "Pepe", "C\\ Parra");
        Socio s2 = new Socio(1, "Juan", "C\\ Alto");
        s1.añadirAmigos(s2);
       
       JAXBContext contexto=null;
        try {
            contexto = JAXBContext.newInstance(Socio.class);
        } catch (JAXBException ex) {
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex);
        }
       Marshaller m = null;
        try {
            m = contexto.createMarshaller();
        } catch (JAXBException ex) {
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
        } catch (PropertyException ex) {
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            m.marshal(s1, new FileWriter("socio1.xml"));
        } catch (IOException ex) {
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JAXBException ex) {
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Unmarshaller um=null;
        try {
            um = contexto.createUnmarshaller();
            
        } catch (JAXBException ex) {
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            s2 = (Socio) um.unmarshal(new File("socio1.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(Mavenproject3.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(s2);
        
    }
}
