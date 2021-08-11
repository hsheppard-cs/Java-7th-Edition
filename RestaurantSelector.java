import java.util.Scanner; // Needed for the Scanner class

/**
   @author Hamilton Sheppard
   @version 1.1
   @description  You have a group of friends coming to visit for your high school reunion, and you 
                 want to take them out to eat at a local restuarant. You aren't sure if any of 
                 them have any dietary restrictions, but your restaurant choices are as follows... 
 */
   
public class RestaurantSelector
{
   public static void main(String[] args)
   {
      // Create new Scanner object to read user input
      
      Scanner keyboard = new Scanner(System.in);
      
      String vegetarianInput, veganInput, glutenFreeInput; 
      
      // Collect user input  
          
      System.out.print("Is anyone in your party a vegetarian? ");
      vegetarianInput = keyboard.nextLine().toLowerCase();
      
      System.out.print("Is anyone in your party a vegan? ");
      veganInput = keyboard.nextLine().toLowerCase();
      
      System.out.print("Is anyone in your party gluten-free? ");
      glutenFreeInput = keyboard.nextLine().toLowerCase();
      
      // Checks if user-inputted answer is 'y' or 'n'
      
      char vegeInput = vegetarianInput.charAt(0),
           vegInput = veganInput.charAt(0),
           gFreeInput = glutenFreeInput.charAt(0);
      
      String burger = "Joe's Gourmet Burgers",
             pizza = "Main Street Pizza Company",
             cafe = "Corner Cafe",
             italian = "Mama's Fine Italian",
             kitchen = "The Chef's Kitchen";
       
      System.out.printf("\n%s\n", "Here are your restuarant choices:");
      
      /*
         Conditionally display resturant choices based on the 
         dietary restrictions using nested if-else-if statements. Displays the output
         using the System.out.printf method.
      */
      
      if (vegeInput == 'y')
      {
         if (vegInput == 'y')
         {
            if (gFreeInput == 'y')
            {
               System.out.printf("\t%s\n \t%s", cafe, kitchen);
            }
            else if (gFreeInput == 'n')
            {
               System.out.printf("\t%s\n \t%s", cafe, kitchen);
            }
         }
         else if (vegInput == 'n')
         {
            if (gFreeInput == 'y')
            {
               System.out.printf("\t%s\n \t%s\n \t%s", pizza, cafe, kitchen);
            }
            else if (gFreeInput == 'n')
            {
               System.out.printf("\t%s\n \t%s\n \t%s\n \t%s", 
                                 pizza, cafe, italian, kitchen);
            }
         }
      } // end of first if
      else if (vegeInput == 'n')
      {
         if (vegInput == 'n')
         {
            if (gFreeInput == 'n')
            {
               System.out.printf("\t%s\n \t%s\n \t%s\n \t%s\n \t%s", 
                                 burger, pizza, cafe, italian, kitchen);  
            }
            else if (gFreeInput == 'y')
            {
               System.out.printf("\t%s\n \t%s\n \t%s",pizza, cafe, kitchen);
            }
         }
         else if (vegInput == 'y')
         {
            if (gFreeInput == 'y')
            {
               System.out.printf("\t%s\n \t%s", cafe, kitchen);
            }
            else if (gFreeInput == 'n')
            {
               System.out.printf("\t%s\n \t%s", cafe, kitchen);
            }
         }    
      } // end of else if  
   } // end of method
} 