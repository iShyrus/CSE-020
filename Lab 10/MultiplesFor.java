import java.util.Scanner;

public class MultiplesFor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number: ");

		int max = input.nextInt();
		
		System.out.print("Please enter the base number whose multiples to print:");
		
		int multiple = input.nextInt();
		
		System.out.println("Multiples of " + multiple + " from 0 till " + max + " are: ");
		
		
		
		for (int i = 0; i <= max; ) {
			System.out.println("Number " + i);
			i += multiple ; 
			
			
			
			
		}
	}
}
