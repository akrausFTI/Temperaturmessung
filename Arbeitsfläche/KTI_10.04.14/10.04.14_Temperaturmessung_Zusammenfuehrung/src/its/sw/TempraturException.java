/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package its.sw;

/**
 *
 * @author andreas.kraus
 */
public class TempraturException extends Exception{
    
        public TempraturException(String msg) {
        super(msg =  "Bitte geben Sie nur Zahlen getrennt durch einen Punkt ein.");
        }

    public TempraturException() {
        super("Unbekannter Fehler");
    }
    
}
