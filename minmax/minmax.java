import java.util.Scanner;

public class minmax {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number1, number2;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the First Number : ");
		number1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Number : ");
		number2 = sc.nextInt();	
		
		if(number1 > number2) 
	    {
         System.out.println();
         System.out.println("number1: " + number1);
         System.out.println("number2: " + number2);
			System.out.println( number2 + " is less than " + number1);          
	    } 
	    else if (number2 > number1)
	    { 
         System.out.println();
         System.out.println(" number1: " + number1);
         System.out.println(" number2: " + number2);
	    	System.out.println(number1 + " is greater than " + number2);        
	    } 
	    else 
	    {
         System.out.println();
         System.out.println(" number1: " + number1);
         System.out.println(" number2: " + number2);
	    	System.out.println(number1 + " is equal to " + number2);
	    }		
	}	
}