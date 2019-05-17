package lab_ten;

import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;

public class AverageDriver {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(in);
		int[] array = new int[5];
		
		for(int i = 0; i < array.length; i++)
		{
			out.println("Please enter a value: ");
			array[i] = sc.nextInt();
		}
		
		Average avgObj = new Average();
		
		avgObj.setData(array);
		out.println(avgObj.toString());
		avgObj.changeAValue(30, 3);
		avgObj.selectionSort();
		//avgObj.bubbleSort();
		out.println(avgObj.toString());
		
		sc.close();
	}
}
