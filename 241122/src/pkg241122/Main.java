/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg241122;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        int tamañoTablero = 4; // Tamaño del tablero NxN
        String[][] tablero = crearTablero(tamañoTablero);
        boolean[][] descubiertas = new boolean[tamañoTablero][tamañoTablero];
        int intentos = 0, parejasEncontradas = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego Memorión!");

        while (parejasEncontradas < (tamañoTablero * tamañoTablero) / 2) {
            mostrarTablero(tablero, descubiertas);

            System.out.println("Elige la primera celda (fila y columna):");
            int[] primeraCelda = obtenerCoordenadas(sc, tamañoTablero);
            descubiertas[primeraCelda[0]][primeraCelda[1]] = true;

            mostrarTablero(tablero, descubiertas);

            System.out.println("Elige la segunda celda (fila y columna):");
            int[] segundaCelda = obtenerCoordenadas(sc, tamañoTablero);
            descubiertas[segundaCelda[0]][segundaCelda[1]] = true;

            if (tablero[primeraCelda[0]][primeraCelda[1]].equals(tablero[segundaCelda[0]][segundaCelda[1]])) {
                System.out.println("¡Pareja encontrada!");
                parejasEncontradas++;
            } else {
                System.out.println("No coinciden. Intenta nuevamente.");
                descubiertas[primeraCelda[0]][primeraCelda[1]] = false;
                descubiertas[segundaCelda[0]][segundaCelda[1]] = false;
                intentos++;
            }
        }

        System.out.println("¡Felicidades! Has encontrado todas las parejas.");
        System.out.println("Intentos totales: " + intentos);
    }

    // Crear un tablero inicial con pares de letras
    public static String[][] crearTablero(int tamaño) {
        String[][] tablero = new String[tamaño][tamaño];
        String[] simbolos = generarSimbolos((tamaño * tamaño) / 2);
        int indiceSimbolo = 0;

        // Llenar el tablero con pares de símbolos
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                tablero[i][j] = simbolos[indiceSimbolo / 2]; // Cada símbolo aparece 2 veces
                indiceSimbolo++;
            }
        }

        // Mezclar el tablero manualmente
        mezclarTablero(tablero);
        return tablero;
    }

    // Generar una lista de símbolos para las parejas
    public static String[] generarSimbolos(int numeroDePares) {
        String[] simbolos = new String[numeroDePares];
        char letra = 'A';
        for (int i = 0; i < numeroDePares; i++) {
            simbolos[i] = String.valueOf(letra);
            letra++;
        }
        return simbolos;
    }

    // Mezclar el tablero de manera manual
    public static void mezclarTablero(String[][] tablero) {
        int tamaño = tablero.length;
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                int filaAleatoria = (int) (Math.random() * tamaño);
                int columnaAleatoria = (int) (Math.random() * tamaño);

                // Intercambiar elementos
                String temp = tablero[i][j];
                tablero[i][j] = tablero[filaAleatoria][columnaAleatoria];
                tablero[filaAleatoria][columnaAleatoria] = temp;
            }
        }
    }

    // Mostrar el tablero al jugador
    public static void mostrarTablero(String[][] tablero, boolean[][] descubiertas) {
        int tamaño = tablero.length;
        System.out.print("  ");
        for (int i = 0; i < tamaño; i++) System.out.print((i + 1) + " ");
        System.out.println("");

        for (int i = 0; i < tamaño; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < tamaño; j++) {
                if (descubiertas[i][j]) {
                    System.out.print(tablero[i][j] + " ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
            
        }
    }

    // Obtener coordenadas válidas del usuario
    public static int[] obtenerCoordenadas(Scanner scanner, int tamaño) {
        int fila, columna;
     
        while (true) {
            do
            {
            System.out.println("Introduce fila (1-" + tamaño + "):");
            fila = scanner.nextInt() - 1;
            System.out.println("Introduce columna (1-" + tamaño + "):");
            columna = scanner.nextInt() - 1;
            }while(fila >= 0 && fila < tamaño && columna >= 0 && columna < tamaño);
            
            System.out.println("Coordenadas inválidas. Intenta de nuevo:");
        }
        
    }
}

    
