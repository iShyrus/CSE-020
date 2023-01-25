import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);

		System.out.print("Please choose the number of values to average: ");

		double max = input.nextInt();
		int i = 1;
		double average, e = 0, result = 0;
		
		 
		while ( i <= max) {
			System.out.print("Please enter the " + (i) + " number: ");
			i++;
			e = input.nextInt() + e;
		
			
			
		}
		average = e/max;
		
		System.out.println(average);
		
	}

}
