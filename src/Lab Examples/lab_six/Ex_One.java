package lab_six;

import static java.lang.System.*;
import java.util.Scanner;

public class Ex_One {

	public static void main(String[] args)
	{
		//pentagon formula... n(3n-1)/2
		Scanner scanner = new Scanner(in);
		int n = promptUserInput(scanner);
		pentagonCalc(n);
	}

	public static int promptUserInput(Scanner input)
	{
		out.print("Enter the number for the pentagon: ");
		int num = input.nextInt();
		
		if(num < 0)
		{
			out.println("No negative please!!");
			out.print("Enter the number for the pentagon: ");
			num = input.nextInt();
		}
		
		return num;
	}
	
	public static void pentagonCalc(int n)
	{
		int pentNum = n * (3 * n - 1) / 2;
		
		out.println("Pentagon Number: " + pentNum);
	}

}
