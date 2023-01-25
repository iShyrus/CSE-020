import java.util.Scanner;

public class Errors6 {

	public static void main(String[] args) {
		System.out.println("This program will ask the user for three sets of two numbers and will calculate the average of each set.");

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.print("Please enter the first number: ");
		n1 = input.nextInt();

		System.out.print("Please enter the second number: ");
		n2 = input.nextInt();

		int average;
		average = (n1+n2)/2;
		System.out.println("The average of the numbers is " + average);

		

		float n3, n4;

		System.out.print("Please enter the first number:");
		n3 = input.nextFloat();

		System.out.print("Please enter the second number: ");
		n4 = input.nextFloat();

		float average1;
		average1 = (n3+n4)/2;
		System.out.println("The average of the numbers is " + average1);

		
		
		short n, m;
		int Avg;
		
		System.out.print("Please enter the first number: ");
		n = input.nextShort();

		System.out.print("Please enter the second number: ");
		m = input.nextShort();

		
		Avg = (short)(n + m)/2;
		System.out.print("The average of the numbers is " + Avg);
	}

}
