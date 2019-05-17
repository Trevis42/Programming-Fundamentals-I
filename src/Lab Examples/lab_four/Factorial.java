package lab_four;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);
		
		//variables
		int var;
		int total = 1;
		//boolean end = false;
		double factorial = 1;
		
		out.print("Enter a number to calculate its factorial (0 - 10): ");
		var = input.nextInt();		
		//out.println();
		
		if(var >= 0 && var <= 10)
		{
			while(factorial <= var)
			{
				total *= factorial;
				++factorial;
			}
			
			out.printf("The factorial of %d is %d", var, total);
		}
		
		else
		{
			out.print("Invalid Input!");
			//end = true;
		}		
		
		input.close();
	}

}
