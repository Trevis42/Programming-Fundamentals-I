package lab_six;

import static java.lang.System.*;
import java.util.Random;

public class Ex_Two {

	public static void main(String[] args)
	{

		Random rand = new Random();
		
		int r = rand.nextInt(2999) + 1000;
		
		reverseNumber(r);
	}
	
	public static void reverseNumber(int randNum)
	{
		out.println("Original number is: " + randNum);
		while(randNum >= 1)
		{
			 out.print(randNum % 10);
			 randNum /= 10;
		}
	}
}
