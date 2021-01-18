import java.util.Scanner;

class chapterThreeChallengeTwo
{
   public static void main(String[] args)
   {
      int month, day, year;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.print("Enter a month (In numeric form): ");
      month = keyboard.nextInt();
      System.out.print("Enter a day: ");
      day = keyboard.nextInt();
      System.out.print("Enter a two-digit year: ");
      year = keyboard.nextInt();
      
      System.out.printf("Date Entered:%3d/%d/%d\n",month,day,year);
      
      if ((month * day) == year)
         System.out.println("Magic Date");
      else
         System.out.println("Not a magic date");
   }
}