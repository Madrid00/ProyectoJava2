/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava2;

import java.util.ArrayList;

/**
 *
 * @author OSCAR
 */
public class Preguntas {
     String titulo;
    ArrayList<Opcion> opcion;
 
    public Preguntas() {
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpcion() {
        return opcion;
    }

    public void setOpcion(ArrayList<Opcion> opcion) {
        this.opcion = opcion;
    }

    public Preguntas(String titulo, ArrayList<Opcion> opcion) {
        this.titulo = titulo;
        this.opcion = opcion;
    }

   
    
    
}


