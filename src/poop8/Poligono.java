/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase abstracta donde sus mètodos no estan definidos y
 * nos sirve para dar una guia de los métodos 
 * @author poo08alu04
 */
public abstract class Poligono {
    /**
     * Método abstracto que calcula el area de un polígono
     */
    public abstract void area(); 
    /**
     * Método abstracto que calcula el area de un poligono
     */
    public abstract void perimetro();
    /**
     * Sobreescritura para la implementación de esta clase abstracta
     * @return 
     */
    @Override
    public String toString() {
        return "Poligono{" + '}';
    }
    
}
