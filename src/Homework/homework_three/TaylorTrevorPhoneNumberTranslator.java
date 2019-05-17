package homework_three;
/*******************************************************************
@Title:		TaylorTrevorPhoneNumberTranslator
@Purpose:	To get familiar with input/output classes, String object, and various operations in Java
@Author:    Taylor, Trevor 
@Date:   	March 21, 2017
@Version:	1.0
*********************************************************************/

import java.io.*;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class TaylorTrevorPhoneNumberTranslator { 

	public static void main(String[] args) throws IOException
	{
		getFile();
	}
	
	/**
	 * The getFile method creates a scanner and printwriter, opens the file and reads each line of the file. 
	 * It then calls isValid to see if the lines meet requirments.
	 * If they do, the lines get passed to getPhoneNumbers
	 * @throws IOException
	 */
	public static void getFile() throws IOException
	{
		Scanner sc = new Scanner(in);
		String filename = "AlphabeticPhoneNumbers.txt";
		
		File file = new File(filename); // to open the text file
     	Scanner inputFile = new Scanner(file); // to read the data from the file
		String fileToOutput = "NumericPhoneNumbers.txt";		
		PrintWriter outputFile = new PrintWriter(fileToOutput); // to output the results in an output file
     	
		String phoneNumber = "";
		do
		{
			//read each line of file:"AlphabeticPhoneNumbers.txt" as a string
			phoneNumber = inputFile.nextLine();		
			boolean isValidNum = isValid(phoneNumber);
			out.println("Valid: " + isValidNum); //For debug purposes
			
			if(isValidNum)
			{	
				//once true, calls getPhoneNumber and passes valid number to the method
				getPhoneNumber(phoneNumber, outputFile);
			}
			
		}while(inputFile.hasNext()); // It reads data from the file until no more data left

		inputFile.close(); //close the input file
		outputFile.close();
		sc.close(); //close the scanner
	}
	
	/**
	 * The isValid method checks the phone numbers passed to it. It checks for a lenth between 12 and 14
	 * as well as if the phone numbers have letters, numbers, and hyphens only.
	 * @param phoneNum This is the string passed from getFile
	 * @return a boolean value of true or false
	 */
	public static boolean isValid(String phoneNum)
	{
		//char digits = ' ';
		phoneNum.toUpperCase();
		int length = phoneNum.length();
		boolean valid = false;
		CharSequence cs =  "/";
		
		//check if valid alphanumeric phone number...		
		//letters, numbers, dashes and length >= 12 and <= 14	
		for(int i = 0; i < phoneNum.length(); i++)
		{
			char digits = phoneNum.charAt(i);

			if(length < 12 || length > 14) 
				return false;			
			if(phoneNum.contains(cs))
				valid = false;		
			else if(Character.isAlphabetic(digits) || Character.isDigit(digits))
			{
				valid = true;
			}
			else
				valid = false;
		}	
		return valid;
	}
	
	/**
	 * This method takes in the phone number string and converts letters to numbers.
	 * @param phoneNum String passed to the method that will be converted
	 * @param output printWriter output for writing the phoneNum to a file
	 * @throws IOException
	 */
	public static void getPhoneNumber(String phoneNum, PrintWriter output) throws IOException
	{
		//convert the phonenumber to its numerical values
		//creates a new file called: "NumericPhoneNumbers.txt"
		//and writes each number to the file
		phoneNum.toUpperCase();
		String convertedNum = "";
		
		for(int i = 0; i < phoneNum.length(); i++)
		{
			char c = phoneNum.charAt(i);
			c = Character.toUpperCase(c);

			if(c == 'A' || c == 'B' || c == 'C')
			{
				c = '2';
			}
			else if(c == 'D' || c == 'E' || c == 'F')
			{
				c = '3';
			}
			else if(c == 'G' || c == 'H' || c == 'I')
			{
				c = '4';
			}
			else if(c == 'J' || c == 'K' || c == 'L')
			{
				c = '5';
			}
			else if(c == 'M' || c == 'N' || c == 'O')
			{
				c = '6';
			}
			else if(c == 'P' || c == 'Q' || c == 'R' || c == 'S')
			{
				c = '7';
			}
			else if(c == 'T' || c == 'U' || c == 'V')
			{
				c = '8';
			}
			else if(c == 'W' || c == 'X' || c == 'Y' || c == 'Z')
			{
				c = '9';
			}
			else
				c = phoneNum.charAt(i);
			
			convertedNum += c;
		}
		output.println(phoneNum + " = " + convertedNum);
	}

}
