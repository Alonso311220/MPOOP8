/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendamusical;

/**
 * Esta clase se hereda de la clase InstrumentoMusical 
 * por lo que adquiere sus métodos y cambia los valores de retorno
 * con ayuda de la sobreescritura (toString)
 * @author poo08alu04
 */
public class Flauta extends InstrumentoViento {

    public Flauta() {
    }
    
    @Override
    public String tipoInstrumento(){
        return "Flauta";
    }

    @Override
    public String toString() {
        return "Flauta{" + '}';
    }
    
    
}
