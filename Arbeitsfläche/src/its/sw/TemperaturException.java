/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package its.sw;

/**
 *
 * @author andreas.kraus
 */
public class TemperaturException extends Exception{
    /**
     * Parametrisierter Konstruktor mit der entsprechenden Exceptionmessage.
     * 
     * @param msg 
     */
        public TemperaturException(String msg) {
        super(msg =  "Bitte geben Sie nur Zahlen getrennt durch einen Punkt ein.");
        }

   /**
    * Standartisierter Konstruktor.
    */
    public TemperaturException() {
        super("Unbekannter Fehler");
    }
    
}
