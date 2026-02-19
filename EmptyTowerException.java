package csci2010.morganprogram3;

/**
 *CSCI 2010 Programming Assignment 3
 * @author Jon-Michael Morgan
 * This class is an exception for when the tower is empty
 */
public class EmptyTowerException extends Exception {

    public EmptyTowerException() 
    {
        super("Exception: Tower is empty.");
    }
    public EmptyTowerException(String message)
    {
        super(message);
    }
    
}
