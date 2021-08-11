/**
   This program displays a table of speeds in kph converted to mph.
   
   The table that your program displays shows speeds from 60 kph through 130 kph, in increments of 10,
   along with their values converted to miles per hour.
   
   Write a for loop that uses a counter variable to hold the KPH speeds. The counter's starting value will be 
   60, its ending value will be 130, and you will add 10 to the counter variable after each iteration. 
*/ 

public class SpeedConverter
{
   public static void main(String[] args)
   {
      // Constants
      final int STARTING_KPH = 60; // Starting speed
      final int MAX_KPH = 130; // Maximum speed
      final int INCREMENT = 10; // Speed increment
      
      // Variables
      int kph; // To hold the speed in kph - also the control variable in the for loop
      double mph; // To hold the speed in mph - converted value (kph -> mph)
      
      // Display the table headings
      System.out.println("KPH\t\tMPH");
      System.out.println("----------");
      
      // Display the speeds
      for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT)
      {
         // Calculate the mph
         mph = kph * 0.6214;
         
         // Display the speeds in kph and mph
         System.out.printf("%d\t\t%.1f\n", kph, mph);
      }
   }
}