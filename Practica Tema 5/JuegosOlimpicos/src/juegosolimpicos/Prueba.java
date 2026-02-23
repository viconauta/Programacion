/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosolimpicos;
import java.time.LocalDate;
/**
 *
 * @author EAG
 */
public class Prueba { //faltan los metodos
    //atributos
    private String nombre, resultadoFinal;
    private LocalDate fechaCelebracion;
    private Participante[] listaParticipantes;
    private Medalla[] medallasAsignadas;
    
    //constructores
    //defecto
    public Prueba() {
        this.nombre = "Sin nombre";
        this.resultadoFinal = "Sin resultados";
        this.fechaCelebracion = null;
        this.listaParticipantes = new Participante[0];
        this.medallasAsignadas = new Medalla[0];
    }
    
    //parametros
    public Prueba(String n, String rf, LocalDate d, Participante[] p, Medalla[] m) {
        this.nombre = n;
        this.resultadoFinal = rf;
        this.fechaCelebracion = d;
        this.listaParticipantes = p.clone();
        this.medallasAsignadas = m.clone();
    }
    
    //copia
    public Prueba(Prueba p) {
        this.nombre = p.nombre;
        this.resultadoFinal = p.resultadoFinal;
        this.fechaCelebracion = p.fechaCelebracion;
        this.listaParticipantes = p.listaParticipantes.clone();
        this.medallasAsignadas = p.medallasAsignadas.clone();
    }

    //getters
    public String getNombre() {
        return this.nombre;
    }

    public String getResultadoFinal() {
        return this.resultadoFinal;
    }

    public LocalDate getFechaCelebracion() {
        return this.fechaCelebracion;
    }

    public Participante[] getListaParticipantes() {
        return this.listaParticipantes.clone();
    }

    public Medalla[] getMedallasAsignadas() {
        return this.medallasAsignadas.clone();
    }
    
    //setters
    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setResultadoFinal(String rf) {
        this.resultadoFinal = rf;
    }

    public void setFechaCelebracion(LocalDate f) {
        this.fechaCelebracion = f;
    }

    public void setListaParticipantes(Participante[] p) {
        this.listaParticipantes = listaParticipantes.clone();
    }

    public void setMedallasAsignadas(Medalla[] m) {
        this.medallasAsignadas = medallasAsignadas.clone();
    }
    
    //metodos 
    
    
    //toString
    @Override
    public String toString() {
        
    }
    
}
