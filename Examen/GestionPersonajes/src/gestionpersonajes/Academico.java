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
public class Academico extends Profesion {
    //atributos
    
    //constructores
    //defecto
    public Academico() {
        super();
    }
    
    //parametros
    public Academico(String nombre) {
        super(nombre);
    }
    
    //copia
    public Academico(Academico a) {
        super(a);
    }
    
    //metodo
    @Override
    public void aplicarModificadores(Personaje p) {
        p.getHabilidades().setInteligencia(p.getHabilidades().getInteligencia() + 10);
        p.getHabilidades().setConstitucion(p.getHabilidades().getConstitucion() - 5);
    }
}
