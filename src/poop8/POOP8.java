/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop8;

import mesario.Meses;
import tiendamusical.Flauta;
import tiendamusical.InstrumentoMusical;


/**
 * Clase principal que implementa métodos de interfaces y clases abstractas 
 * @author poo08alu04
 */
public class POOP8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //No se pueden crear objetos de clases abstractas 
        //Poligono polig = new Poligono();
        /**
         * @param pol que guarda la referencia a la clase abstracta Poilgono
         */
        Poligono pol;
        pol = new Cuadrilatero();
        System.out.println(pol.toString()); //se trata de convertir nuestro objeto en una cadena y si se imprime solo pol es lo mismo
        //pol.setBase(0) La clase padre no conoce bien a la clase hija
        /**
         * @param pol que guarda la referencia a la clase Triangulo que hereda de la clase abstracta poligono 
         */
        pol = new Triangulo();
        System.out.println(pol);
        /**
         * Metódo que calcula el area de un triangulo con base= 0.0 y altura = 0.0
         */
        pol.area();
        System.out.println("########## Instrumento musical ##########");
        InstrumentoMusical inst;
        //instancia = new InstrumentoMusical(); no se puede instanciar porque la interfaz es mas abstracta que una clase abstracta
        /**
         * @param inst que guarda la referencia a la clase Flauta que hereda de la clase InstrumentoViento 
         * que a su vez hereda de la interfaz InstrumentoMusical
         */
        inst = new Flauta();
        /**
         * Se implenta el método tocar de la clase super de Flauta 
         */
        inst.tocar();
        /**
         * Imprime a que valor corresponde el mes 2 (diciembre) con ayuda de los atributos
         * finales de la interfaz Meses
         */
        System.out.println("El mes " + Meses.DOS + " es " + Meses.NOMBRES_MESES[Meses.DOS]);
    }
    
}
