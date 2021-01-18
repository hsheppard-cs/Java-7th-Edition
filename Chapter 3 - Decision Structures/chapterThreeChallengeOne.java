import java.util.Scanner;

class chapterThreeChallengeOne
{
   /**
   * Author: Hamilton Sheppard
   * Version 1 - Roman Numerals
   * Description: Write a program that prompts the user to enter a number within the range of 1 through 10.
   *              The program should display the Roman numeral version of that number. If the number is 
   *              outside the range 1 through 10, the program should display an error message.               
   */
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int input; // A number to be entered by the user
      
      System.out.print("Enter a number between 1 and 10: ");
      input = keyboard.nextInt();
      
      // Determine the Roman Numeral equivalent
      switch (input)
      {
         case 1:
            System.out.printf("Roman Numeral:%2s","I");
            break;
         case 2:
            System.out.printf("Roman Numeral:%2s","II");
            break;
         case 3:
            System.out.printf("Roman Numeral:%2s","III");
            break;
         case 4:
            System.out.printf("Roman Numeral:%2s","IV");
            break;
         case 5:
            System.out.printf("Roman Numeral:%2s","V");
            break;
         case 6:
            System.out.printf("Roman Numeral:%2s","VI");
            break;
         case 7:
            System.out.printf("Roman Numeral:%2s","VI");
            break;
         case 8:
            System.out.printf("Roman Numeral:%2s","VIII");
            break;
         case 9:
            System.out.printf("Roman Numeral:%2s","IX");
            break;
         case 10:
            System.out.printf("Roman Numeral:%2s","X");
            break;
         default:
            System.out.print("Invalid number printed.");
            break;
      } // end of switch statement 
      
   } // end of public method 
} // end of class