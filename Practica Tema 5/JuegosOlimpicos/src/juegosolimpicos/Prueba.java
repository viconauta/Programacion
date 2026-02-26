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
public class Prueba { //terminada
    //atributos
    private String nombre;
    private Resultado[] resultados;
    private Deporte limite; //para acceder al num maximo de participantes
    private LocalDate fechaCelebracion;
    private Participante[] listaParticipantes;
    private Medalla[] medallasAsignadas;
    private boolean medallasYaAsignadas = false;
    
    //constructores
    //defecto
    public Prueba() {
        this.nombre = "Sin nombre";
        this.resultados = new Resultado[0];
        this.fechaCelebracion = null;
        this.listaParticipantes = new Participante[0];
        this.medallasAsignadas = new Medalla[0];
    }
    
    //parametros
    public Prueba(String n, Resultado[] r, LocalDate d, Participante[] p, Medalla[] m) {
        this.nombre = n;
        this.resultados = r.clone();
        this.fechaCelebracion = d;
        this.listaParticipantes = p.clone();
        this.medallasAsignadas = m.clone();
    }
    
    //copia
    public Prueba(Prueba p) {
        this.nombre = p.nombre;
        this.resultados = p.resultados.clone();
        this.fechaCelebracion = p.fechaCelebracion;
        this.listaParticipantes = p.listaParticipantes.clone();
        this.medallasAsignadas = p.medallasAsignadas.clone();
    }

    //getters
    public String getNombre() {
        return this.nombre;
    }

    public Resultado[] getResultadoFinal() {
        return this.resultados.clone();
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
    
    public boolean getMedallasYaAsignadas() {
        return this.medallasYaAsignadas;
    }
    
    //setters
    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setResultadoFinal(Resultado[] rf) {
        this.resultados = rf.clone();
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
    
    public void setMedallasYaAsignadas(boolean m) {
        this.medallasYaAsignadas = m;
    }
    
    //metodos 
    public void registrarParticipante(Participante p) {
        if(!limiteInscritosAlcanzado() & !participanteYaInscrito(p)) {
            for(int i = 0; i < this.listaParticipantes.length; i++) {
                if(this.listaParticipantes[i] == null) {
                    this.listaParticipantes[i] = p;
                    break;
                }
            }
        }
    }
    
    public void registrarResultados(int pos, Participante p) {
        Resultado r = new Resultado(pos, p, this);
        Resultado[] array = new Resultado[this.resultados.length + 1];
        for(int i = 0; i < this.resultados.length; i++) {
            array[i] = this.resultados[i];
        }
        array[this.resultados.length] = r;
        this.resultados = array;
    }
    
    public void asignarMedallas() { //metodo por arreglar, esta a medias
        if(!this.getMedallasYaAsignadas()) {
            for(int i = 0; i < this.resultados.length; i++) {
                if(this.resultados[i].getPosicion() == 1) {
                    this.resultados[i].getParticipante().anadirMedalla(new Medalla(TipoMedalla.Oro, this.resultados[i].getParticipante(), this));
                }
            }
            for(int i = 0; i < this.resultados.length; i++) {
                if(this.resultados[i].getPosicion() == 2) {
                    this.resultados[i].getParticipante().anadirMedalla(new Medalla(TipoMedalla.Plata, this.resultados[i].getParticipante(), this));
                }
            }
            for(int i = 0; i < this.resultados.length; i++) {
                if(this.resultados[i].getPosicion() == 3) {
                    this.resultados[i].getParticipante().anadirMedalla(new Medalla(TipoMedalla.Bronce, this.resultados[i].getParticipante(), this));
                }
            }
            this.setMedallasYaAsignadas(true); 
        }
    }
    
    public String mostrarClasificacionFinal() {
        String imprimir =  "Resultados: ";
            for(int i = 0; i < this.resultados.length; i++) {
                if(this.resultados[i] != null) {
                    imprimir += "\n - " + this.resultados[i].toString();
                }
            }
        return imprimir;
    }
    
    //validacion de registrar participante
    private boolean participanteYaInscrito (Participante p) {
        for(int i = 0; i < this.listaParticipantes.length; i++) {
            if(p.getNumIdOlimpico() == this.listaParticipantes[i].getNumIdOlimpico()) {
                return true;
            }
        }
        return false;
    }
    
    private boolean limiteInscritosAlcanzado() {
        int contador = 0;
        for(int i = 0; i < this.listaParticipantes.length; i++) {
            if(this.listaParticipantes[i] != null){
                contador++;
            }
            if(contador >= this.limite.getNumMaxParticipantes()) {
                return true;
            }
        }
        return false;
    }
    
    //toString
    @Override
    public String toString() {
        String imprimir = "Nombre de prueba: " + this.nombre +
                "\n Fecha: " + this.fechaCelebracion +
                "\n Medallas ya asignadas: " + this.medallasYaAsignadas +
                "\n Medallas disponibles: ";
        for(int i = 0; i < this.medallasAsignadas.length; i++) {
            if(this.medallasAsignadas[i] != null){
                imprimir += "\n Medalla: " + this.medallasAsignadas[i];
            }
        }
        imprimir += "\n Lista de participantes: ";
        for(int i = 0; i < this.listaParticipantes.length; i++) {
            if(this.listaParticipantes[i] != null){
                imprimir += "\n Medalla: " + this.listaParticipantes[i] + "\n";
            }
        }
        imprimir += mostrarClasificacionFinal();
        return imprimir;
    }
}
