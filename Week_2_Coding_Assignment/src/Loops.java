
public class Loops {

	public static void main(String[] args) {
		/*
		 * // In the main method of this class, create the following loops with any
		 * variables you feel are needed: d. A for loop that prints every number from 0 to 100, but if the
		 * number is divisible by 3, it prints “Hello” instead of the number, and if the
		 * number is divisible by 5, it prints “World” instead of the number, and if it
		 * is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		 */
		// situation a) A while loop that prints all even numbers
		// from 0 to 100
//		int i = 0;
//		while (i <= 100) {
//			System.out.println(i);
//			i += 2;
//		}
		// situation b) A while loop that prints every 3rd number going backwards
		// from 100 until we reach 0
//		int t = 100;
//		while (t >= 0) {
//			System.out.println(t);
//			t -= 3;
//		}
		// situation c) A for loop that prints every other number from 1
		// to 100
//		for (int g = 1; g <= 100; g += 2) {
//			System.out.println(g);
//		}
		/*
		 * //situation d) A for loop that prints every number from 0 to 100, but if the
		 * number is divisible by 3, it prints “Hello” instead of the number, and if the
		 * number is divisible by 5, it prints “World” instead of the number, and if it
		 * is divisible by both 3 and 5, it prints “HelloWorld” instead of the number.
		 */
		for (int d = 0; d <= 100; d++) {
			if ((d % 3 == 0) && (d % 5 ==0 )) {
				System.out.println("HelloWorld");
			}
			else if (d % 3 == 0) {
				System.out.println("Hello");
			}
			else if (d % 5 == 0) {
				System.out.println("World");
			}
			else System.out.println(d);
		}
		
		
	}
	
}
