
public class Logic_Test {

	public static void main(String[] args) {
		// Running the Boolean expressions from Question 1 from Week 2 HW:
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println(false && false);
		System.out.println(true && (false || true));
		System.out.println(false || (true && false) );
		System.out.println(false || (1<5));
		System.out.println((5>=4) && (1>3));
		System.out.println((10<4) || (1>4));
		System.out.println((12>=2) && (1<24));
		String word = "Hello";
		char result = word.charAt(0);
		System.out.println( result == 'h');
		}

}
