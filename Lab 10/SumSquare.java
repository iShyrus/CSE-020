import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		
		
		for (int i = 1, sum = 0; i < max + 1; i++) {
			
			
			
			System.out.println("Number " + (i*i)) ;
			sum = sum + (i*i);
			if (i == max) {
				System.out.println("");

				System.out.println("The sum of squares of all numbers from 1 till " + max + " is: " + sum );

				
			}
			
		}
		


		
	}
}

			
			
			
		
		
		
		
	


