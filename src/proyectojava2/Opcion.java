/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectojava2;

/**
 *
 * @author OSCAR
 */
public class Opcion {
     String titulo;
    boolean respuesta;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }
    
    

    public Opcion(String titulo, boolean respuesta) {
        this.titulo = titulo;
        this.respuesta = respuesta;
    }

    public Opcion() {
    }
    
}

