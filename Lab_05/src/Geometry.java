import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
   public static void main(String[] args)
   {
      int choice;       // The user's choice
      double value = 0; // The method's return value
      char letter;      // The user's Y or N decision
      double radius;    // The radius of the circle
      double length;    // The length of the rectangle
      double width;     // The width of the rectangle
      double height;    // The height of the triangle
      double base;      // The base of the triangle
      double side1;     // The first side of the triangle
      double side2;     // The second side of the triangle
      double side3;     // The third side of the triangle

      // Create a scanner object to read from the keyboard
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first
      do
      {
         // TASK #1 Call the printMenu method
    	 printMenu();
         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // store the result in the value variable
               
               value = circleArea(radius);
               System.out.println("The area of the " +
                                  "circle is " + value);
               break;
            case 2:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // store the result in the value variable
               
               value = rectangleArea(length, width);
               System.out.println("The area of the " +
                                  "rectangle is " + value);
               break;
            case 3:
               System.out.print("Enter the height of " +
                                "the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of " +
                                "the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // store the result in the value variable
               value = triangleArea(base, height);
               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               // store the result in the value variable
               value = circleCircumference(radius);
               System.out.println("The circumference " +
                                  "of the circle is " +
                                  value);
               break;
            case 5:
               System.out.print("Enter the length of " +
                                "the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of " +
                                "the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = rectanglePerimeter(length, width);
               System.out.println("The perimeter of " +
                                  "the rectangle is " +
                                  value);
               break;
            case 6:
               System.out.print("Enter the length of " +
                                "side 1 of the " +
                                "triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 2 of the " +
                                "triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of " +
                                "side 3 of the " +
                                "triangle: ");
               side3 = keyboard.nextDouble();

               // TASK #3 Call the perimeter method and
               // store the result in the value variable
               value = trianglePerimeter(side1, side2, side3);
               System.out.println("The perimeter of " +
                                  "the triangle is " +
                                  value);
               break;
            default:
               System.out.println("You did not enter " +
                                  "a valid choice.");
         }
         keyboard.nextLine(); // Consume the new line

         System.out.println("Do you want to exit " +
                            "the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }
   // TASK #1 Create the printMenu method here
   /**
    * This method displays the menu (series of options) when called.
    * No arguments are used in this method.
    */
   public static void printMenu() {
	   
	   System.out.println("This is a geometry calculator");
	   System.out.println("Choose what you would like to calculate");
	   System.out.println("1. Find the area of a circle");
	   System.out.println("2. Find the area of a rectangle");
	   System.out.println("3. Find the area of a triangle");
	   System.out.println("4. Find the circumference of a circle");
	   System.out.println("5. Find the perimeter of a rectangle");
	   System.out.println("6. Find the perimeter of a triangle");
	   System.out.print("Enter the number of your choice: ");
   }
   // TASK #2 Create the value-returning methods here
   
   /**
    * Returns the area of a circle.
    * If user enters 1 on the menu, this method will ask user to enter
    * a value for the radius.
    * The radius argument must be a number.
    * The result will be stored in the variable called value as a double. 
    * 
    * @param radius a number that the user will input into the program as the radius
    * 
    * @return the value of the area of the circle
    */
   public static double circleArea (double radius) {
	   double value = Math.PI * radius * radius;
	   return value;
   }
   /**
    * Calculates and returns the area of a rectangle.
    * Takes user input of length and width for arguments.
    * Arguments must be numbers for this method to work. 
    * Calculates the area by multiplying the length and width together.
    * @param length must be a positive number 
    * @param width must be a positive number
    * @return returns the value of the area as the variable called value.
    */
   public static double rectangleArea (double length, double width) {
	   double value = length * width;
	   return value;
   }
   /**
    * Calculates and returns the area of a triangle.
    * Takes user input of base and height for arguments.
    * Arguments must be numbers for this method to work.
    * Calculates the area by taking 1/2 multiplied by the base multiplied by the height.
    * @param base must be a positive number
    * @param height must be a positive number
    * @return returns the value of the triangle area as the variable called value
    */
   public static double triangleArea (double base, double height) {
	   double value = 0.5 * base * height;
	   return value;
   }
	/**
	 * Calculates the circumference of a circle.
	 * Takes user input of radius for an argument.
	 * Argument must be a positive number.
	 * uses the equation circumference of circle = 2(pi)r
	 * @param radius the length of the radius of the circle
	 * @return the circumference of the circle stored in the variable called value.
	 */
   public static double circleCircumference (double radius) {
	   double value = 2 * Math.PI * radius;
	   return value;
   }
   /**
    * Calculates the perimeter of a rectangle.
    * Takes arguments length and width from user input.
    * Arguments must be a positive number.
    * Uses the equation (2L)+(2W) to calculate the perimeter
    * @param length the length of the length of the rectangle
    * @param width the length of the width of the rectangle
    * @return the perimeter of the rectangle
    */
   public static double rectanglePerimeter (double length, double width) {
	   double value = (2 * length) + (2 * width);
	   return value;
   }
   /**
    * Calculates the triangle perimeter.
    * Takes arguments side1, side2, and side3.
    * All arguments must be positive numbers.
    * Adds up all sides to calculate the perimeter. 
    * @param side1 length of side 1
    * @param side2 length of side 2
    * @param side3 length of side 3
    * @return the perimeter of the triangle
    */
   public static double trianglePerimeter (double side1, double side2, double side3) {
	   double value = side1 + side2 + side3;
	   return value;	   
   }
   
   
   // TASK #4 Write javadoc comments for each method
}