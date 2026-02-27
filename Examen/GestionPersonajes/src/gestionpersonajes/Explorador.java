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
public class Explorador extends Profesion {
    //atributos
    
    //constructores
    //defecto
    public Explorador() {
        super();
    }
    
    //parametros
    public Explorador(String nombre) {
        super(nombre);
    }
    
    //copia
    public Explorador(Explorador a) {
        super(a);
    }
    
    //metodo
    @Override
    public void aplicarModificadores(Personaje p) {
        p.getHabilidades().setDestreza(p.getHabilidades().getDestreza() + 10);
        p.getHabilidades().setCarisma(p.getHabilidades().getCarisma() - 5);
    }    
}
