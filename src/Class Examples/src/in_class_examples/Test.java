package in_class_examples;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Test {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(in);
		
		//variables
		int input = 0;
		int amount;
		int highest = Integer.MIN_VALUE; 
		int lowest= Integer.MAX_VALUE;
		int gameH = 0;
		int gameL = 0;
		
		out.println("Enter the amount of values you want processed: ");
		amount = scanner.nextInt();		
		out.println();

		int gameCount = 0;
        for(int i = 0; i < amount ; i++)
        {
        	out.println("Enter your variables: ");
    		input = scanner.nextInt();
    		gameCount++;
            if (input > highest)
            {
                highest = Math.max(highest, input);
                gameH = gameCount;
            }
            if(input < lowest)
            {
                lowest = Math.min(lowest, input);
                gameL = gameCount;
            }          
       } 
       System.out.println("Highest number is: " + highest + " from the: " + gameH + " Game");
       System.out.println("Lowest number is: " + lowest + " from the: " + gameL + " Game");
       scanner.close();		
	}
}
