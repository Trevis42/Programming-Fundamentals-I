package lab_four;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);
		
		//variables
		String pswd1, pswd2;
		boolean valid = false;
		
		out.println("Please enter your password:");
		pswd1 = input.next();

		do
		{
			out.println("\nPlease re-enter your password:");
			pswd2 = input.next();
			
			//Check if both passwords are true
			if(pswd1.equals(pswd2))
				valid = true; //if true, escape the loop
			
		}while(!valid);
		
		out.println("\nYour passwords match!!!");
		
		input.close();
	}
}
