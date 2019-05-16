package lab_seven;

import java.io.*;
import java.util.Scanner;

public class StudentAdmissions
{
	@SuppressWarnings("unused")
	public static void main(String [] args) throws IOException
	{

		Scanner sc = new Scanner(System.in);
		boolean validActScore, validSatScore, admittedOrNot;

		System.out.println("Enter the name of the file that contains application records: ");
		String filename = sc.nextLine();


		File file = new File(filename); // to open the text file
     	Scanner inputFile = new Scanner(file); // to read the data from the file

     	System.out.println("Please enter the name of the file that should contain results: ");
		String fileToOutput = sc.nextLine();
		PrintWriter outputFile = new PrintWriter(fileToOutput); // to output the results in an output file


		//Stores the name and scores of the student while there are more students on the list.
		do
		{
			//Declare the first name, last name, actScore and satScore and read their data from the file
			String firstName = inputFile.next();
			String lastName = inputFile.next();
			int actScore = inputFile.nextInt();
			int satScore = inputFile.nextInt();
			
			validActScore = validAct(actScore);
			validSatScore = validSat(satScore);
			
			String message = "";
			
			//prints if they are accepted and the reasoning or if they entered invalid numbers
			if(validActScore && validSatScore)
			{
				admittedOrNot = admitted(actScore, satScore);
				message = getString(actScore, satScore);
				outputFile.println(firstName + " " + lastName + " " + message);
			}
			else if(!validActScore)
			{
				outputFile.println(firstName + " " + lastName + "'s ACT score is not valid.");
			}
			else if(!validSatScore)
			{
				outputFile.println(firstName + " " + lastName + "'s SAT score is not valid.");
			}

		}while(inputFile.hasNext()); // It reads data from the file intil no more data left


		inputFile.close(); //close the input file
		outputFile.close(); //close the output file
		sc.close(); //close the scanner

	}

	/** the validAct method determines if the ACT score is valid
			@param actScore holds the actScore
			@return true or false dependent on if the score is valid
	*/
	public static boolean validAct(int actScore)
	{
		if(actScore >= 0 && actScore <= 30)
		{
			return true;
		}
		else
			return false;
	}

	/** the validSat method determines if the SAT score is valid
				@param satScore holds the satScore	
				@return true or false dependent on if the score is valid
	*/
	public static boolean validSat(int satScore)
	{
		if(satScore >= 0 && satScore <= 1600)
		{
			return true;
		}
		else
			return false;
	}
	

	/** the metAct method determines if the minimum ACT score was met
				@param actScore holds the actScore
				@return true or false dependent on if the minimum score was reached
	*/
	public static boolean metAct(int actScore)
	{
		if(actScore >= 20)
			return true;
		else
			return false;
	}


	/** the metSat method determines if the minimum SAT score was met
					@param satScore holds the actScore
					@return true or false dependent on if the minimum score was reached
	*/
	public static boolean metSat(int satScore)
	{
		if(satScore >= 1000)
			return true;
		else
			return false;
	}

	/** the admitted method determines if the student was admitted by meeting either of the minimum test grades
					@param actScore holds the actScore
					@param satScore hold the satScore
					@return true or false dependent on if the student was admitted based on minimum test grades
	*/
	public static boolean admitted(int actScore, int satScore)
	{
		if(metAct(actScore) || metSat(satScore))
			return true;
		else
			return false;
	}


	/** the getString method determines what to String to output on the file
						@param actScore holds the actScore
						@param satScore hold the satScore
						@return String displaying the students acceptance or not
	*/
	public static String getString(int actScore, int satScore)
	{
		String message = "";
		
		if(metAct(actScore) && metSat(satScore))
			message = "is admitted based on the ACT and SAT scores.";
		else if(metAct(actScore))
			message = "is admitted based on the ACT score.";
		else if(metSat(satScore))
			message = "is admitted based on the SAT score.";
		else
			message = "is not admitted (ACT and SAT scores are below required minimum";
		
		return message;
	}


} // end of the class