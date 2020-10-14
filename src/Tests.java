
/* Test cases to check that you have completed
 * each problem correctly. DO NOT modify this
 * code to force it to work; I check that this
 * file has not been modified prior to grading.
 * If you change this file, you will receive a 0.
 */

public class Tests {

	public static void main(String[] args) {
		if (args.length < 2) {
			runTests();
		} else {
			int test, value1, value2, value3;
			try {
				test = Integer.parseInt(args[0]);
				value1 = Integer.parseInt(args[1]);
				value2 = args.length > 2 ? Integer.parseInt(args[2]) : 0;
				value3 = args.length > 3 ? Integer.parseInt(args[3]) : 0;
			} catch (NumberFormatException e) {
				return;
			}
			switch (test) {
			case 1:
				System.out.println(test1(value1));
				break;
			case 2:
				System.out.println(test2(value1, value2));
				break;
			case 3:
				System.out.println(test3(value1, value2, value3));	
				break;
			case 4:
				System.out.println(test4(value1));
				break;
			case 5:
				System.out.println(test5(value1, value2));
				break;
			}
		}
	}
	
	private static int[] randomArray(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * n);
		}
		return arr;
	}
	
	private static boolean test1(int value1) {
		return true;
	}
	
	private static boolean test2(int value1, int value2) {
		return true;
	}
	
	private static boolean test3(int value1, int value2, int value3) {
		return true;
	}
	
	private static boolean test4(int value1) {
		return true;
	}
	
	private static boolean test5(int value1, int value2) {
		return true;
	}
	
	public static void runTests() {
		boolean passed = true;
		
 		if (test1(13)) {
 			System.out.println("Pass 1");
 		} else {
 			System.out.println("Fail 1");
 			passed = false;
 		}

 		if (test2(11, 3)) {
 			System.out.println("Pass 2");
 		} else {
 			System.out.println("Fail 2");
 			passed = false;
 		}

 		if (!test3(17, 5, 6)) {
 			System.out.println("Fail 3.1");
 			passed = false;
 		} else if (!test3(17, 5, -1)) {
 			System.out.println("Fail 3.2");
 			passed = false;
 		} else {
 			System.out.println("Pass 3");
 		}

 		if (test4(13)) {
			System.out.println("Pass 4");
 		} else {
 			System.out.println("Fail 4");
 			passed = false;
 		}

		if (test5(7, 11)) {
			System.out.println("Pass 5");
 		} else {
 			System.out.println("Fail 5");
 			passed = false;
 		}

		if (passed) {
			System.out.println("All Passed");
		} else {
			System.out.println("Failed");
		}
	}
	
}
