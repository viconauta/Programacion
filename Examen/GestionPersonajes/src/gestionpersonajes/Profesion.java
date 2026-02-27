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
public abstract class Profesion {
    //atributos
    private String nombre;
    
    //constructores
    //defecto
    public Profesion() {
        this.nombre = "Sin nombre";
    }
    
    //parametros
    public Profesion(String nombre) {
        this.nombre = nombre;
    }
    
    //copia
    public Profesion(Profesion p) {
        this.nombre = p.nombre;
    }
    
    //getters
    public String getNombre() {
        return this.nombre;
    }
    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodo abstracto
    public abstract void aplicarModificadores(Personaje p);
    
    //to string
    @Override
    public String toString() {
        return "Nombre: " + this.nombre;
    }
}
