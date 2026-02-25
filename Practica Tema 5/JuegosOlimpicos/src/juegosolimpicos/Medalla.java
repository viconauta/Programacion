/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosolimpicos;

/**
 *
 * @author EAG
 */
public class Medalla { //terminado
    //atributos
    private TipoMedalla tipo;
    private Participante participante;
    private Prueba prueba;
    private static int contadorMedallas = 0;
    
    //constructores
    //defecto
    public Medalla() {
        this.tipo = TipoMedalla.Sin_medalla;
        this.participante = null;
        this.prueba = null;
        contadorMedallas++;
    }
    
    //parametros
    public Medalla(TipoMedalla t, Participante p, Prueba pr) {
        this.tipo = t;
        this.participante = p;
        this.prueba = pr;
        contadorMedallas++;
    }
    
    //copia
    public Medalla(Medalla m) {
        this.tipo = m.tipo;
        this.participante = m.participante;
        this.prueba = m.prueba;
        contadorMedallas++;
    }
    
    //getters
    public TipoMedalla getTipo() {
        return this.tipo;
    }

    public Participante getParticipante() {
        return this.participante;
    }

    public Prueba getPrueba() {
        return this.prueba;
    }

    public static int getContadorMedallas() {
        return contadorMedallas;
    }
    
    //setters
    public void setTipo(TipoMedalla tipo) {
        this.tipo = tipo;
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
        return "Tipo de medalla: " + this.tipo + 
                "\n Participante: " + this.participante +
                "\n Prueba: " + this.prueba +
                "\n Contador de medallas: " + contadorMedallas;
    }
}
