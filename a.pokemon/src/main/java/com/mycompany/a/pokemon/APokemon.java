/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.a.pokemon;

/**
 *
 * @author usuario
 */
public class APokemon {

    public static void main(String[] args) {
    
        Pokemon pokemon = new Pichu("Abel");

        while (!(pokemon instanceof Raichu)) {
            pokemon.ataqueRapido();

            if (pokemon.experiencia >= 100 && pokemon instanceof Pichu) {
                pokemon = new Pikachu(pokemon.entrenador, pokemon.experiencia, pokemon.salud);
                System.out.println("¡Felicidades! Tu Pichu ha evolucionado a Pikachu!");
            } 
            else
            { 
                if (pokemon.experiencia >= 200 && pokemon instanceof Pikachu)
                {
                    pokemon = new Raichu(pokemon.entrenador, pokemon.experiencia, pokemon.salud);
                    System.out.println("¡Felicidades! Tu Pikachu ha evolucionado a Raichu!");
                }
            }
        }
        pokemon.mostrar();
    
    }
    
    
        
    
    public void Evolucionar(){
        //aqui deberia pasar el daño y ya evolucionarlo desde aqui pero no me ha dado tiempo 
    }
}


