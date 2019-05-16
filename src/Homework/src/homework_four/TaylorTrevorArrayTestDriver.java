package homework_four;
/***********************************************************************
@Title:	      TaylorTrevorArrayTestDriver.java
@Purpose:	  To get familiar with class, array, and their usage
@Author:    Taylor, Trevor
@Date:   	  April, 10, 2017
@Version:	 1.0
************************************************************************/
import static java.lang.System.in;
import static java.lang.System.out;
import java.security.SecureRandom;
import java.util.Scanner;


public class TaylorTrevorArrayTestDriver {

	static SecureRandom sRand = new SecureRandom();
	
	public static void main(String[] args)
	{
		//create object
		Array arrObj = new Array();
		arrObj.setArray(makeArray());
		//arrObj.setArray(array1);
		
		//Show the contents of the array
		out.println("\nUnSorted");
		showArray(arrObj);
		//Show Stats
		showStats(arrObj);
		
		//Sort array
		if(arrObj.isInIncreadingOrder())
		{
			out.println("\n\nSorted: Increasing Order");
			showArray(arrObj);
		}
		if(arrObj.isInDecreasingOrder())
		{
			out.println("\nSorted: Decreasing Order");
			showArray(arrObj);
		}
	}
	/**
	 * This method creates an array of user-chosen size, and assigns values to that array randomly or by user input.
	 * @return created array
	 */
	public static double[] makeArray()
	{
		Scanner sc = new Scanner(in);
		double rangeMin = 1;
		double rangeMax = 101;
		
		out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		//set new area with size from user
		double[] array = new double[size];
		
		//out.print("Enter the values for the array: ");
		for (int i = 0; i < array.length; i++)
		{
			//arr[i] =  sc.nextDouble(); //User input, uncomment this one and comment out the one below to have user input
			array[i] = rangeMin + (rangeMax - rangeMin) * sRand.nextDouble(); //Random input, for convenience in testing
		}
		sc.close();
		return array;
	}
	
	/**
	 * This method takes in an object of Array class and shows the values of that array.
	 * @param arr Object of Array class with an array  to have values shown
	 */
	public static void showArray(Array arr)
	{
		double[] array = arr.getArray();
		for (double val : array)
		{
			out.printf("%.2f%n", val);
		}
	}
	
	/**
	 * This overloaded method takes in a double array and shows its values.
	 * @param arr double array to have values shown
	 */
	public static void showArray(double[] arr)
	{
		//double[] array = arr;
		for (double val : arr)
		{
			out.printf("%.2f%n", val);
		}
	}
	
	/**
	 * This method will show the stats of the array inside Array class Object.
	 * The stats of the array are, highest and lowest values, total sum of all values in the array, and the average of the values.
	 * @param arr Object of Array class
	 */
	public static void showStats(Array arr)
	{
		out.printf("\n====== ARRAY STATS ======"
					   + "%nHighest Value: %.2f"
					   + "%nLowest Value: %.2f"
					   + "%nTotal of all values: %.2f"
					   + "%nAverage of the values: %.2f",
					   arr.getHighest(), 
					   arr.getLowest(), 
					   arr.getTotal(), 
					   arr.getAverage()
					   );
	}

}
