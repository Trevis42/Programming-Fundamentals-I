package lab_four;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class GeometricMean {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);
		
		//variables
		double var;
		int amount;
		int count = 0;
		double total = 1;
		
		out.println("Enter the amount of values you want processed: ");
		amount = input.nextInt();		
		out.println();
		
		while(amount > count)
		{
			out.println("Enter your variables: ");
			var = input.nextDouble();
			
			total = total * var;
			count++;
		}
		
		double mean = Math.pow(total, (1.0 / amount));
		
		out.printf("%nThe geometric mean is: %.2f", mean);
		input.close();
	}

}
