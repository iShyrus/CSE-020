import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
			
		
		// name // 
		
			String name;
			System.out.print("What is your name? ");
			name = input.next();
			// remaining inputs will go here
			System.out.println(); // gap between input and output
			System.out.print("Their name is ");
			System.out.println(name);
			// remaining outputs will go here
		
			System.out.println();
		
			
			// date // 
			
			
		String date;
		System.out.print("What year did you attend UC Merced?");
		int dates;
		dates = input.nextInt();
		System.out.println();
		System.out.print("They attended UC Merced at ");
		System.out.println(dates);
		
		System.out.println();
		
		
		
		// personality //
		
		String personality;
		System.out.print("Describe your personality ");
		personality = input.next();
		System.out.println(); 
		System.out.print("Their personality is ");
		System.out.println(personality);
		
		System.out.println();
		
		
		
		// describe //
		
		
		String describe;
		System.out.print("Describe yourself in one word ");
		describe = input.next();
		System.out.println(); 
		System.out.print("They described themselves as ");
		System.out.println(describe);
		
		System.out.println();
		
		
		// animal // 
		
		String animal;
		System.out.print("What animal do you see yourself as? ");
		animal = input.next();
		System.out.println(); 
		System.out.print("I see myself as a");
		System.out.println(animal);
		
		
	}
	}

		
		
		
		
		