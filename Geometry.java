import java.util.Scanner;

/**
   This program demonstrates static methods
*/

public class Geometry
{
	 /* This method is the main one wher it declares all variables and uses a switch to pick what other method is to be used
	  */
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
               value=circleArea(radius);
               
               // store the result in the value variable

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
               value= rectangleArea(length,width);
               // store the result in the value variable

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
               value= triangleArea(base,height);
               // store the result in the value variable

               System.out.println("The area of the " +
                                  "triangle is " + value);
               break;
            case 4:
               System.out.print("Enter the radius of " +
                                "the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circumference method and
               value=circleCircumfrence(radius);
               // store the result in the value variable

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
               value=rectanglePerimeter(width,length);
               // store the result in the value variable

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
               value= trianglePerimeter(side1,side2,side3);
               // store the result in the value variable

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
      keyboard.close();
   }
   
   // TASK #1 Create the printMenu method here
   /*this prints the menu for you to pick of of
    */
   static void printMenu( ) {
		  System.out.printf("This is a geometry calculator. \r\n" + 
		  		"Choose what you would like to calculate.\r\n" + 
		  		"\n");
		  System.out.printf(" 1 Find the area of a circle.\n");
		  System.out.printf(" 2 Find the area of a rectangle.\n");
		  System.out.printf(" 3 Find the area of a triangle.\n");
		  System.out.printf(" 4 Find the circumference of a circle.\n");
		  System.out.printf(" 5 Find the perimeter of a rectangle.\n");
		  System.out.printf(" 6 Find the perimeter of a triangle.\n");     
	  }

   // TASK #2 Create the value-returning methods here
   /*formula for area of a circle
    */
   static double circleArea(double radius) {
	    return (Math.pow(radius, 2)*Math.PI);
   }
   /*formula for area of a rectangle
    */
   static double rectangleArea(double width,double length) {
	   return (length*width);
   }
   /*The area of a triangle formula
    */
   static double triangleArea(double base,double height) {
	   return (.5*base*height);
   }
   /*this is the perimiter of a rectangle formula
    */
   static double rectanglePerimeter(double width,double length) {
	   return ((length+width)*2);
   }
   /*this is the perimiter of a triangle formula
    */
   static double trianglePerimeter(double side1,double side2, double side3) {
	   return (side1+side2+side3);
   }
   /*This is the circumfrence formula
    */
   static double circleCircumfrence(double radius) {
	   return (radius*Math.PI*2);
   }
   
   // TASK #4 Write javadoc comments for each method
}
	

