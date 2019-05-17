package homework_two;

/***********************************************************************
@Title:	    TaylorTrevorVowel
@Purpose:	To get familiar with conditional structures in Java.
@Author:    Taylor, Trevor
@Date:   	Feb 17, 2017
@Version:	1.0
************************************************************************/

import static java.lang.System.*;
import java.util.Scanner;

public class TaylorTrevorVowel
{

public static void main(String[] args)
   {
       Scanner scanner = new Scanner(in);
       
       String input;
		char letter;
		int count = 0;
		
		out.println("===== This program will tell you how many vowels a word has. =====\n");
		out.print("Enter a word: ");
		input = scanner.nextLine();

		for(int i = 0; i < input.length(); i++)
		{
			letter = input.charAt(i);
			
			if( letter == 'a' || letter == 'A' ||
				letter == 'e' || letter == 'E' ||
				letter == 'i' || letter == 'I' ||
				letter == 'o' || letter == 'O' ||
				letter == 'u' || letter == 'U' ||
				letter == 'y' || letter == 'Y')
			{
				count++;
			}
		}
		
		out.printf("%n%s%d%s", "The word \"" + input + "\" has ", count , " vowel(s).");
		
       scanner.close();
   }

}
