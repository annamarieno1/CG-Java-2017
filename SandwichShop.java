
/**
 *
 * @author (Annamaria Szakonyi)
 */

import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
       public static void main(String[] args)
       {
        Scanner keyboard = new Scanner(System.in);
        
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70; 
                
        out.println("Checking sales goals.");  
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies);
        out.println("How many veggie sandwiches were sold today?"); 
        int soldVeggies = keyboard.nextInt();
        
        if(soldVeggies >= goalForVeggies)
        {
            out.println("Meets goal for veggies.");
        } else 
        {
            out.println("Fell short");
        }
               
        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");        
        int soldBurgers = keyboard.nextInt();
        
        if(soldBurgers >= goalForBurgers)
        {
            out.println("Meets goal for burgers.");
        } else 
        {
            out.println("Fell short");
        }
        
        out.println("The sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today?");        
        int soldSubs = keyboard.nextInt();
        
        if(soldSubs >= goalForSubs)
        {
            out.println("Meets goal for subs.");
        } else 
        {
            out.println("Fell short");
        }
                
        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today?");        
        int soldSoups = keyboard.nextInt();        
        
        if(soldSoups >= goalForSoup)
        {
            out.println("Meets goal for soup.");
        } else 
        {
            out.println("Fell short");
        }
                
        if (soldSoups >= goalForSoup && soldSubs >= goalForSubs && soldSubs >= goalForSubs && soldVeggies >= goalForVeggies)
        {
            out.println("Made goal with everything!");
        }
               
       }
}
