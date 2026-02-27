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
public class Gremio {
    //atributos
    private String nombre;
    private Personaje[] miembros;
    
    //constructores
    //defecto
    public Gremio() {
        this.nombre = "Sin nombre";
        this.miembros = new Personaje[0];
    }
    
    //parametros
    public Gremio(String nombre, Personaje[] p) {
        this.nombre = nombre;
        this.miembros = p.clone();
    }
    
    //copia
    public Gremio(Gremio g) {
        this.nombre = g.nombre;
        this.miembros = g.miembros.clone();
    }
    
    //getters
    public String getNombre() {
        return this.nombre;
    }

    public Personaje[] getMiembros() {
        return this.miembros.clone();
    }
    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //metodo
    public void añadirPersonaje(Personaje p) {
        Personaje[] array = new Personaje[this.miembros.length + 1];
        for(int i = 0; i < this.miembros.length; i++) {
            array[i] = this.miembros[i];
        }
        array[this.miembros.length] = p;
        p.setGremio(this);
        this.miembros = array;
    }
    
    //to string
    @Override
    public String toString() {
        String imprimir = "Nombre del gremio: " + this.nombre +
                "Lista de miembros: \n";
        for(int i = 0; i < this.miembros.length; i++) {
            imprimir += "- " + this.miembros[i];
        }
        return imprimir;
    }
}
