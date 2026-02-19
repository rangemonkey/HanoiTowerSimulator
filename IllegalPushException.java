package csci2010.morganprogram3;

/**
 *CSCI 2010 Programming Assignment 3
 * @author Jon-Michael Morgan
 * This is an exception for when the program tries to add a disc on top of a smaller disc
 */
public class IllegalPushException extends Exception {

    //constructor
    public IllegalPushException() 
    {
        super("Exception: Can not add larger disc on top of smaller disc.");
    }
    public IllegalPushException(String message)
    {
        super(message);
    }
    
}
