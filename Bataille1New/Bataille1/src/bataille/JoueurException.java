package bataille;
/**
 * Classe d'exception levée quand un joueur ne peut pas effectuer une action
 * 
 * @author Ph. Genoud
 */
public class JoueurException extends  Exception {
    
    JoueurException(String message) {
        super(message);
    }

}
