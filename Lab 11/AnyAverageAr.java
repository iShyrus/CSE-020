import java.util.*;

public class AnyAverageAr
{
   public static void main (String[] args)
   {
      
       
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Please choose number of values to average : ");
       int max = keyboard.nextInt();
       
       System.out.print("Please choose column width four output formatting : ");
       int column = keyboard.nextInt();
       
       int [] array=new int[max];
       double avg,sum = 0;
       int num = 0;
       
       for(int i=0;i<max;i++) {
       
       System.out.print("Please enter value #" + (i+1)+ ": ");
       num = keyboard.nextInt();
       array[i]=num;
       }
       
       System.out.println();
       System.out.print("The number being averaged are ...");
       System.out.println();
       
       for(int i=0; i<max; i++) {
       
           sum = sum + array[i];
           
           if(i % column==0)   
           System.out.println();
           System.out.print(array[i]+" ");
       }
       
       
       System.out.println();
       System.out.println();
       System.out.println("Average is: "+ (sum / max));
   }
}