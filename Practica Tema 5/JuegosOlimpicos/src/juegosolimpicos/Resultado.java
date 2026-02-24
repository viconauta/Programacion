/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosolimpicos;

/**
 *
 * @author anton
 */
public class Resultado {
    //atributos
    private int posicion;
    private Participante participante;
    private Prueba prueba;
    
    //constructores
    //defecto
    public Resultado() {
        this.posicion = 10;
        this.participante = null;
        this.prueba = null;
    }
    
    //parametros
    public Resultado(int pos, Participante p, Prueba pru) {
        this.posicion = pos;
        this.participante = p;
        this.prueba = pru;
    }
    
    //copia
    public Resultado(Resultado r) {
        this.posicion = r.posicion;
        this.participante = r.participante;
        this.prueba = r.prueba;
    }
    
    //getters
    public int getPosicion() {
        return this.posicion;
    }

    public Participante getParticipante() {
        return this.participante;
    }

    public Prueba getPrueba() {
        return this.prueba;
    }
 
    //setters
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public void setPrueba(Prueba prueba) {
        this.prueba = prueba;
    }
    
    //to string
    @Override
public String toString() {
    return "Posicion: " + this.posicion +
           "\n Participante: " + this.participante.getNombre() +
           "\n Prueba: " + this.prueba.getNombre();
}

}
