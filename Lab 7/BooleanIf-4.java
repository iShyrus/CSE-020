import java.util.Scanner;

public class BooleanIf{
	public static void main(String[] args) {
		int a = 0, b = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		a = in.nextInt();
		System.out.print("Input the second number: ");
		b = in.nextInt();

		if (a > b) {
			System.out.println(a + " is greater than " + b);
			System.out.println(a + " is not equal to " + b);
			
			
		}

		else if (a == b) {
			System.out.println(a + " is greater than or equal to " + b);
			System.out.println(a + " is less than or equal to " + b);
			System.out.println(a + " is equal to " + b);
		}
		
		else {
			System.out.println(a + " is less than or equal to  " + b );
			System.out.println(a + " is not equal to  " + b );

			
			
		}
		
		

		
	}
} 