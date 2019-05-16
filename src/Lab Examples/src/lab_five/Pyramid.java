package lab_five;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(in);
		out.println("Enter Width: ");
		int width = kb.nextInt();
		int step = width;

		for(int row = 0; row < width; row++)
		{
			for(int col = step; col > 0; col--)
			{
				out.print("*");
			}
			step -= 1;
			out.println();
		}
		
		kb.close();
	}

}
