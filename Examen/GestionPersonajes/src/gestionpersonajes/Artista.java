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
public class Artista extends Profesion {
    //atributos
    
    //constructores
    //defecto
    public Artista() {
        super();
    }
    
    //parametros
    public Artista(String nombre) {
        super(nombre);
    }
    
    //copia
    public Artista(Artista a) {
        super(a);
    }
    
    //metodo
    @Override
    public void aplicarModificadores(Personaje p) {
        p.getHabilidades().setCarisma(p.getHabilidades().getCarisma() + 10);
        p.getHabilidades().setPoder(p.getHabilidades().getPoder() - 5);
    }    
    
}
