/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividad.resuelta.pkg7.pkg1.pag.pkg215;

/**
 *
 * @author usuario
 */
public class ActividadResuelta71Pag215 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c;
        c=new CuentaCorriente("7432678A", "Juan");
        c.ingreso(1500);
        c.SacarDinero(200);
        c.mostrarTuInformación();
    }
}
