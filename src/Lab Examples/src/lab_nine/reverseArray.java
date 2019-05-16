package lab_nine;
import static java.lang.System.out;

public class reverseArray {

	public static void main(String[] args)
	{

		int[] numbers = { 3, 7, 12, 4, 9, 16, 8 };
		int[] revArray = new int[numbers.length];
		
		reverseArrays(numbers, revArray);
	}
	
	public static void reverseArrays( int[] numbers, int[] revArray)
	{
		int reverseCount = numbers.length - 1;
		/*
		for(int i = 0; i < numbers.length; i++)
		{
			revArray[reverseCount] = numbers[i];
			reverseCount--;
		}
		*/
		for(int vals: numbers)
		{
			revArray[reverseCount] = vals;
			reverseCount--;
		}
		//print arary contents
		for(int vals: revArray)
			out.print(vals + "  ");
	}

}
