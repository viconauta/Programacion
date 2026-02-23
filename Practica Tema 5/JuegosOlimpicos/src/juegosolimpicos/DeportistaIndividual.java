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
public class DeportistaIndividual extends Participante { //falta repasar metodo de medallas y terminar mostrar info y to string
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
        super(nombreP, pais, edad, numId, totalMedallas, medallas);
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
        
    }
    
    //to string
    @Override
    public String toString() {
        
    }
}
