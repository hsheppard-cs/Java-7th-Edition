import java.util.Scanner;

class chapterThreeChallengeEighteen
{
   /**
   * Author: Hamilton Sheppard
   * Version 1 - Restuarant Selector
   * Description: You have a group of friends coming to visit for your high school reunion, and you wnat to 
   *              take them out to eat at a local restuarant. You aren't sure if any of them have any
   *              dietary restrictions, but your restaurant choices are as follows... (Listed in the public method)
   */
   public static void main(String[] args)
   {
      /*
      * Challenge #18 - Restaurant Selector
      * Joe's Gourmet Burgers - Vegetarion: No, Vegan: No, Gluten-Free: No
      * Main Street Pizza Company - Vegetarion: Yes, Vegan: No, Gluten-Free: Yes
      * Corner Cafe - Vegetarion: Yes, Vegan: Yes, Gluten-Free: Yes 
      * Mama's Fine Italian - Vegetarion: Yes, Vegan: No, Gluten-Free: No 
      * The Chef's Kitchen - Vegetarion: Yes, Vegan: Yes, Gluten-Free: Yes
      */
      
      Scanner keyboard = new Scanner(System.in);
      String vegeInput, vegInput, gFreeInput; // User-inputted information
      
      System.out.print("Is anyone in your party a vegetarian? ");
      vegeInput = keyboard.nextLine();
      System.out.print("Is anyone in your party a vegan? ");
      vegInput = keyboard.nextLine();
      System.out.print("Is anyone in your party gluten-free? ");
      gFreeInput = keyboard.next();
      
      /**
      * In Progress 
      * if (decision here)
        {
      
        }
      * else (decision here)
       {
      
       }
      */
      
   } // end of public method
} // of class

