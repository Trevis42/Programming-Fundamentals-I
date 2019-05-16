package lab_nine;
import static java.lang.System.out;

public class ArraysTemps {
	
	public static void main(String[] args)
	{
		double[] tempInside = {72, 74, 71, 72, 75, 76, 73, 69, 72, 72};
		double[] tempOutside = {56, 67, 69, 72, 75, 81, 80, 62, 56, 45};
		
		convertCelsius(tempInside);
		convertCelsius(tempOutside);
		
		out.println("--Inside Stats--");
		out.println("Inside Temps:");
		showArray(tempInside);
		lowestHighest(tempInside);
		out.printf("%nAverage Inside: %.2f",average(tempInside));
		
		out.println("\n\n--Outside Stats--");
		out.println("Outside Temps:");
		showArray(tempOutside);
		lowestHighest(tempOutside);
		out.printf("%nAverage Outside: %.2f", average(tempOutside));
	
		out.println("\nMax Difference: "+difference(tempInside, tempOutside));
	}
	
	public static void convertCelsius(double[] arr)
	{
		//int i = arr.length - 1;
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] =(arr[i] - 32) * (5.0/9);
		}
	}
	
	public static void lowestHighest(double[] arr)
	{
		double max, min;
		max = min  = arr[0];
		
		for (double val : arr)
		{
			if (val > max)
				max = val;
			else if (val < min)
				min = val;
		}
		out.printf("%nMax: %.2f %nMin: %.2f", max, min);
	}
	
	public static double difference(double[] arr1, double[] arr2)
	{
		double[] diffArr = new double[arr1.length];
		double max;
		max = diffArr[0];
		
		for(int i = 0; i < arr1.length; i++)
		{
			diffArr[i] = Math.abs(arr1[i] - arr2[i]);
		}
		
		for(double val : diffArr)
		{
			if(val > max)
				max = val;
		}
		return max;
	}

	public static double average(double[] arr)
	{
		double total = 0;		
		for (double val : arr)
		{
			total += val;
		}
		double average = total / arr.length;
		return average;
	}
	
	public static void showArray(double[] arr)
	{
		for (double val : arr)
		{
			out.printf("%.2f, ", val);
		}
	}
	
}
