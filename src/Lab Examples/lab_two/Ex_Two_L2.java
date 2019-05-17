package lab_two;

import static java.lang.System.*;
import java.util.Scanner;

public class Ex_Two_L2 {


	public static void main(String[] args)
	{
		Scanner kb = new Scanner(in);
		
		final double E = 8.854E-12;
		
		out.println("Enter Q1 Coulombs: ");
		double q1 = kb.nextDouble();
		
		out.println("Enter Q2 Coulombs: ");
		double q2 = kb.nextDouble();
		
		out.println("Enter r meters: ");
		double r = kb.nextDouble();
		
		double force = (q1 * q2)/(4 * Math.PI * E * Math.pow(r, 2));
		
		out.println("The force of the charges particles is: " + force);
		
		kb.close();
		
	}

}
