package lab_three;

import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class Ex_Two_L3 {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(in);
		int year;
		out.println("Enter a year: ");
		year = kb.nextInt();
		
		if(year % 400 == 0)
			out.println("\nYear " + year + " is a leap year");
		else if((year % 4 == 0 && year % 100 != 0))
			out.println("\nYear " + year + " is a leap year");
		else
			out.println("\nYear " + year + " is not a leap year");

		kb.close();
	}

}
