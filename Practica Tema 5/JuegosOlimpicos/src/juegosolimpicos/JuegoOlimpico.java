/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegosolimpicos;

/**
 *
 * @author anton
 */
public class JuegoOlimpico { //faltan los metodos y el to string
    //atributos
    private String nombreEvento, ciudadSede;
    private int anio;
    private Participante[] listaParticipantes;
    private Deporte[] listaDeportes;
    
    //constructores
    //defecto
    public JuegoOlimpico() {
        this.nombreEvento = "Sin nombre";
        this.anio = 2026;
        this.ciudadSede = "Sin ciudad";
        this.listaParticipantes = new Participante[0];
        this.listaDeportes = new Deporte[0];
    }
    
    //parametros
    public JuegoOlimpico(String n, int anio, String ciudad, Participante[] p, Deporte[] d) {
        this.nombreEvento = n;
        this.anio = anio;
        this.ciudadSede = ciudad;
        this.listaParticipantes = p.clone();
        this.listaDeportes = d.clone();
    }
    
    //copia
    public JuegoOlimpico(JuegoOlimpico jo) {
        this.nombreEvento = jo.nombreEvento;
        this.anio = jo.anio;
        this.ciudadSede = jo.ciudadSede;
        this.listaParticipantes = jo.listaParticipantes.clone();
        this.listaDeportes = jo.listaDeportes.clone();
    }
    
    //getters
    public String getNombreEvento() {
        return this.nombreEvento;
    }
    
    public int getAnio() {
        return this.anio;
    }
    
    public String getCiudadSede() {
        return this.ciudadSede;
    }
    
    public Participante[] getListaParticipantes() {
        return this.listaParticipantes.clone();
    }
    
    public Deporte[] getListaDeportes() {
        return this.listaDeportes.clone();
    }
    
    //setters
    public void setNombreEvento(String n) {
        this.nombreEvento = n;
    }
    
    public void setAnio(int a) {
        this.anio = a;
    }
    
    public void setCiudadSede(String c) {
        this.ciudadSede = c;
    }
    
    public void setListaParticipantes(Participante[] p) {
        this.listaParticipantes = p.clone();
    }
    
    public void setListaDeportes(Deporte[] d) {
        this.listaDeportes = d.clone();
    }
    
    //metodos
}
