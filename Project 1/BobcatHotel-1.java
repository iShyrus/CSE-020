import java.util.Scanner;

public class BobcatHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
       int roomOption, guests, AAA, clubMember, nights, meal = 0, clubMemberDiscount;
		double roomcost = 0, mealcost = 0, CBFinal = 0, AAADiscount = 0;
       
       Scanner keyboard = new Scanner(System.in);
       
       System.out.println("ROOM OPTIONS");
       System.out.println("Single @ $50.50 per night");
       System.out.println("Double @ $75.00 per night");
       System.out.println("Queen @ $100.75 per night");
       System.out.println("King @ $150.25 per night");
       System.out.println("Master Suite @ $225.50 per night");
       System.out.println("");
    
       System.out.print("Number of guests: ");
       guests = keyboard.nextInt();
       System.out.print("Please enter your choice of room (enter 1/2/3/4/5 corresponding to the options shown below): ");
       roomOption = keyboard.nextInt();
       System.out.print("Please enter the number of nights: " );
       nights = keyboard.nextInt();
       System.out.print("Are you an AAA member (enter 1 for yes, 0 for no): ");
       AAA = keyboard.nextInt();
       System.out.print("Are you a club member (enter 1 for yes, 0 for no): ");
       clubMember = keyboard.nextInt();

       System.out.println("");
       
       
       switch (clubMember)
       {
      case 0:
      System.out.println("Unfortunately, you didn't qualify for our 'Stay 4 nights get 1 free promotion.' " + "Better Luck Next time!");
      
      
    break;
      
       case 1: 
    
    	   if (nights >= 4)
    	   System.out.println("Congratulations! You've qualified for our 'Stay 4 nights get 1 free promotion.' Discount will be applied during checkout depending on the number of days.");
    	   else
    	   System.out.println("Unfortunately, you didn't qualify for our 'Stay 4 nights get 1 free promotion.' " + "Better Luck Next time!");

    	   
    break;
    }
       
       
       System.out.println("");
       
       if (roomOption == 5) 
       {System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)");
       System.out.println("0. Conplementary @ $0 per guest");
       System.out.println("1. Standard @ $30 per guest");
       System.out.println("2. Deluxe @ $50 per guest");
       System.out.println("3. Indulgence @ $85 per guest");
       System.out.println("");
       System.out.print("Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown above): ");
       meal = keyboard.nextInt();}
       
       
       if (roomOption < 5) {
       System.out.println("MEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)");
       System.out.println("0. Conplementary @ $0 per guest");
       System.out.println("1. Standard @ $30 per guest");
       System.out.println("2. Deluxe @ $50 per guest");
       System.out.println("");
       System.out.print("Please select your desired meal package (enter 0/1/2 corresponding to the options shown above): ");
       meal = keyboard.nextInt();
       }
       
       
	
       
       
       
       
       
       switch (roomOption)
       {
       
       case 1:
    	  roomcost = (50.50 * nights);
    	  
    	  
    	  
    	  switch (meal)
   	   {
   	   case 0:
   		   mealcost = 0;
   		   break;
   	   case 1:
   		   mealcost = (30 * guests * nights);
   		   break;
   	   case 2:
   	   	   mealcost = (50 * guests * nights);
   	   	break;
   	   }
    	  break;
    	  
       case 2:
    	  roomcost = (75.00 * nights);
    	  
    	  
    	  switch (meal)
   	   {
   	   case 0:
   		   mealcost = 0;
   		   break;
   	   case 1:
   		   mealcost = (30 * guests * nights);
   		   break;
   	   case 2:
   	   	   mealcost = (50 * guests * nights);
   	   	break;
   	   }
    	   break;
    	   
    	   
    	   
    	   
    	   
       case 3:
    	   roomcost = (100.75 * nights);
    	   
    	   switch (meal)
    	   {
    	   case 0:
    		   mealcost = 0;
    		   break;
    	   case 1:
    		   mealcost = (30 * guests * nights);
    		   break;
    	   case 2:
    	   	   mealcost = (50 * guests * nights);
    	   	break;
    	   }
    	   
    	   break;
       case 4:
    	   roomcost = (150.25 * nights);
    	   
    	   switch (meal)
    	   {
    	   case 0:
    		   mealcost = 0;
    		   break;
    	   case 1:
    		   mealcost = (30 * guests * nights);
    		   break;
    	   case 2:
    	   	   mealcost = (50 * guests * nights);
    	   	break;
    	   
    	   }   
    	   
    	   break;
    	   
       case 5:	   
       {   roomcost = (225.50 * nights);
    	   
    	   switch (meal)
    	   {
    	   case 0:
    		   mealcost = 0;
    		   break;
    	   case 1:
    		   mealcost = (30 * guests * nights);
    		   break;
    	   case 2:
    	   	   mealcost = (50 * guests * nights);
    	   	break;
    	   case 3: 
    	       mealcost = (85* guests * nights);
    	   	break;
    	   }
       }
    	       	   
    	   break;
    	   
       }
      
    	   
       
       
      
       
       
       
       if (nights >= 4 && clubMember == 1)
    	   switch (roomOption) {
    	   case 1:    
    		   clubMemberDiscount = (nights / 4);
    		   CBFinal = (clubMemberDiscount * 50.50);
    		   break;
    
    	   case 2:
    		   clubMemberDiscount = (nights / 4);
    		   CBFinal = (clubMemberDiscount * 75.00);
    		   break;
    		   
    	   case 3:
    		   clubMemberDiscount = (nights / 4);
    		    CBFinal = (clubMemberDiscount * 100.75);
    		    break;
    	   case 4:
    		   clubMemberDiscount = (nights / 4);
    		    CBFinal = (clubMemberDiscount * 150.25);
    		    break;
    	   case	5:  
    		   clubMemberDiscount = (nights / 4);
    		   CBFinal = (clubMemberDiscount * 225.50);
    		   break;
    	   }
    		   
    		   
    		   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
       
       System.out.println();
       System.out.println("Room Cost:			" + roomcost);
       
       if (meal >= 1)
       System.out.println("Meal Cost:  		       +" + mealcost);
       
  
       
       
       
       System.out.println("Preliminary Total Cost:		" + (roomcost + mealcost));
     
       
       if (AAA == 1) {
    	    AAADiscount = ((Math.round((roomcost + mealcost)*100) * .1) / 100);
           System.out.println("AAA Discount:		       -" + (AAADiscount));
       }
       if (clubMember == 1)
    	   
       System.out.println("Club Member Discount:	       -" + CBFinal);
       
       
      boolean pop = (AAA == 0 && clubMember == 0); {
       if (pop = true)
      System.out.println("No Discounts Applied");
      }
       
       
       
       
       System.out.println("Total Cost of Booking:		" + (roomcost + mealcost - AAADiscount - CBFinal));
       
       System.out.println();
       
         
       
       }
}
       

