/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamusical;

/**
 * Clase que hereda de Object y implementa la interfaz InstrumentoMusical
 * @author poo08alu04
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{

    public InstrumentoViento() {
    }
    
    /**
     * si utilizamos el metodo tocar la operacion no va a ser soportada
     */
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }

    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }
    /**
     * Se modifica el valor de retorno
     * @return String
     */
    @Override
    public String tipoInstrumento() {
        return "Instrumento de Viento ";
    }
    /**
     * Se modifica el valor de retorno
     * @return String
     */
    @Override
    public String toString() {
        return "InstrumentoViento{" + '}';
    }
    
}
