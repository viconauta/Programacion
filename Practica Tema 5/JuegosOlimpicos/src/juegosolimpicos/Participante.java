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
public abstract class Participante {
    //atributos
    protected String nombreP, pais;
    protected int edad, numIdOlimpico, numTotalMedallas = 0;
    protected Medalla[] medallas;
    private boolean perteneceAEquipo = false;
    
    //constructores
    //defecto
    public Participante() {
        this.nombreP = "Sin nombre";
        this.pais = "Sin pais";
        this.edad = 18;
        this.numIdOlimpico = 12345;
        this.medallas = new Medalla[0];
    }
    
    //parametros
    public Participante(String n, String p, int e, int id, Medalla[] med) {
        this.nombreP = n;
        this.pais = p;
        this.edad = e;
        this.numIdOlimpico = id;
        this.medallas = med.clone();
    }
    
    //copia
    public Participante(Participante p) {
        this.nombreP = p.nombreP;
        this.pais = p.pais;
        this.edad = p.edad;
        this.numIdOlimpico = p.numIdOlimpico;
        this.numTotalMedallas = p.numTotalMedallas;
        this.medallas = p.medallas.clone();
        this.perteneceAEquipo = p.perteneceAEquipo;
    }
    
    //getters
    public String getNombre() {
        return this.nombreP;
    }

    public String getPais() {
        return this.pais;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getNumIdOlimpico() {
        return this.numIdOlimpico;
    }

    public int getNumTotalMedallas() {
        return this.numTotalMedallas;
    }

    public Medalla[] getMedallas() {
        return this.medallas.clone();
    }
    
    public boolean getPertenceAEquipo() {
        return this.perteneceAEquipo;
    }
    
    //setters
    public void setNombre(String n) {
        this.nombreP = n;
    }

    public void setPais(String p) {
        this.pais = p;
    }

    public void setEdad(int e) {
        this.edad = e;
    }

    public void setNumIdOlimpico(int num) {
        this.numIdOlimpico = num;
    }

    public void setMedallas(Medalla[] m) {
        this.medallas = m.clone();
    }
    
    public void setPerteneceAEquipo(boolean p) {
        this.perteneceAEquipo = p;
    }
    
    //metodos
    public void anadirMedalla(Medalla m) {
        Medalla[] nuevo = new Medalla[this.medallas.length + 1];
        for (int i = 0; i < this.medallas.length; i++) {
            nuevo[i] = this.medallas[i];
        }
        nuevo[medallas.length] = m;
        this.medallas = nuevo;
        this.numTotalMedallas++;
        }

    public abstract int calcularTotalMedallas();
    
    public abstract String mostrarInformacion();
    
    //to string
    public String toString() {
        String imprimir = "Participante: \n" + 
                "Nombre: " + this.nombreP +
                "\n Pais: " + this.pais + 
                "\n Edad: " + this.edad + 
                "\n Id olimpico: " + this.numIdOlimpico +
                "\n Numero total de medallas: " + this.numTotalMedallas +
                "\nMedallas: \n";
        for(int i = 0; i < this.medallas.length; i++) {
            if(this.medallas[i] != null) {
                imprimir += "Medalla " + (i + 1) + this.medallas[i];
            }
        }
        return imprimir;
    }
}
