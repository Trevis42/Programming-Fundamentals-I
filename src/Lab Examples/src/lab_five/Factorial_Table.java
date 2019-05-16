package lab_five;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class Factorial_Table {

	public static void main(String[] args)
	{

		Scanner input = new Scanner(in);
		
		//variables
		int var = 0;
		do
		{
			out.print("Enter a number to calculate its factorial (0 - 10): ");
			var = input.nextInt();		

		}while(var < 0 || var > 10);
		
		out.println("n\t\tn!");
		out.println("-----------------");
		out.println("0\t\t1");		
		int factorial = 1;
		for(int row = 1; row <= var; row++)
		{
			factorial = 1;
			for(int col = 1; col <= row; col++)
			{				
				factorial = factorial * col;
			}
			
			out.println(row + "\t\t" + factorial);
		}
		
		input.close();
	}

}
