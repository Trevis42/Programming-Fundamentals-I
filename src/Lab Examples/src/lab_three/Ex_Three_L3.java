package lab_three;

import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class Ex_Three_L3 {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(in);
		String input;
		char letter;
		
		out.println("Enter a single character: ");
		input = kb.nextLine();
		//input.toUpperCase();
		letter = input.charAt(0);
		
		if(!Character.isLetter(input.charAt(0)) || input.length() > 1)
		{
			out.println("This is not a valid input, I wanted a letter");
		}
		else if(letter == 'a' || letter == 'A' ||
				letter == 'e' || letter == 'E' ||
				letter == 'i' || letter == 'I' ||
				letter == 'o' || letter == 'O' ||
				letter == 'u' || letter == 'U' )
		{
			out.println("Your input is a vowel!");
		}
		else
			out.println("Your input is a consonant");
		
		kb.close();
	}

}
