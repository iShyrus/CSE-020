import java.util.Scanner;

public class Manipulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int n1, n2, n3, n4;
		
		
		System.out.println("Input two integers");
		n1 = input.nextInt();
		n2 = input.nextInt();
		System.out.println("The sum of " + n1 + " and " + n2 + " is " + (int)(n1 + n2));
		System.out.println("The difference of " + n1 + " and " + n2 + " is " + (int)(n1 + n2));
		System.out.println("The product of " + n1 + " and " + n2 + " is " + (int)(n1 * n2));
		System.out.println("The integer cast of " + n1 + " / " + n2 + " is " + (int)(n1 / n2));
		System.out.println("The integer cast of " + n1 + " % " + n2 + " is " + (int)(n1 % n2));

		String number2;
		
		System.out.println("\nInput two shorts");
		n3 = input.nextShort();
		n4 = input.nextShort();
		System.out.println("The sum of " + n3 + " and " + n4 + " is " + (short)(n3 + n4));
		System.out.println("The difference of " + n3 + " and " + n4 + " is " + (short)(n3 - n4));
		System.out.println("The product of " + n3 + " and " + n4 + " is " + (short)(n3 * n4));
		System.out.println("The integer cast of " + n3 + " / " + n4 + " is " + (short)(n3 / n4));
		System.out.println("The integer cast of " + n3 + " % " + n4 + " is " + (short)(n3 % n4));

		double n5, n6, n7, n8; 
		String number3;
		
		System.out.println("\nInput two floats");
		n5 = input.nextDouble();
		n6 = input.nextDouble();
		System.out.println("The sum of " + n5 + " and " + n6 + " is " + (float)(n5 + n6));
		System.out.println("The difference of " + n5 + " and " + n6 + " is " + (float)(n1 - n2));
		System.out.println("The product of " + n5 + " and " + n6 + " is " + (float)(n5 * n6));
		System.out.println("The integer cast of " + n5 + " / " + n6 + " is " + (float)(n5 / n6));
		System.out.println("The integer cast of " + n5 + " % " + n6 + " is " + (float)(n6 % n6));

		String number4;
		
		System.out.println("\nInput two doubles");
		n7 = input.nextDouble();
		n8 = input.nextDouble();
		System.out.println("The sum of " + n7 + " and " + n8 + " is " + (double)(n7 + n8));
		System.out.println("The difference of " + n7 + " and " + n8 + " is " + (double)(n7 - n8));
		System.out.println("The product of " + n7 + " and " + n8 + " is " + (double)(n7 * n8));
		System.out.println("The integer cast of " + n7 + " / " + n8 + " is " + (double)(n7 / n8));
		System.out.println("The integer cast of " + n7 + " % " + n8 + " is " + (double)(n7 % n8));

		
	}

}
