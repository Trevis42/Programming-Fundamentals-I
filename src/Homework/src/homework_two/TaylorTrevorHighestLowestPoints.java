package homework_two;

/***********************************************************************
@Title:	    TaylorTrevorHighestLowestPoints
@Purpose:	To get familiar with conditional structures in Java.
@Author:    Taylor, Trevor
@Date:   	Feb 17, 2017
@Version:	1.0
************************************************************************/

import static java.lang.System.*;
import java.util.Scanner;

public class TaylorTrevorHighestLowestPoints {
	
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
       String suffixH = addSuffix(gameH);
       String suffixL = addSuffix(gameL);
       //Output
       out.println("\nHighest points scored was " + highest + " in the " + gameH + suffixH + " game");
       out.println("\nLowest points scored was "+ lowest + " in the " + gameL + suffixL + " game");
       scanner.close();
	}
	
	public static String addSuffix(int gameRank)
	{
		String gameNum = Integer.toString(gameRank);
		String st = "st";
		String nd = "nd";
		String rd = "rd";
		String th = "th";
		String suffix = "";
		
		if(gameNum.endsWith("1")) suffix += st;
		if(gameNum.endsWith("2")) suffix += nd;
		if(gameNum.endsWith("3")) suffix += rd;
		if(gameNum.endsWith("4") || gameNum.endsWith("5") ||
		   gameNum.endsWith("6") || gameNum.endsWith("7") || 
		   gameNum.endsWith("8")) suffix += th;
		
		return suffix;
	}
}
