/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author usuario
 */

@XmlType(propOrder = {"nombreSocio","dirección"})
@XmlRootElement(name="socio")
@XmlAccessorType(XmlAccessType.FIELD)


public class Socio 
{
  @XmlAttribute(required=true)
    private Integer id;
    @XmlElement(name="nombre")
    private String nombreSocio;
    @XmlElement(name="dondevive")
    private String dirección;
    @XmlElement(name="numero")
    private ArrayList<Socio>amigos=new ArrayList<>();

    public Socio()
    {
        
    }
    public Socio(Integer id, String nombre, String dir)
    {
        this.id=id;
        this.nombreSocio=nombre;
        this.dirección=dir;
        this.amigos=amigos;
    
    }
    public void añadirAmigos(Socio Socio)
    {
        amigos.add(Socio);
    }
    
    public String toString()
    {
        return this.id + "; " + this.nombreSocio + "; "+this.dirección+" ;"+this.amigos;
    }
     
}

