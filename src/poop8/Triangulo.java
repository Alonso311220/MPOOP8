/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop8;

/**
 * Clase concreta que se hereda de la clase abstracta Poligono
 * @author poo08alu04
 */
public class Triangulo extends Poligono {
    private int alpha;
    private int beta;
    private int gamma;
    private float base;
    private float altura;
    private float a,b,c;

    public Triangulo() {
    }

    public Triangulo(int alpha, int beta, int gamma, float base, float altura, float a, float b, float c) {
        this.alpha = alpha;
        this.beta = beta;
        this.gamma = gamma;
        this.base = base;
        this.altura = altura;
        this.a = a;
        this.b = b;
        this.c = c;
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

    public int getGamma() {
        return gamma;
    }

    public void setGamma(int gamma) {
        this.gamma = gamma;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
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

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    @Override
    public void area(){
        System.out.println("Area = "+ (base*altura/2));
    }
    
    @Override
    public void perimetro(){
        System.out.println("Permietro = "+(a + b + c));
    }
    /**
     * Sobreescritura para retornar los valores de los atributos de la clase Triangulo
     * @return 
     */
    @Override
    public String toString() {
        return "Triangulo{" + "alpha=" + alpha + ", beta=" + beta + ", gamma=" + gamma + ", base=" + base + ", altura=" + altura + ", a=" + a + ", b=" + b + ", c=" + c + '}';
    }
    
}
