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
public class Personaje {
    //atributos
    private String nombre;
    private Habilidades habilidades;
    private Profesion profesion;
    private Gremio gremio;
    
    //constructores
    //defecto
    public Personaje() {
        this.nombre = "Sin nombre";
        this.habilidades = new Habilidades();
        this.profesion = new Explorador();
    }
    
    //profesion por defecto
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.habilidades = new Habilidades();
        this.profesion = new Explorador();
    }
    
    //parametros
    public Personaje(String nombre, Profesion profesion) {
        this.nombre = nombre;
        this.habilidades = new Habilidades();
        this.profesion = profesion;
    }
    
    //copia
    public Personaje(Personaje p) {
        this.nombre = p.nombre;
        this.habilidades = p.habilidades;
        this.profesion = p.profesion;
    }
    
    //getters
    public String getNombre() {
        return this.nombre;
    }

    public Habilidades getHabilidades() {
        return this.habilidades;
    }

    public Profesion getProfesion() {
        return this.profesion;
    }

    public Gremio getGremio() {
        return this.gremio;
    }
    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesion(Profesion profesion) {
        this.profesion = profesion;
    }

    public void setGremio(Gremio gremio) {
        this.gremio = gremio;
    }
    
    //to string
    @Override
    public String toString() {
        return "Nombre: " + this.nombre +
                "\n Habilidades: " + this.habilidades.toString() +
                "\n Profesion: \n" + this.profesion + 
                "\n Gremio: " + this.gremio;
    }
}
