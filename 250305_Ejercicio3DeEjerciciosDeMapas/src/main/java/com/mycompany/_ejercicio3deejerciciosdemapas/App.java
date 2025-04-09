/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio3deejerciciosdemapas;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
           Agenda agenda = new Agenda();

        // Agregar eventos
        agenda.insertarEvento(LocalDateTime.of(2025, 3, 15, 10, 0), "Reunión de trabajo");
        agenda.insertarEvento(LocalDateTime.of(2025, 3, 15, 14, 30), "Almuerzo con amigos");
        agenda.insertarEvento(LocalDateTime.of(2025, 3, 16, 9, 0), "Visita al médico");

        // Consultar eventos del 15 de marzo de 2025
        System.out.println("Eventos del 15 de marzo de 2025:");
        for (var evento : agenda.consultarEventosDelDia(LocalDateTime.of(2025, 3, 15, 0, 0))) {
            System.out.println(evento.getKey() + " - " + evento.getValue());
        }

        // Consultar eventos entre las 9 y 15 horas del 15 de marzo de 2025
        System.out.println("\nEventos entre 9:00 y 15:00 del 15 de marzo de 2025:");
        for (var evento : agenda.consultarEventosEntreHoras(LocalDateTime.of(2025, 3, 15, 0, 0), 9, 15)) {
            System.out.println(evento.getKey() + " - " + evento.getValue());
        }

        // Eliminar eventos entre dos fechas
        agenda.eliminarEventosEntreFechas(LocalDateTime.of(2025, 3, 15, 10, 0), LocalDateTime.of(2025, 3, 15, 15, 0));

        // Mostrar agenda después de la eliminación
        System.out.println("\nEventos después de eliminar entre 10:00 y 15:00 del 15 de marzo de 2025:");
        for (var evento : agenda.consultarEventosDelDia(LocalDateTime.of(2025, 3, 15, 0, 0))) {
            System.out.println(evento.getKey() + " - " + evento.getValue());
        }
    }
}

          
          
    
