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
public class GenerarCuestionario {
    
     ArrayList<Preguntas> preguntas;

    public GenerarCuestionario() {
        preguntas = new ArrayList<>();
        
    }
    public ArrayList<Preguntas> getPreguntas() {
//Pregunta 1
     Opcion o11=new Opcion("es un tipo de variable", false);
     Opcion o21=new Opcion("es una categoria de datos ordenada secuencialmente", false);
     Opcion o31=new Opcion("Es un modelo o plantilla a partir de la cual creamos objetos", true);
     
     ArrayList<Opcion> opcionesp1=new ArrayList<>();
     opcionesp1.add(o11);
     opcionesp1.add(o21);
     opcionesp1.add(o31);
     
//Pregunta 2
     Opcion o12=new Opcion("Realizar Pseudocodigo", false);
     Opcion o22=new Opcion("Realizar diagrama Entidad-Relacion", true);
     Opcion o32=new Opcion("Realizar codigo de programacion", false);
     
     ArrayList<Opcion> opcionesp2=new ArrayList<>();
     opcionesp2.add(o12);
     opcionesp2.add(o22);
     opcionesp2.add(o32);
//Pregunta 3
     Opcion o13=new Opcion("Create, Read, Update, Delete ", true);
     Opcion o23=new Opcion("Crear, Leer, Actualizar, Borrar", false);
     Opcion o33=new Opcion("Conectar, Rectificar, Unificar, Decodificar", false);
     
     ArrayList<Opcion> opcionesp3=new ArrayList<>();
     opcionesp3.add(o13);
     opcionesp3.add(o23);
     opcionesp3.add(o33);
//Pregunta 4
    
     Opcion o14=new Opcion("Crear un objeto a partir de la clase", true);
     Opcion o24=new Opcion("Duplicar una clase", false);
     Opcion o34=new Opcion("Conectar dos clases entre si", false);
     
     ArrayList<Opcion> opcionesp4=new ArrayList<>();
     opcionesp4.add(o14);
     opcionesp4.add(o24);
     opcionesp4.add(o34);
//Pregunta 5
     Opcion o15=new Opcion("Alto voltaje", false);
     Opcion o25=new Opcion("Crear un metodo con el mismo nombre pero con diferentes argumentos", true);
     Opcion o35=new Opcion("Llenar la memoria del equipo de computo", false);
     
     ArrayList<Opcion> opcionesp5=new ArrayList<>();
     opcionesp5.add(o15);
     opcionesp5.add(o25);
     opcionesp5.add(o35);
//Pregunta 6
     Opcion o16=new Opcion("Un bucle que no finaliza", false);
     Opcion o26=new Opcion("Es un error en tiempo de ejecucion", true);
     Opcion o36=new Opcion("Un evento usado al crear Interfaces", false);
     
     ArrayList<Opcion> opcionesp6=new ArrayList<>();
     opcionesp6.add(o16);
     opcionesp6.add(o26);
     opcionesp6.add(o36);
//Pregunta 7
     Opcion o17=new Opcion("Model, View, Controller", true);
     Opcion o27=new Opcion("Modelar, Mirar, Controlar", false);
     Opcion o37=new Opcion("Marvel Versus Capcom", false);
     
     ArrayList<Opcion> opcionesp7=new ArrayList<>();
     opcionesp7.add(o17);
     opcionesp7.add(o27);
     opcionesp7.add(o37);
//Pregunta 8
     Opcion o18=new Opcion("Programacion Orientada a Objetos", true);
     Opcion o28=new Opcion("Programacion Orientada a Obstaculos", false);
     Opcion o38=new Opcion("Programacin Origina en Objetos ", false);
     
     ArrayList<Opcion> opcionesp8=new ArrayList<>();
     opcionesp8.add(o18);
     opcionesp8.add(o28);
     opcionesp8.add(o38);
//Pregunta 9
     Opcion o19=new Opcion("Constructores, Arreglos mutables", false);
     Opcion o29=new Opcion("Ap. desktop Offline ,Ap. desktop Online, Ap. web stand-alone", true);
     Opcion o39=new Opcion("Modelo,Entidad,Aplicacion", false);
     
     ArrayList<Opcion> opcionesp9=new ArrayList<>();
     opcionesp9.add(o19);
     opcionesp9.add(o29);
     opcionesp9.add(o39);
//Pregunta 10
     Opcion o110=new Opcion("Es un Software que provee herramientas de desarrollo para la creacion de programas ", true);
     Opcion o210=new Opcion("Para poder programar en Netbeans", false);
     Opcion o310=new Opcion("Para cargar librerias", false);
     
     ArrayList<Opcion> opcionesp10=new ArrayList<>();
     opcionesp10.add(o110);
     opcionesp10.add(o210);
     opcionesp10.add(o310);
   
     
        Preguntas p1 = new Preguntas("¿Cuál es la descripción que define mejor el concepto 'clase' "
                + "                  en la programación orientada a objetos? ",opcionesp1);
        Preguntas p2 = new Preguntas("¿Primer paso para realizar un programa?" ,opcionesp2);
        Preguntas p3 = new Preguntas("¿Que significan las siglas CRUD? ",opcionesp3);
        Preguntas p4 = new Preguntas("¿Que significa instanciar una clase? ",opcionesp4);
        Preguntas p5 = new Preguntas("¿Que es una sobrecarga? ",opcionesp5);
        Preguntas p6 = new Preguntas("¿Que es una excepcion? ",opcionesp6);
        Preguntas p7 = new Preguntas("¿Que significa MVC? ",opcionesp7);
        Preguntas p8 = new Preguntas("¿Que signigica POO? ",opcionesp8);
        Preguntas p9 = new Preguntas("¿Cuales son 3 tipos de Aplicaciones? ",opcionesp9);
        Preguntas p10= new Preguntas("¿Para que sirve el JDK en Java? ",opcionesp10);
        
        

        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);
        preguntas.add(p6);
        preguntas.add(p7);
        preguntas.add(p8);
        preguntas.add(p9);
        preguntas.add(p10);
       
        return preguntas;
}
}


