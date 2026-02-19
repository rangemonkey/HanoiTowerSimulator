package csci2010.morganprogram3;

/**
 *CSCI 2010 Programming Assignment 3
 * @author Jon-Michael Morgan
 * This class will manage the discs on the rod and add and remove discs from the rod
 */
public class HanoiTower {
    private int[] discsOnRod;
    private int numOfDiscs;
    private String rodName;
    
    //constructor
    public HanoiTower(int maxDiscs, String rodName)
    {
        discsOnRod = new int[maxDiscs];
        numOfDiscs = 0;
        this.rodName = rodName;
    }
    
    //takes an integer representing a disc and adds it to the array
    public void push(int disc) 
            throws TowerOverflowException, IllegalPushException
    {
        if (numOfDiscs == discsOnRod.length)
            throw new TowerOverflowException("Exception: Tower is full");
        else if (numOfDiscs > 0 && discsOnRod[numOfDiscs-1] < disc)
            throw new IllegalPushException("Exception: Can not add larger disc "
                    + "on top of smaller disc.");
        else
        {
            discsOnRod[numOfDiscs] = disc;
            numOfDiscs++;
        }
    }
    
    //removes the top disc if there are any
    public int pop() throws EmptyTowerException
    {
        if (numOfDiscs == 0)
            throw new EmptyTowerException("Exception: Tower is empty.");
        else
        {
            numOfDiscs--;
            return discsOnRod[numOfDiscs];
        }
    }
       
    //displays the rod name and each disc from bottom to top
    public String toString()
    {
        String result = "";
        for (int i = 0; i < numOfDiscs; i++)
        {
            result = result + discsOnRod[i] + " ";
        }
        return "Rod " + rodName + ": " + result;
    }
}
