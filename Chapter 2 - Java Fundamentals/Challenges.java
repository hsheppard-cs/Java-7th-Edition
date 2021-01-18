import java.util.Scanner;

class Challenges
{
   /**
   * Author: Hamilton Sheppard
   * Version 1 - Chapter 2 Programming Challenges
   * Description: After finishing the reading of Chapter 2, I went on to complete the twenty-one
   *              programming challenges in the back of the book to further my understanding.
   */
   public static void main(String[] args)
   {
     /*
      * Challenge #1
      * Topics used - newLine escape sequence
      
      String name_v1 = "Hamilton Sheppard";
      int age = 19;
      double annualPay = 350000;
      
      System.out.println("My name is " + name_v1 + ", " + "my age is " + age +
                         "and\nI hope to earn $" + annualPay + " per year");
      */
      
     /*
      * Challenge #2
      * Topics Used - String string.charAt()\
      
      String firstName = "Hamilton", middleName = "Mykel", lastName = "Sheppard";
      // charAt() returns the character at the specific index
      char firstInitial = firstName.charAt(0), middleInitial = middleName.charAt(0),
           lastInitial = lastName.charAt(0);
      
      System.out.println("My full name is, " + firstName + " " + middleName + " " + lastName +
                         "\nwith the initials, " + firstInitial + middleInitial + lastInitial);
      */  
          
     /*
      * Challenge #3
      * Topics used - newLine escape sequence
      * Escape sequences to remember:
      * \n - newLine
      * \t - Horizontal Tab
      * \b - Backspace
      * \r - Return
      * \\ - Backslash
      * \' - Single quote
      * \" - Double quote
      
      String name = "Hamilton Sheppard", address = "10405 Lemington Drive, Charlotte, NC, 28227", 
            phoneNumber = "980-613-1152", collegeMajor = "Computer Science";
      
      System.out.println(name + "\n" + address + "\n" + phoneNumber + "\n" + collegeMajor);
      
      */
      
     /* 
      * Challenge #4
      * Topics used - newLine escape sequence
      
      System.out.println("   * \n  *** \n ***** \n******* \n ***** \n  *** \n   *");
      */
      
     /* 
      * Challenge #5
      * Topics used - Cast Operator
      
      int totalRevenue = 4600000;
      double eastCostPercentage = 0.62, salesCalculation = (double)totalRevenue * eastCostPercentage;
      System.out.println("The East Coast Division will generate $" + salesCalculation + 
                         "\nof the total revenue generated.");
      */
      
     /*
      * Challenge #6 - Land Calculation
      * Topics used - Cast Operator, newLine Escape Sequence
      * Formula: size_of_tract_of_land / size_of_an_acre
      
      int oneAcre = 43560, tractOfLand = 389767;
      double numOfAcres = ((double)tractOfLand) / ((double)oneAcre);
      System.out.println("The number of acres in a tract land with " + tractOfLand + " sqaure\nfeet is, " + 
                         numOfAcres + " acres.");
      */
      
     /*
      * Challenge #7 - Sales Tax
      * Topics used - Scanner input, newLine escape sequence
      
      double stateTax = 0.04, countyTax = 0.02, totalTax = stateTax + countyTax;
      Scanner keyboard = new Scanner(System.in); // Scanner class allows keyboard input to be read
      System.out.print("Hope you found everything ok.\nPlease enter the price of the purchased item(s): ");
      double input = keyboard.nextDouble();
      totalTax = input * totalTax;
      double totalOfSale = input + totalTax;
 
      System.out.println("Amount of the purchase: $" + input + 
                         "\nState Sales Tax: " + stateTax + "%" +
                         "\nCounty Sales Tax: " + countyTax + "%" +
                         "\nTotal Sales Tax: " + totalTax + "%" +
                         "\nTotal of Sale: " + totalOfSale);
      */
     /*
      * Challenge #8 - Cookie Calories
      * Topics used - keyword: final, Cast Operator, Scanner class
      * Note: A bag of cookies holds 40 cookies
      * There are 10 servings in the bag and a serving equals 300 calories
      * 10/40 - Serving per cookie = 0.25
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Hi! How many cookies have you ate?\nEnter Here: ");
      final double servingPerCookie = 0.25, caloriePerServing = 300;
      int input = keyboard.nextInt();
      
      double servings = (double)input * servingPerCookie, calories = servings * caloriePerServing;
      System.out.println("You have consumed " + calories + " calories as you ate " + input + " cookies. Bye!");
      */
     /*
      * Challenge #9 - Miles-per-Gallon
      * Formula used: MPG = Miles Driven / Gallons of gas used
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Hi! How many miles have you drove?\nEnter here: ");
      double milesInput = keyboard.nextDouble();
      
      System.out.print("Hi Again! How many gallons of gas did you use?\nEnter here: ");
      double gallonsInput = keyboard.nextDouble(), MPG = milesInput / gallonsInput;
      
      System.out.println("A total of " + MPG + " miles per gallon were calculated. Bye!");
      */
      
     /*
      * Challenge #10 - Test Average
      * Topics used - Scanner class, keyword final
       
      Scanner keyboard = new Scanner(System.in);
      final int numOfTest = 3;
      double score1, score2, score3, average;
      
      System.out.print("Hi! Enter test score #1: ");
      score1 = keyboard.nextDouble();
      
      System.out.print("Enter test score #2: ");
      score2 = keyboard.nextDouble();
      
      System.out.print("Enter test score #3: ");
      score3 = keyboard.nextDouble();
      
      average = (score1 + score2 + score3) / numOfTest; // calculate average
      System.out.println("Hi! Your calculated test average is " + average);
      */
      
     /*
      * Challenge #11 - Circuit Board Profit
      * Formula: Profit = Retail price * 0.4
       
      Scanner keyboard = new Scanner(System.in);
      final double companyProfit = 0.4;
      System.out.print("Hi! How much was the circuit you purchased?\nEnter here: ");
      double retailPrice = keyboard.nextDouble(), profit = retailPrice * companyProfit;
      
      System.out.println("Thank you! You have made me $" + profit + ". Bye!");
      */
      
     /*
      * Challenge #12 - String Manipulator
      * Topics used - Common string methods, string.length(), string.toUpperCase(), string.toLowerCase()
      
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Hi! Please enter your favorite city here: ");
      String favCity = keyboard.nextLine();
      
      System.out.println("City Entered: " + favCity +
                         "\nNumber of characters in " + favCity + " is " + favCity.length() + 
                         "\n" + favCity + " in lowercase letters is " + favCity.toLowerCase() + 
                         "\n" + favCity + " in uppercase letters is " + favCity.toUpperCase());
      */                    
      
     /* 
      * Challenge #13 - Restaurant Bill
      * Topics used - final keyword, Scanner class, newLine escape sequence
      
      final double originalTax = 0.0675, originalTip = 0.2;
      Scanner keyboard = new Scanner(System.in);
      System.out.print("Hope you enjoyed your meal! Please enter\nthe meal charge amt here: ");
      double originalMealCharge = keyboard.nextDouble();
      
      double taxAmount = originalMealCharge * originalTax,
      adjustedMealCharge = originalMealCharge + taxAmount,
      tipAmount = adjustedMealCharge * originalTip,
      adjustedMealCharge = adjustedMealCharge + tipAmount;
      
      System.out.println("Meal Charge: $" + originalMealCharge +
                         "\nTax Amount: $" + taxAmount +
                         "\nTip Amount: $" + tipAmount + 
                         "\nTotal Bill: $" + adjustedMealCharge);
      */
      
     /*
      * Challenge #14 - Male and Female Percentage
      * Topics used - Scanner, Cast Operator
      
      * Scanner keyboard = new Scanner(System.in);
      * int boysRegistered, girlsRegistered, totalKids;
      * double boysPercentage, girlsPercentage;
      
      * System.out.print("Hi! How many boys have registered? ");
      * boysRegistered = keyboard.nextInt();
      
      * System.out.print("And how many girls have registered? ");
      * girlsRegistered = keyboard.nextInt();
      
      * totalKids = boysRegistered + girlsRegistered;
      * boysPercentage = (double)boysRegistered / (double)totalKids;
      * girlsPercentage = (double)girlsRegistered / (double)totalKids;
      
      * System.out.println("There are a total of " + totalKids + " in the class. " +
      *                   "\nOf that total, there is a percentage of " + boysPercentage + "% for the boys." +
      *                   "\nAnd, a percentage of " + girlsPercentage + "% for the girls.");
      */
      
     /*
      * Challenge #15 - Stock Commission
      * 
      * double amtPaid = 600 * 21.77, 
      *        commission = amtPaid * 0.02, 
      *        totalAmt = amtPaid + commission;
      
      * System.out.println("The amount paid for the stock alone: $" + amtPaid +
      *                   "\nThe amount of the commission: $" + commission + 
      *                   "\nThe total amount paid: $" + totalAmt); 
      */
      
     /* 
      * Challenge #16 - Energy Drink Consumption
      
      * final int participants = 12467;
      * double percentageOfDrinksPerWeek = (double)participants * 0.14;
      * double percentageOfCitrusFlavored = (double)participants * 0.64;
      
      * System.out.println("Approximate number of those who purchase one or more\nenergy drinks per week: " + percentageOfDrinksPerWeek +
      *                   "\nApproximate number of those who prefer citrus-flavored: " + percentageOfCitrusFlavored);
      */
      
     /*
      *  Challenge #17 - Ingredient Adjuster
      * A cookie recipe (for 48 cookies) calls for the following ingredients:
      * 1) 1.5 cups of sugar - 0.03125 per cookie
      * 2) 1 cup of butter - 0.02083333 per cookie
      * 3) 2.75 cups of flour - 0.05729167 per cookie
      
      * final double sugarPerCookie = 0.03125, butterPerCookie = 0.02083333, flourPerCookie = 0.05729167;
      * double adjustedSugar, adjustedButter, adjustedFlour;
      * Scanner keyboard = new Scanner(System.in);
      * System.out.print("How many cookies would you like to make? ");
      * int cookieInput = keyboard.nextInt();
      * adjustedSugar = (double)cookieInput * sugarPerCookie;
      * adjustedButter = (double)cookieInput * butterPerCookie;
      * adjustedFlour = (double)cookieInput * flourPerCookie;
      * System.out.println("You are making " + cookieInput + " cookies." +
                         "\nRequiring:\n1) " + adjustedSugar + " cups of sugar." +
                         "\n2) " + adjustedButter + " cups of butter." +
                         "\n3) " + adjustedFlour + " cups of flour.");
      */
      
     /*
      * Challenge #18 - Word Game
      * Topics used - Scanner class
      * repeated keyboard.nextLine() will not require a keyboard.nextLine() for the buffer 
      
      Scanner keyboard = new Scanner(System.in);
      String name, age, city, college, profession, animal, petName;
      
      System.out.print("What's your name? ");
      name = keyboard.nextLine();

      System.out.print("What's your age? ");
      age = keyboard.nextLine();

      System.out.print("What city? ");
      city = keyboard.nextLine();

      System.out.print("What's your college? ");
      college = keyboard.nextLine();

      System.out.print("What's your profession? ");
      profession = keyboard.nextLine();

      System.out.print("What animal? ");
      animal = keyboard.nextLine();

      System.out.print("What's your pet's name? ");
      petName = keyboard.nextLine();

      System.out.println("There once was a person named " + name + " who lived in " + city + ". At the age of " + age +
                         ", \n" + name + " went to college at " + college + "." + name + " graduated and went to work as a " +
                         "\n" + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName  +
                         ". They both lived happily ever after!");
     */
     
    /*
     * Challenge #19 - Stock Transcation Program
     
     
     double amountPaid = 1000 * 32.87;
     double commissionPaid = amountPaid * 0.02;
     double finalAmtPaid = amountPaid + commissionPaid; // used to calculate the profit
     
     double amountSold = 1000 * 33.92;
     double commissionPaidAftrSold = amountSold * 0.02;
     double finalAmtSold = amountSold + commissionPaidAftrSold; // used to calculate the profit
     double finalAmt = finalAmtSold - finalAmtPaid; // profit
     
     System.out.println("Amount paid: $" + amountPaid +
                        "\nAmount of commission paid: $" + commissionPaid +
                        "\nAmount the stock sold for: $" + amountSold +
                        "\nAmount of commission paid for when sold: $" + commissionPaidAftrSold +
                        "\nProfit or Loss: $" + finalAmt);
     */
     
    /*
     * Challenge #20 - Planting Grapevines
     * V = (R - 2E) / (S)
     * V - number of grapevines in the row
     * R - length of the row, in feet
     * E - amount of space used by an end-post assembly
     * S - space between vines, in feet
     
     * Scanner keyboard = new Scanner(System.in);
     * double lengthOfRow, spaceUsedAssembly, spaceBtwnVines, numGrapeVines;
     * System.out.print("Please enter the length of the row, in feet: ");
     * lengthOfRow = keyboard.nextDouble();
     * System.out.print("Please enter the space used by an end-post assembly in feet: ");
     * spaceUsedAssembly = keyboard.nextDouble();
     * System.out.print("Please enter the amount of space between the vines, in feet: ");
     * spaceBtwnVines = keyboard.nextDouble();
     
     * numGrapeVines = (lengthOfRow - (2 * spaceUsedAssembly)) / (spaceBtwnVines);
     * System.out.print("Total number of grapevines that will fit: " + numGrapeVines);
     */
     
    /*
     * Challenge #21 - Compound Interest
     * Topics used - Scanner class, Math.pow(num, numRaisedTo)
     * A = P(1 + R/N)^NT
     * A - Amount of money in the account after the specified number of years
     * P - Principle amount that was originally deposited into the account
     * R - Annual interest rate
     * N - Number of times per year the interest in compounded
     * T - Specified number of years
     
     // Math.pow(x,numraisedto)
     
     Scanner keyboard = new Scanner(System.in);
     double principle, interest, compound, years, finalAmt;
     System.out.print("Please enter the amount initially deposited: $");
     principle = keyboard.nextDouble();
     System.out.print("Please enter the annual interest rate (As a percentage): ");
     interest = keyboard.nextDouble();
     interest = interest / 100;
     System.out.print("Please enter the number the times per year that interest\nis compounded: ");
     compound = keyboard.nextDouble();
     System.out.print("How many years will the money stay in the account: ");
     years = keyboard.nextDouble();
     
     finalAmt = principle * Math.pow((1 + (interest / compound)),(compound * years));
     System.out.println("After interest accured, the new amount is: $" + finalAmt);
     */
   }
}

/*
21. Compound Interest
When a bank account pays compound interest, it pays interest not only on
principal amount that was deposited into the account, but also on the interest that has 
accumulated over time. Suppose you want to deposit some money into a savings account, and let the amount earn compound
interest for a certain number of years. The formula for calculating the balance of the account after a specified number 
of years:
A = P(1 + R/N)^NT
A - Amount of money in the account after the specified number of years
P - Principle amount that was originally deposited into the account
R - Annual interest rate
N - Numbere of times per year the interest in compounded
T - Specified number of years

20. Planting Grapevines
A vineyard owner is planting several new rows of grapevines and needs to know how many grapevines to plant in each row.
She has determined that after measuring the length of a future row, she can use the following formula to calculate 
the number of vines that will fit in the row, along with the trellis end-post assemblies that will need to be constructed
at each end of the row.

V = (R - 2E) / (S)
V - number of grapevines in the row
R - length of the row, in feet
E - amount of space used by an end-post assembly
S - space between vines, in feet

19. Stock Transcation Program
Last month Joe purchased some stock in Acme Sotware, Inc. Here are the details of the purchase:
1) The number of shares that Joe purchased was 1,000
2) When joe purchased the stock, he paid $32.87 per share
3) Joe paid his stockbroker a commission that amounted 2% of the amount he paid for the stock
Two weeks later Joe sold the stock. Here are the details of the sale:
1) The number of shares that joe sold was 1,000
2) He sold the stock for $33.92 per share
3) He paid his stockbroker another commission that amounted to 2% of the amount he received for the stock.

18. Word Game
Write a program that plays a word game with the user. 

17. Ingredient Adjuster
A cookie recipe calls for the following ingredients:
1) 1.5 cups of sugar
2) 1 cup of butter
3) 2.75 cups of flour

The recipe produces 48 cookies with these amounts of the ingredients. Write a program that asks the user how many cookies
they want to make, and then displays the number of cups of each ingredient needed for the specified number of cookies.

16. Energy Drink Consumption
A soft drink company recently surveyed 12,467 of its customers and found that
approximately 14 percent of those surveyed purchase one of more energy drinks per week. Of those customers who 
purchase energy drinks, approximately 64 percent of them prefer citrus-flavored energy drinks. Write a program that 
displays the following.
1) The approximate number of customers in the survey who purchase one or more energy drinks per week
2) The approximate number of customers in the survey who prefer citrus-flavored energy drinks

15. Stock Commission
Kathryn bought 600 shares of stock at a price of $21.77 per share. She must pay her stockbrocker a 2 percent commission
for the transcation. Write a program that calculates and displays the following:
1) The amount paid for the stock alone, without commission
2) The amount of the commission
3) The total amount paid (for the stock plus the commission)

14. Male and Female Percentages 
Write a program that asks the user for the number of males and the number of females registered 
in a class. The program should display the percentage of males and females in the class. 

1. Name, Age, and Annual Income
Write a program that declares the following:
- A string variable (variable is a reference variable to String object) named name
- an int variable named age
- a double variable named AnnualPay

2. Name and Initials
Write a program that has the following String variables: firstName, middleName, and lastName. 
Initialize these with your first, middle, and last names. The program should also have 
the following char variables: firstInitial, middleInitial, and lastInitial. Store your first, 
middle, and last initials in these variables. The program should display the contents on the screen.

3. Personal Information
Write a program that displays the following information, each on a seperate line:
- Your name
- Your address, with city, state, and ZIP
- Your telephone number
- Your college major
Use only one single println statement

4. Star Pattern

5. Sales Prediction
The East Coast sales division of a company generates 62 percent of total sales. Based on that percentage, write a program that will 
predict how much the East Coast Division will generate if the company has 4.6 million in sales this year.
Hint: Use the value 0.62 to represent percentages.

6. Land Calculation
One acre of land is equivalent to 43,650 square feet. Write a program that will calculate the 
number of acres in a tract of land with 389,767 square feet. Hint: Divide the size of the tract of land by the 
size of an acre to get the number of acres

7. Sales tax
Write a program that will ask the user to enter the amount of a purchase. The program should then compute 
the state and county sales tax. Assume the sales tax is 4 percent and the county sales tax is 2 percent. 
The program should then display the amount of the purchase, the state sales tax, the county sales tax, the total sales tax,
and the total of the sale (which is the sum of the amount of purchase plus the total sales tax).
Hint: Use the value 0.02 to represent 2 percent, and 0.04 to represent 4 percent.

8. Cookie Calories
A bag of cookies holds 40 cookies. The calorie information on the bag claims that there are 10 servings in 
the bag and that a serving equals 300 calories. Write a program that lets the user enter the number of cookies he or she 
actually ate and then reports the number of total calories consumed.

9. Miles-per-Gallon
A car's miles-per-gallon (MPG) can be calculated with the following formula:

MPG = Miles Driven / Gallons of gas used

Write a program that asks the user for the number of miles driven adn the gallons of gas used. It should calculate 
the car's miles-per-gallon and display the result on the screen.

10. Test Average
Write a program that asks the user to enter three test scores. The program should display each test score, as well 
the average of the scores.

11. Circuit Board Profit
An electronics company sells circuit boards at a 40 percent profit. If you know the retail price of a circuit board, you can
calculate its profit with the following formula:

Profit = Retail price * 0.4

Write a program that asks the user for the retail price of a circuit board, calculates the amount of profit earned for that
product, and displays the results on the screen.

12. String manipulator
Write a program that asks the user to enter the name of his or her favorite city. Use a String variable to store
the input. The program should display the following:
1) the number of characters in the city name
2) the name of the city in all uppercase letters
3) the name of the city in all lowercase letters
4) the first character in the name of the city

13. Restaurant Bill
Write a program that computes the tax and tip on a restaurant bill. The program should ask the user to enter
the charge for the meal. The tax should be 6.75 percent of the meal charge. The tip should be 20 percent of the total
AFTER adding the tax. Display the meal charge, tax amount, tip amount, and total bill on the screen.
*/
