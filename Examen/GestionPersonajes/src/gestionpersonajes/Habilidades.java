/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionpersonajes;

/**
 *
 * @author EAG
 */
public class Habilidades {
    //atributos
    private int fuerza, destreza, constitucion, inteligencia, poder, carisma;
    
    //constructores
    //defecto
    public Habilidades() {
        int random = (int)(Math.random() * (80 - 20 + 1)) + 20;
        this.fuerza = random;
        
        random = (int)(Math.random() * (80 - 20 + 1)) + 20;
        this.destreza = random;
        
        random = (int)(Math.random() * (80 - 20 + 1)) + 20;
        this.constitucion = random;
        
        random = (int)(Math.random() * (80 - 20 + 1)) + 20;
        this.inteligencia = random;
        
        random = (int)(Math.random() * (80 - 20 + 1)) + 20;
        this.poder = random;
        
        random = (int)(Math.random() * (80 - 20 + 1)) + 20;
        this.carisma = random;
    }
    
    //copia
    public Habilidades(Habilidades h) {
        this.fuerza = h.fuerza;
        this.destreza = h.destreza;
        this.constitucion = h.constitucion;
        this.inteligencia = h.inteligencia;
        this.poder = h.poder;
        this.carisma = h.carisma;
    }
    
    //getters
    public int getFuerza() {
        return this.fuerza;
    }

    public int getDestreza() {
        return this.destreza;
    }

    public int getConstitucion() {
        return this.constitucion;
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public int getPoder() {
        return this.poder;
    }

    public int getCarisma() {
        return this.carisma;
    }
    
    //setters
    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
 
    //to string
    @Override
    public String toString() {
        return "Fuerza: " + this.fuerza +
                "\n Destreza: " + this.destreza + 
                "\n Constitucion: " + this.constitucion + 
                "\n Inteligencia: " + this.inteligencia + 
                "\n Poder: " + this.poder +
                "\n Carisma: " + this.carisma;
    }
}
