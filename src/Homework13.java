// TODO: This should all be in Unit 4 (Semester 2)

public class Homework13 {


	/* Problem 2:
	 * Insert the value n at index i, shifting values
	 * to the right. Ignore any issue where a value
	 * would be lost
	 */
	public static void problem2(int[] arr, int n, int i) {

	}
	
	/* Problem 4:
	 * Insert the value n at index i, shifting values
	 * to the right. If any value would be lost
	 * (i.e. the last value is not -1), create a new
	 * array to hold all of the values; return the
	 * resulting array
	 * Hint: You have already written a method that
	 *       inserts an element into an array
	 */
	public static int[] problem4(int[] arr, int n, int index) {
		return null;
	}
	


	/* Do all of your work in the Moth class; do not put any code
	 * in this file
	 */
	
	/* Problem 1:
	 * Write the instance variables and a constructor for the Moth
	 * class. A Moth has an x and y coordinate that are doubles.
	 * The constructor should take in two doubles as parameters.
	 */


	/* Problem 2:
 	 * Write the attraction method of the Moth class. It should
 	 * take in a single LightSource as a parameter and return the
 	 * how attractive that LightSource is to the Moth. The formula
 	 * to calculate how attractive a LightSource is intensity / distance^2.
 	 * It should return a double.
 	 * Hint: Look at the LightSource class to see what methods
 	 *       are available
 	 * Hint: The distance formula is squareroot((x2 - x1)^2 + (y2 - y1)^2)
 	 */


	/* Problem 3:
  	 * Write the moveTowards method of the Moth class. It should
  	 * take in a single LightSource as a parameter and move the Moth
  	 * halfway towards that LightSource by updating its coordinates.
  	 * It should not return any value.
  	 * Hint: The midpoint formula is (x2 - x1) / 2 , (y2 - y1) / 2
  	 */


	/* Problem 4;
	 * Write the mostAttractive method of the Moth class. It should
	 * take in an array of LightSources and return the LightSource
	 * that this Moth is most attracted to.
	 * Hint: Use the method you already wrote to calculate each
	 *       LightSource's attraction
	 */
	
	
	/* Problem 5:
	 * Write the movement method of the Moth class. It should take
	 * in an array of LightSources and move the Moth towards the
	 * LightSource if finds most attractive. It should not return
	 * any value.
	 * Hint: You have already written methods to find the most
	 *       attractive LightSource and to move the Moth towards
	 *       a LightSource
	 */

	public static void main(String[] args) {
		Tests.runTests();
	}

}
