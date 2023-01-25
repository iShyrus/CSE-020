import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the max amount of numbers to add: ");

		int max = input.nextInt() - 1;
		int i = 0, result = 0;
		double average = 0, sum = 0;
		
		do {

			System.out.println("Number " + (i+1) );
			i++; 
			
			result = result+i;
	

			}
			
			
		 while (i <= max);{
		
		
		
		}
		 System.out.println("The sum of all numbers from 0 to " + (max+ 1) + " is: " + result);


			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}