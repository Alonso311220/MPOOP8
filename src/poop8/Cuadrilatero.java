/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase concreta que se hereda de la clase abstracta Poligono
 * @author poo08alu04
 */
public class Cuadrilatero extends Poligono {
    private int alpha;
    private int beta;
    private float a;
    private float b;
    private int base;
    private int altura;

    public Cuadrilatero() {
    }

    public Cuadrilatero(int alpha, int beta, float a, float b, int base, int altura) {
        this.alpha = alpha;
        this.beta = beta;
        this.a = a;
        this.b = b;
        this.base = base;
        this.altura = altura;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    @Override
    public void area(){
        System.out.println("Area = "+(base*altura));
    }
    
    @Override
    public void perimetro(){
        System.out.println("Perimetro = "+ 2*(a + b));
    }
    
    @Override
    public String toString() {
        return "Cuadrilatero{" + "alpha=" + alpha + ", beta=" + beta + ", a=" + a + ", b=" + b + ", base=" + base + ", altura=" + altura + '}';
    }
    
}
