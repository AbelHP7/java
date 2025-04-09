/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._ejercicio3deejerciciosdemapas;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author usuario
 */
public class Agenda {
    private TreeMap<LocalDateTime, String> eventos;

    public Agenda() {
        eventos = new TreeMap<>();
    }

    // Insertar un evento con fecha, hora y descripción
    public void insertarEvento(LocalDateTime fechaHora, String descripcion) {
        eventos.put(fechaHora, descripcion);
    }

    // Consultar eventos de un día específico
    public List<Map.Entry<LocalDateTime, String>> consultarEventosDelDia(LocalDateTime fecha) {
        LocalDateTime inicio = fecha.toLocalDate().atStartOfDay();
        LocalDateTime fin = fecha.toLocalDate().atTime(23, 59);
        return new ArrayList<>(eventos.subMap(inicio, true, fin, true).entrySet());
    }

    // Consultar eventos entre dos horas en un mismo día
    public List<Map.Entry<LocalDateTime, String>> consultarEventosEntreHoras(LocalDateTime fecha, int desde, int hasta) {
        LocalDateTime inicio = fecha.toLocalDate().atTime(desde, 0);
        LocalDateTime fin = fecha.toLocalDate().atTime(hasta, 59);
        return new ArrayList<>(eventos.subMap(inicio, true, fin, true).entrySet());
    }

    // Eliminar eventos entre dos fechas y horas
    public void eliminarEventosEntreFechas(LocalDateTime desde, LocalDateTime hasta) {
        eventos.subMap(desde, true, hasta, true).clear();
    }
}

