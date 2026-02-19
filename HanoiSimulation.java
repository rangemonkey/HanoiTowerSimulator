package csci2010.morganprogram3;

/**
 *CSCI 2010 Programming Assignment 3
 * @author Jon-Michael Morgan
 * This class will manage the simulation 
 */
public class HanoiSimulation{
    private int totalDiscs;
    HanoiTower rodA;
    HanoiTower rodB;
    HanoiTower rodC;
    
    //constructor
    public HanoiSimulation(int numDiscs)
    {
        totalDiscs = numDiscs;
        rodA = new HanoiTower(numDiscs, "A");
        rodB = new HanoiTower(numDiscs, "B");
        rodC = new HanoiTower(numDiscs, "C");
        try
        {
            for (int i = numDiscs; i > 0; i--)
            {
                rodA.push(i);
            }
        }
        catch (TowerOverflowException e)
        {
            System.out.println(e.getMessage());
        } 
        catch (IllegalPushException e) 
        {
           System.out.println(e.getMessage()); 
        }
        
    }
    
    //starts the simulation
    public void runSim()
    {
        displayTowers();
        moveDiscs(rodA, rodB, rodC, totalDiscs);
    }
    
    //recursive method that takes three HanoiTower objects as arguments, discs to move,
    //and uses push and pop method to relocate discs between rods
    private void moveDiscs(HanoiTower a, HanoiTower b, HanoiTower c, int numDiscs)
    {
        if (numDiscs == 1)
        {
            try 
            {
                a.pop();
                b.push(numDiscs);
                displayTowers();
            } catch (EmptyTowerException e) 
            {
                System.out.println(e.getMessage());
            } catch (TowerOverflowException e) 
            {
                System.out.println(e.getMessage());
            } catch (IllegalPushException e) 
            {
                System.out.println(e.getMessage());
            }
        }
        else
        {
            moveDiscs(a, c, b, numDiscs - 1);
            try
            {
                a.pop();
                b.push(numDiscs);
                displayTowers();
                moveDiscs(c, b, a, numDiscs-1);
            } 
            catch (EmptyTowerException e) 
            {
                System.out.println(e.getMessage());
            } 
            catch (TowerOverflowException e) 
            {
                System.out.println(e.getMessage());
            }
            catch (IllegalPushException e) 
            {
                System.out.println(e.getMessage());
            }
            
        }
    }
    
    //displays the three towers in order
    private void displayTowers()
    {
        System.out.println(rodA.toString());
        System.out.println(rodB.toString());
        System.out.println(rodC.toString());
        System.out.println("");
    }
    
}
