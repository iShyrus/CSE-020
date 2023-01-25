import java.util.Scanner;


public class Lab2 {

	public static void main(String[] args) {

		
// use \n and \t for spacing
		
		Scanner input = new Scanner (System.in);

		System.out.print("Please enter the sample size: ");
		int samples = input.nextInt();
		int i = 0;
		int tri = 4;
		int num = 0;

		int [] sample = new int [tri * samples];
		double [] avg = new double [tri];
		int [] sum = new int [tri];
		
		for (i = 0; i < tri; i++) {
		System.out.println("Enter numbers for Trial " + i);
		
		
		
		for (num = 0; num < samples; num++ ) {
		System.out.print("Enter sample # " + (num + 1) + ": ");
		sample[num * tri + i]= input.nextInt();
		sum[i] += sample [num * tri + i]; }
		System.out.println(); }
		
		
		
		
		
		
		double minimum =avg[0];
		double maximum = avg[0];
		for (i = 0; i < tri; i++) {
		if (avg [i] < minimum)
		minimum = (int) avg[i];
		if (avg [i] > maximum)
		maximum = (int) avg [i] ; }

		for (i = 0; i < tri; i++) {
			avg [i] = sum [i] / samples; }
		
		
		
		System.out.println("\n\tSample #\tTrial 1\t\tTrial 2\t\tTrial 3\t\tTrial 4");

		for (num = 0; num < samples; num++) {
		System.out.print("\t"+ num + "\t");
		
		for (i = 0; i < tri; i++) {
		System.out.print("\t" + sample[num* tri + i] + "\t"); }
		
		System.out.print("\n"); }
		
		
		
		System.out.println("");
		System.out.println("\t------------------------------------------------------------------");
		System.out.println("\t");
		System.out.print("Averages:");
		
		for (i = 0; i < tri; i++) {
			System.out.print("\t");
		System.out.print(avg[i]); 
		System.out.print("\t");
		}
		
		
		System.out.println();
		System.out.println();
		System.out.println("Min Average: " + minimum);
		System.out.println("Max Average: " + maximum);
		System.out.println();


		if (minimum == maximum) {
		System.out.print("The trials match EXACTLY!"); }
		else if (maximum < (minimum *2)) {
		System.out.print("The trials concur with each other!"); }
		else {
		System.out.print("The trials do NOT concur!");}
	}

}
