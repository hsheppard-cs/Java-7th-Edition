class chapterThreeNotes
{
   /**
   * Author: Hamilton Sheppard
   * Version 1 - Chapter 3 Notes
   * Purpose of this file was to further my understanding of the content read in
   * Java: From Control Structures through Objects 7th Edition
   */
   public static void main(String[] args)
   {
      // The conditional operator
      int score = 75;
      System.out.println("Your grade is: " + 
                        (score < 60 ? "Fail." : "Pass."));
     /*
     Note: Parenthesis are placed around the conditional expression because the + 
     operator has higher precedence than the ?: operator,
     Which is used instead of:
     if (score < 60)
      System.out.println("Your grade is: Fail.");
     else
      System.out.println("Your grade is: Pass.");
     */
     
     // System.out.printf with floating-point numbers %f (double, float (F))
     double temp1 = 72.5, temp2 = 83.7;
     System.out.printf("The temperature are %f and %f degrees.\n",temp1, temp2);
     // System.out.printf with decimal integer numbers (int, short, long)
     int hours = 40;
     System.out.printf("I worked %d hours this week.\n",hours);
     // System.out.printf with precision (.1 is the precision)
     double temp_v1 = 78.4971;
     System.out.printf("The temperature is %.2f degrees. \n", temp_v1);
     // System.out.printf with mimimum field with (20 is the width)
     double number = 1234.567;
     System.out.printf("The number is: %20f\n", number); // indicating that the number
                                                         // should be displayed 20 spaces wide
     // combining minimum field with and precision in the same
     // format specifier
     // double number = 1234.567
     System.out.printf("The number is: $12.2f\n",number); 
     // rounded to 2 decimal places and displayed 12 spaces wide
     
     // formattign string arguments
     String name = "Ringo";
     System.out.printf("Your name is %s\n",name);
   }
}

/*
Comparing String Object notes:
- String class has an equals() method to compare two string objects
StringReference1.equals(StringReference2)
Ex:
if (name1.equals(name2))
- You can also compare string literals using this method
Ex:
if (name1.equals("Mark"))
- To determine whether two strings are NOT equal, you can apply "!", the logical
NOT operator
Ex:
if (!name1.equals("Mark"))
- The String class also provides the compareTo method determine whether one string is 
greater, equal to, or less than another string
StringReference1.compareTo(OtherString)
OtherString can mean either a string literal or reference variable
- The compareTo method will return a integer value which can be used in the following manner:
  1) If the methods return value is negative (-1), StringReference is less than OtherString
  2) If the methods return value is 0, the two strings are equal
  3) If the methods return value is 1, StringReference is greater than OtherString
  Ex:
  if (name1.compareTo(name2) == 0)
   do something...
  if (name1.compareTo("Joe") == 0)
   do something...
- To perform case-insensitive comparisons, the String class provides equalsIgnoreCase and 
compareToIgnoreCase methods which are equivalent to equals and compareTo, except the case of the
characters in the strings are ignored

Conditional Operator Notes:
The conditional operator provides a shorthand method of expressing a simple if-else statement.
The operator consists of the question mark (?) and the colon (:). You can use the question mark,
?, and the colon, :, in the format:
BooleanExpression ? Value1 : Value2;
-- BooleanExpression is equivalent to boolean expression in the parenthesis of an if statement
-- If the expression is true, the value is set to Value1
-- If the expression is false, the value is set to Value2
Ex:
y = x < 0 ? 10: 20;
Which is the same as 
if (x < 0)
   y = 10;
else 
   y = 20;
   
Switch Statement notes:
The switch statement is a multiple alternative decision structure. It allows you to test the value 
of a variable or an expression and then use that value to determine which statmenet or set of statements
to execute
General Format
switch (testExpression) - The testExpression is a variable or expression
                        - that gives a char, byte, short, int, or string value
{
   case value_1:
      statement;
      statement;
      etc.
      break;
   case value_2:
      statement;
      statement;
      etc.
      break;
   case value_N: - Insert as many case sections as necessary
      statement;
      statement;
      etc.
      break;
   default: - Default statement is executed if the testExpression is not equal to any values
      statement;
      statement;
      etc.
      break;
- The switch statement can be used as an alternative to an if-else-if statement that compares 
the same variable or expression to several different values
- String values can now be test expressions provided by Java 7

Displaying formatted output with System.out.printf and String.format
- System.out.printf allows rounding, insertion of commas
- Format: System.out.printf(FormatString, ArgumentList)
- FormatString is a string that contains text, special formatting specifiers, or both
- ArgumentList is a list of zero or more additional arguments, which will be formatted 
according to the format specifiers listed in the format string
Ex:
1)System.out.printf("I love java programming.\n") - zero arguements, only the format string
2) double sales = 12345.67
   System.out.printf("Our sales are %f for the day.\n", sales)
* Things to note: 
   - Inside the format string, the %f is the format specifier. The letter
   f indicates that a floating-point (float data type) value will be inserted into the string when it
   is displayed
   - Following the format string, the sales variable is passed as an argument. This argument corresponds
   to %f - format specifier that appears inside the format string
   - %f must be used with floating-point values and %d must be used with integer values, otherwise
   a runtime error will occur (Error pops up as the code is running)
- Format Specifier Syntax:
  General syntax for writing a format specifier is:
  %[flags][width][.precision]conversion (Items inside the brackets are optional)
  Summary of each:
  % - All format specifiers begin with %
  flags - after the % character, one or more optional flags may appera. Flags cause the 
  value to be formatted in a variety of ways.
  width - After any flags, you can optionally specifiy the minimum field width for the value 
  .precision - If the value is a floating-point number, after the minimum field width, you 
  can optionally specify the precision. This is the number of decimal places that the number 
  should be rounded to.
  conversion - All format specifiers must end with a conversion character, such as f for floating-point, 
  or d for decimal integer
- Flags in format specifers:
  Used for many purposes such as -
  1) Display numbers with comma seperators (Insert a comma, ",")
  2) To pad numbers with leading zeros (Insert a zero, "0")
  3) To left justify numbers (Insert a hypen, "-")
  If you use a flag, it must be written before the field width and precision
- Formatting string arguements:
  The format specifier is %s for strings
  You can use a field width when printing strings ([width] placed before precision with numbers)
  Strings can be left justified using the minus flag (-)
  * More format specifiers in the API documentation
- String.format method
 ) The String.format method returns a reference to the formatted string, and the reference
   can be assigned to a variable.
 ) Format: String.format(FormatString, ArgumentList.)

}

*/