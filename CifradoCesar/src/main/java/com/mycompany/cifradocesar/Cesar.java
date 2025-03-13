/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cifradocesar;

/**
 *
 * @author usuario
 */
 public class Cesar {
    private String msg; // Mensaje que se va a cifrar
    private int num;    // Número de posiciones para el cifrado

    // Constructor para inicializar el mensaje y el número
    Cesar(String msg, int num) 
    {
        this.msg = msg;
        this.num = num;
    }

    // Método para cifrar el mensaje
    String cifrar() {
        StringBuilder resultado = new StringBuilder(); // Para construir el mensaje cifrado

        // Iterar sobre cada carácter del mensaje
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i); // Obtener el carácter actual

            // Si es una letra mayúscula
            if (Character.isUpperCase(c)) {
                char cifrado = (char) ((c - 'A' + num) % 26 + 'A');
                resultado.append(cifrado);
            }
            // Si es una letra minúscula
            else if (Character.isLowerCase(c)) {
                char cifrado = (char) ((c - 'a' + num) % 26 + 'a');
                resultado.append(cifrado);
            }
            // Si no es una letra, añadirlo sin cifrar
            else {
                resultado.append(c);
            }
        }

        System.out.println("Mensaje cifrado: " + resultado.toString()); // Mostrar el mensaje cifrado
        return resultado.toString(); // Retornar el mensaje cifrado
        
    }
    
}

/*
    public class Cesar {
    private String msg; // Mensaje que se va a cifrar
    private int num;    // Número de posiciones para el cifrado

    // Constructor para inicializar el mensaje y el número
    Cesar(String msg, int num) 
    {
        this.msg = msg;
        this.num = num;
    }

    // Método para cifrar el mensaje
    String cifrar() {
        StringBuilder resultado = new StringBuilder(); // Para construir el mensaje cifrado

        // Iterar sobre cada carácter del mensaje
        for (int i = 0; i < msg.length(); i++) {
            char c = msg.charAt(i); // Obtener el carácter actual

            // Si es una letra mayúscula
            if (Character.isUpperCase(c)) {
                char cifrado = (char) ((c - 'A' + num) % 26 + 'A');
                resultado.append(cifrado);
            }
            // Si es una letra minúscula
            else if (Character.isLowerCase(c)) {
                char cifrado = (char) ((c - 'a' + num) % 26 + 'a');
                resultado.append(cifrado);
            }
            // Si no es una letra, añadirlo sin cifrar
            else {
                resultado.append(c);
            }
        }

        System.out.println("Mensaje cifrado: " + resultado.toString()); // Mostrar el mensaje cifrado
        return resultado.toString(); // Retornar el mensaje cifrado
        
    }
    
}
*/