
/**
 *
 * @author (Annamaria Szakonyi)
 */

import static java.lang.System.out;
import java.util.Scanner;

public class Homeless
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String homelessName = "XYZ";     /* this needs to be pulling from the location settings to recognize homeless users in the area*/           
        String userName = "ABC";       /* this needs to share the users name */
        out.println("Hey, " + userName + "! You just walked by " + homelessName + " who is homeless.");
        
        /*out.println("Would you like to wire " + homelessName + " some money? Yes or No?");
        String yesOrNo = keyboard.nextLine();
        if (yesOrNo = "Yes")
              {out.print("How much money would you like to wire to your charity account?");
                  
                }   
        */
  
        out.println("How much money in dollars would you like to share with " + homelessName + "?");
        float share1 = keyboard.nextFloat();
        
        out.println("You are about to share " + share1 + " dollars with " + homelessName + ".");
        out.println("Would you like to share with anyone else?");
        boolean shareMore = keyboard.nextBoolean();
        float totalShared;
        
        if (shareMore = true)
            {
                out.println("What is their username?");
                String homelessUser = keyboard.next();
                
                out.println("How much money in dollars would you like to share with " + homelessUser + "?");
                float share2 = keyboard.nextFloat();
                
                out.println("You are about to share " + share2 + " dollars with " + homelessUser + ".");
                
                totalShared = share1 + share2;
                out.println("You shared a total of " + totalShared + " dollars today with people in need. Thank you for being amazing!");
            } 
                else 
            {
                totalShared = share1;
                out.println("You shared a total of " + totalShared + " dollars today with people in need. Thank you for being amazing!");
            }
       }    
}
