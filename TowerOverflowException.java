package csci2010.morganprogram3;

/**
 *CSCI 2010 Programming Assignment 3
 * @author Jon-Michael Morgan
 * This class is an exception for when the tower is full
 */
public class TowerOverflowException extends Exception {
    
    //constructor
    public TowerOverflowException() 
    {
        super("Exception: Tower is full");
    }
    public TowerOverflowException(String message)
    {
        super(message);
    }
    
}
