package homework_four;
/***********************************************************************
@Title:	     Array.java
@Purpose:	 To get familiar with class, array, and their usage
@Author:   (your last first name) 
@Date:   	 (today’s date)
@Version:	 1.0
************************************************************************/
import static java.lang.System.out;
import java.util.Arrays;

public class Array {

	private  double[] array;
	
	public  void  setArray(double[] arr)
	{
		array = arr;
	}
	
	public boolean isInIncreadingOrder()
	{
		Arrays.sort(array);
		return true;
	}
	
	public boolean isInDecreasingOrder()
	{
		double[] revArray = new double[ array.length ];
		int reverseCount = array.length - 1;
		//Arrays.sort(array, reverseCount, 0);
		Arrays.sort(revArray);
		for(double vals: array)
		{
			revArray[reverseCount] = vals;
			reverseCount--;
		}
		array = revArray;
		return true;
	}
	
	public double getHighest()
	{
		double max = array[0];
		
		for(double val : array)
		{
			if(val > max)
				max = val;
		}
		return max;
	}
	
	public double getLowest()
	{
		double min = array[0];
		
		for(double val : array)
		{
			if(val < min)
				min = val;
		}
		return min;
	}
	
	public double getTotal()
	{
		double total = 0.0;
		for(double vals : array)
			total += vals;
		return total;
	}
	
	public double getAverage()
	{
		double avg = 0.0;
		if(array.length > 0)
			avg = getTotal()/array.length;
		else
		{
			out.println("Size is 0 or not set:");
		}
		return avg;
	}
	
	public double[] getArray()
	{
		return array;
	}
	
}
