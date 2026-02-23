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
public class Equipo extends Participante { //falta terminar los metodos y el to string
    //atributos
    private String nombreE;
    private Participante[] participantes;
    
    //constructores
    //defecto
    public Equipo() {
        super();
        this.nombreE = "Sin nombre";
        this.participantes = new Participante[0];
        //falta por implementar que un deportista solo puede pertenecer a un equipo en los constructores y setters, 
        //hace falta meter el atributo equipo en el padre para poder hacer la comprobacion
    }
    
    //parametros
    public Equipo(String nombreP, String pais, int edad, int numId, int totalMedallas, Medalla[] medallas, String nombre, Participante[] participante) {
        super(nombreP, pais, edad, numId, totalMedallas, medallas);
        this.nombreE = nombre;
        this.participantes = participante.clone();
    }
    
    //copia
    public Equipo(Equipo e) {
        super(e);
        this.nombreE = e.nombreE;
        this.participantes = e.participantes.clone();
    }
    
    //getters
    public String getNombreE() {
        return this.nombreE;
    }

    public Participante[] getParticipantes() {
        return this.participantes;
    }
    
    //setters
    public void setNombreE(String n) {
        this.nombreE = n;
    }

    public void setParticipantes(Participante[] p) {
        this.participantes = p.clone();
    }
    
    //metodos
    @Override
    public int calcularTotalMedallas() {
        int total = 0;
        for(int i = 0; i < this.participantes.length; i++) {
            if(this.participantes[i] != null){
                total += this.participantes[i].getNumTotalMedallas();
            } 
        }
        return total;
    }
    
    @Override
    public String mostrarInformacion() {
        
    }
    
    //to string
    @Override
    public String toString() {
        
    }
}
