package homework_five;

import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class TaylorTrevorTheaterSeating {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(in);
		int[][] theater;
		
		int[] row9 =  {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		int[] row8 =  {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		int[] row7 =  {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
		int[] row6 =  {10, 10, 20, 20, 20, 20, 20, 20, 10, 10};
		int[] row5 =  {10, 10, 20, 20, 20, 20, 20, 20, 10, 10};
		int[] row4 =  {10, 10, 20, 20, 20, 20, 20, 20, 10, 10};
		int[] row3 =  {20, 20, 30, 30, 40, 40, 30, 30, 20, 20};
		int[] row2 =  {20, 30, 30, 40, 50, 50, 40, 30, 30, 20};
		int[] row1 =  {30, 40, 50, 50, 50, 50, 50, 50, 40, 30};

		theater =new int[][] {row9, row8, row7, row6, row5, row4, row3, row2, row1};
		
		displayArray(theater);
		boolean go = true;
		do
		{
			displayArray(theater);
			out.println("Search by row, by price?"
					+ "\n\nPlease type \"row\" to seach for seats in that row"
					+ "\nPlease type \"price\" to seach for seats in that price range");
			int input = sc.nextInt();
			
			out.print("Exit(y/n)? ");
			String exit = sc.next();
			if(exit.equals( "y"))
				go = false;
		}while(go);
		
		
		sc.close();
	}
	
	public static void displayArray(int[][] array)
	{
		for(int i=0; i<array.length; i++)
		{
			out.print("Row" + (9-i) + ":  ");
		    for(int j=0; j<array[0].length; j++)
		        out.print(array[i][j]+ " ");
		    out.println();
		}
		
	}

}
