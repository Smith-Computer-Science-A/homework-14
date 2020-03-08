import java.awt.Rectangle;

public class Homework14 {

	/* Problem 1:
	 * Write the instance variables for the Homework14 class.
	 * The Homework14 class should have one String and one Rectangle,
	 * and both should be private
	 */


	/* Problem2:
	 * Write a constructor for the Homework14 class. It
	 * should take in two parameters, a String and a Rectangle
	 * and use that to initialize the two instance variables.
	 * Hint: The order of parameters matters; check the test
	 *       code if you are unsure which should come first
	 */


	/* Problem 3:
 	 * Write a no-args constructor for the Homework14 class. It
 	 * should not take in any arguments (no-args) and should initialize
	 * the String to "Rectangle" and the Rectangle to a Rectangle with
	 * width and height of 1. You must call the constructor you wrote
	 * for Problem2 to get credit.
	 * Hint: The this keywork can be used to call a constructor
 	 */


	/* Problem 4:
  	 * Write the clone method for the Homework14 class.
  	 * It should take in no parameters and should return a new
	 * Homework14 object with the same instance variables.
  	 */


	/* Problem 5:
   	 * Write the toString method for the Homework14 class.
   	 * It should take in no parameters and should return a String formatted
	 * as the String instance variable followed by a dash, the area of the
	 * Rectangle and "m2". For examble, the toString method of a Homework14
	 * created with the no-args constructor would return:
	 * "Rectangle - 1 m2"
   	 */

	 public static void main(String[] args) {
 		boolean passed = true;

		System.out.println("Pass 1");

 		Homework14 hw141 = new Homework14("Tester", new Rectangle(2, 3));
		if (!hw141.toString().equals("Tester - 6 m2")) {
			passed = false;
			System.out.println("Fail 2");
		} else {
			System.out.println("Pass 2");
		}

		Homework14 hw142 = new Homework14();
		if (!hw142.toString().equals("Rectangle - 1 m2")) {
			passed = false;
			System.out.println("Fail 3");
		} else {
			System.out.println("Pass 3");
		}

		Homework14 hw143 = hw141.clone();

 		if (!hw143.toString().equals("Tester - 6 m2")) {
 			System.out.println("Fail 4.1");
 			passed = false;
 		} else if (hw141 == hw143) {
 			System.out.println("Fail 4.2");
 			passed = false;
 		} else {
 			System.out.println("Pass 4");
 		}

		if (!hw141.toString().equals("Tester - 6 m2")) {
			passed = false;
			System.out.println("Fail 5");
		} else {
			System.out.println("Pass 5");
		}

  		if (passed) {
  			System.out.println("All Passed");
  		} else {
  			System.out.println("Failed");
  		}
 	}

}
