
/**
 * @author (Annamaria Szakonyi)
 */
import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
          
        out.println("Please list three items on your grocery shopping list.");
        out.println("Item 1? ");
        String Item1 = keyboard.nextLine();
        
        out.println("Item 2? ");
        String Item2 = keyboard.nextLine();

        out.println("Item 3? ");
        String Item3 = keyboard.nextLine();
        
                
        out.println("Now, please enter the quantity of each item.");
        out.println("How many " + Item1 + " ? ");
        int QuantItem1 = keyboard.nextInt();
        
        out.println("How many " + Item2 + " ? ");
        int QuantItem2 = keyboard.nextInt();
        
        out.println("How many " + Item3 + " ? ");
        int QuantItem3 = keyboard.nextInt();
        
        
        out.println("Now, please enter the price of each item.");
    
        out.println("How much does one " + Item1 + " cost?");
        float Item1Price = keyboard.nextFloat();

        out.println("How much does one " + Item2 + " cost?");
        float Item2Price = keyboard.nextFloat();

        out.println("How much does one " + Item3 + " cost?");
        float Item3Price = keyboard.nextFloat();
        

        out.println("Calculating your grocery bill.");
        
        float Total = Item1Price * QuantItem1 + Item2Price * QuantItem2 + Item3Price * QuantItem3;
        
        out.println("Your total cost is " + Total);
        
    }
}
