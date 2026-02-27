/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonajes;
import java.util.Scanner;
/**
 *
 * @author EAG
 */
public class GestionPersonajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //pedimos los nombres por teclado
        System.out.println("Escribe el nombre del primer personaje:");
        String teclado1 = sc.nextLine();
        System.out.println("Escribe el nombre del segundo personaje:");
        String teclado2 = sc.nextLine();
        System.out.println("Escribe el nombre del tercer personaje:");
        String teclado3 = sc.nextLine();
        
        //creamos los personajes
        Personaje p1 = new Personaje(teclado1);
        Personaje p2 = new Personaje(teclado2, new Academico(teclado2));
        Personaje p3 = new Personaje(teclado3, new Artista(teclado3));
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
}
