/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosolimpicos;

/**
 *
 * @author anton
 */
public class Deporte {
    //atributos
    private String nombre;
    private TipoDeporte tipo;
    private int numMaxParticipantes;
    private Prueba[] conjuntoPruebas;
    
    //constructores
    //defecto
    public Deporte() {
        this.nombre = "Sin nombre";
        this.tipo = TipoDeporte.Sin_tipo;
        this.numMaxParticipantes = 10;
        this.conjuntoPruebas = new Prueba[0];
    }
    
    //parametros
    public Deporte(String n, TipoDeporte t, int num, Prueba[] c) {
        this.nombre = n;
        this.tipo = t;
        this.numMaxParticipantes = num;
        this.conjuntoPruebas = c.clone();
    }
    
    //copia
    public Deporte(Deporte d) {
        this.nombre = d.nombre;
        this.tipo = d.tipo;
        this.numMaxParticipantes = d.numMaxParticipantes;
        this.conjuntoPruebas = d.conjuntoPruebas.clone();
    }
    
    //getters
    public String getNombre() {
        return this.nombre;
    }
    
    public TipoDeporte getTipo() {
        return this.tipo;
    }
    
    public int getNumMaxParticipantes() {
        return this.numMaxParticipantes;
    }
    
    public Prueba[] getConjuntoPruebas() {
        return this.conjuntoPruebas.clone();
    }
    
    //setters
    public void setNombre(String n) {
        this.nombre = n;
    }
    
    public void setTipo(TipoDeporte t) {
        this.tipo = t;
    }
    
    public void setNumMaxParticipantes(int n) {
        this.numMaxParticipantes = n;
    }
    
    public void setConjuntoPruebas(Prueba[] c) {
        this.conjuntoPruebas = c.clone();
    }
    
    //to string
    @Override
    public String toString() {
        String imprimir = "Nombre: " + this.nombre +
                "\n Tipo: " + this.tipo +
                "\n Numero maximo de participantes: " + this.numMaxParticipantes + 
                "Lista de pruebas: \n";
        for(int i = 0; i < this.conjuntoPruebas.length; i++) {
            if(this.conjuntoPruebas[i] != null){
                imprimir += this.conjuntoPruebas[i] + "\n";
            }
        }
        return imprimir;
    }
}
