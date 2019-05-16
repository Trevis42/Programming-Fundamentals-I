package homework_four;
/***********************************************************************
@Title:	      TaylorTrevorTexansStatistics
@Purpose:	  To get familiar with single dimensional arrays
@Author:    Taylor, Trevor 
@Date:   	  April 10. 2017
@Version:	  1.0
************************************************************************/
import static java.lang.System.out;

public class TaylorTrevorTexansStatistics {

	public static void main(String[] args)
	{
		int[] texansScore = {37, 39, 47, 35, 16, 34, 24, 19};
		int[] opponentsScore = {20, 56, 18, 28, 20, 26, 18, 10};

		double percent = percentage(texansScore, opponentsScore);
		
		out.printf("Texans Winning Percentage: %.0f%%%n", percent);
		highest(texansScore); //score at postion i of texans games
		highest(texansScore, opponentsScore); //score at position i of both games added
	}
	
	/**
	 * This method gets the percentage of wins the Texas had over the opponent. It compares the elements in each array
	 * and if texans array is higher it adds it to a counter. Then it calculates the win percentage.
	 * @param texArray Array with game scores for Texans
	 * @param oppArray Array with game scores for Opponent
	 * @return percentWon, which is calculated from the total game wins
	 */
	public static double percentage(int[] texArray, int[] oppArray)
	{
		double percentWon = 0.0;
		int winCount = 0;
		for(int i = 0; i < texArray.length; i++)
		{
			if(texArray[i] > oppArray[i])
				winCount++;
		}
		//out.println("###DEBUG### WinCount:" + winCount);
		//out.println("###DEBUG### Game count: " + (texArray.length));
		percentWon = (double)winCount / texArray.length *100;
		return percentWon;
	}
	
	/**
	 * Finds highest points and shows which game had those points
	 * @param arr The array passed to the method
	 */
	public static void  highest(int[] arr)
	{
		int max = arr[0];
		int position = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
				position = i + 1;
			}
		}
		out.println("Highest Houston Texans score was: " + max + " in game #"+ position + ".");
	}
	
	/**
	 * Finds highest combine points (texans plus opponents) per game and shows which game had those points
	 * @param arrT Texans gamepoints array
	 * @param arrO Oppontents gamepoints array
	 */
	public static void highest(int[] arrT, int[] arrO)
	{
		int maxTotal= arrT[0] + arrO[0];
		int position = 0;
		for(int i = 0; i < arrT.length; i++)
		{
			int total = arrT[i] + arrO[i];
			if(total > maxTotal)
			{
				maxTotal = total;
				position = i +1;
			}
		}
		out.println("The total score of the highest scored game was: "+ maxTotal + " in game #" + position + ".");
	}
}
