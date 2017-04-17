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
public class ProyectoJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Preguntas> preguntas = new GenerarCuestionario().getPreguntas();
        
        for (Preguntas p : preguntas){
            
            System.out.println(p.getTitulo());
            for(Opcion o : p.getOpcion()){
                System.out.println(o.getTitulo());
            }
        }
   }
}
