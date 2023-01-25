import java.util.Scanner;

public class Interview2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner input = new Scanner(System.in);
			
		
		// name // 
		
			String name;
			System.out.print("What is your name? ");
			name = input.next();
			// remaining inputs will go here
			System.out.println(); // gap between input and output
			
			// remaining outputs will go here
		
			System.out.println();
		
			
			// date // 
			
			
		String date;
		System.out.print("What year did you attend UC Merced?");
		int dates;
		dates = input.nextInt();
		System.out.println();
		
		
		System.out.println();
		
		
		
		// personality //
		
		String personality;
		System.out.print("Describe your personality ");
		personality = input.next();
		System.out.println(); 
		
		
		System.out.println();
		
		
		
		// describe //
		
		
		String describe;
		System.out.print("Describe yourself in one word ");
		describe = input.next();
		System.out.println(); 
	
		System.out.println();
		
		
		// animal // 
		
		String animal;
		System.out.print("What is your favorite animal? ");
		animal = input.next();
		System.out.println(); 
		
		
		
		System.out.println();
		
		
		String heigh;
		System.out.print("What is your height in inches?");
		double height;
		height = input.nextDouble();
		System.out.println();
		
		String paragraph;
		
		System.out.print("So your name is " + name + ". You attended UC Merced in " + (float)dates + ". You also described yourself as " + personality + ". To describe yourself in one word you said " + describe + ". Your favorite animal is a" + animal + ". Also, your height in centimeters is " + (float)(height * 2.54) + ".");
		
		
		
		
	}

}
