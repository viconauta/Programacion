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
public class Prueba { //QUE NO SE ME OLVIDE PARA MAÑANA HACER EL BOOLEANO PARA VERIFICAR QUE NO REPITA EL METODO DE ASIGNAR LAS MEDALLASF  y terminar el metodo
    //atributos
    private String nombre;
    private Resultado[] resultados;
    private Deporte limite;
    private LocalDate fechaCelebracion;
    private Participante[] listaParticipantes;
    private Medalla[] medallasAsignadas;
    
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
        for(int i = 0; i < this.resultados.length; i++) {
            if(resultados[i] == null) {
                resultados[i] = r;
                break;
            }
        }
        Resultado[] array = new Resultado[resultados.length + 1];
        array[resultados.length] = r;
        resultados = array;
    }
    
    public void asignarMedallas() { //metodo por arreglar, esta a medias
        int contadorOro = 0;
        int contadorPlata = 0;
        int contadorBronce= 0;
        for(int i = 0; i < this.resultados.length; i++) {
            if(this.resultados[i].getPosicion() == 1) {
                this.resultados[i].getParticipante().anadirMedalla(new Medalla(TipoMedalla.Oro, this.resultados[i].getParticipante(), this));
            }
        }
    }
    
    //metodos de validacion de registrar participante
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
        
    }
    
}
