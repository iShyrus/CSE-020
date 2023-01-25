import java.util.Scanner;

public class AllNumDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int i = 0;
		int num = 0;
		int het = 0;
		double sum = 0;
		int divide = 0;
		double average;
		System.out.println("Enter 0 or less to stop entering numbers. ");
		

		
		do {
			
			System.out.print("Enter value #" + (i+1) + ": ");
			het = input.nextInt();
			i++;
			if (het > 0) {
				sum = het + sum;
			}
			
			
		} while (het > 0);
		
		if(sum > 0) {
			
			average = (sum) / (i-1);
			
			
		System.out.println("Average is: " + (average));

		
		}
		else if (sum < 0) {
		System.out.println("No positive numbers were input.");
		}
			
		
		
	}
}
