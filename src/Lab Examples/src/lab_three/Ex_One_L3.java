package lab_three;

import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;

public class Ex_One_L3 {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(in);
		 double speed;
		 double tension;
		 double length = 3.0;
		 int mass = 2;
		
		out.println("Enter a value for v (rotation speed): ");
		speed = kb.nextInt();
		tension = mass * (speed * speed) / length;
		
		out.println("Tension: " + tension); //debug		
		if(tension > 60)
		{		
			out.println("Speed is too fast which made the tension too large and the rope has broken");
		}
		else
			out.println("Speed is slow enough that the tension has not broken the rope");
		
		kb.close();
	}

}
