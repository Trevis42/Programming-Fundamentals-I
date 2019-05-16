package lab_five;

import static java.lang.System.in;
import static java.lang.System.out;
import java.io.*;
import java.util.Scanner;

public class Distance_Traveled {

	public static void main(String[] args) throws IOException
	{

		Scanner input = new Scanner(in);
		PrintWriter pw = new PrintWriter("DistanceLab.txt");
		
		//variables
		int time = 0;
		double velocity = 0;
		do
		{
			out.print("Input the hours traveled: ");
			time = input.nextInt();	

		}while(time < 0 || time > 10);
		
		out.print("Input the velocity: ");
		velocity = input.nextInt();	
		
		//out.println("Hour\t\tDistance");
		//out.println("==========================");
		pw.println("Hour\t\tDistance");
		pw.println("==========================");
		double distance = 0;
		for(int hours = 1; hours <= time; hours++)
		{
			distance = velocity * hours;		
			//out.println(hours + "\t\t" + distance);
			pw.println(hours + "\t\t" + distance);
		}
		
		input.close();
		pw.close();
	}

}
