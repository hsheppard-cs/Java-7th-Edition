import java.util.Scanner;

class chapterThreeChallengeTwo
{
   /**
   * Version 1
   * Magic Date
   * After the user has entered a month (in numeric form), a day, and a two-digit
   * year, the program will determine whether the month times the day is equal to the two-digit year.
   * If so, the message "Magic Date" will display, if not, the message "Not a magic date" will display.
   */
   public static void main(String[] args)
   {
      int month, day, year; // User-entered information
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter a month (In numeric form): ");
      month = keyboard.nextInt();
      System.out.print("Enter a day: ");
      day = keyboard.nextInt();
      System.out.print("Enter a two-digit year: ");
      year = keyboard.nextInt();
      
      // Utilizes [width] of the format specifier
      System.out.printf("Date Entered:%3d/%d/%d\n",month,day,year);
      
      if ((month * day) == year)
         System.out.println("Magic Date");
      else
         System.out.println("Not a magic date");
   } // end of public method
} // end of class