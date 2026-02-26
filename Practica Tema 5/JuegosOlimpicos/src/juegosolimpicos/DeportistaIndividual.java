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
public class DeportistaIndividual extends Participante {
    //atributos
    private String especialidad;
    
    //constructores
    //defecto
    public DeportistaIndividual() {
        super();
        this.especialidad = "Sin especialidad";
    }
    
    //parametros
    public DeportistaIndividual(String nombreP, String pais, int edad, int numId, int totalMedallas, Medalla[] medallas, String esp) {
        super(nombreP, pais, edad, numId, medallas);
        this.especialidad = esp;
    }
    
    //copia
    public DeportistaIndividual(DeportistaIndividual d) {
        super(d);
        this.especialidad = d.especialidad;
    }
    
    //getters
    public String getEspecialidad() {
        return this.especialidad;
    }
    
    //setters
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //metodos
    @Override
    public int calcularTotalMedallas() {
        int num = super.numTotalMedallas;
        return num;
    }
    
    @Override
    public String mostrarInformacion() {
        return "Deportista individual: " + this.nombreP +
               "\nPais: " + this.pais +
               "\nEdad: " + this.edad +
               "\nID Olimpico: " + this.numIdOlimpico +
               "\nEspecialidad: " + this.especialidad +
               "\nTotal medallas: " + this.numTotalMedallas;
    }

    //to string
    @Override
    public String toString() {
        String imprimir = "Deportista individual:\n" +
                          "Nombre: " + this.nombreP +
                          "\nPais: " + this.pais +
                          "\nEdad: " + this.edad +
                          "\nID Olimpico: " + this.numIdOlimpico +
                          "\nEspecialidad: " + this.especialidad +
                          "\nTotal medallas: " + this.numTotalMedallas +
                          "\nMedallas:\n";
        for (int i = 0; i < this.medallas.length; i++) {
            if (this.medallas[i] != null) {
                imprimir += "- " + this.medallas[i].getTipo() + "\n";
            }
        }
        return imprimir;
    }
}
