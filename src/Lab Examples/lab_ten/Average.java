package lab_ten;

public class Average {

	private int[] data = new int[5];
	private double mean;
	
	public void setData(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			data[i] = arr[i];
		}
	}
	
	public void changeAValue(int value, int index)
	{
		data[index] = value;
	}
	
	public void calculateMean()
	{
		int sum = 0;
		for(int vals : data)
		{
			sum += vals;
		}
		mean = sum/data.length;
	}
	
	public void selectionSort()
	{
		int maxIndex;
		int maxValue;
		
		for (int startScan = 0; startScan < data.length-1; startScan++) 
		{
	         maxIndex = startScan;
	         maxValue = data[startScan];
	         for (int index = startScan + 1; index < data.length; index++) 
	         {
	            if (data[index] > maxValue){
	               maxValue = data[index];
	               maxIndex = index;
	            }
	         }
	         data[maxIndex] = data[startScan];
	         data[startScan] = maxValue;
	      }
	}
	
	public void bubbleSort()
	{
		int temp;
		boolean sorted = true;
		while(sorted)
		{
			sorted = false;
			for(int i=1; i<data.length;i++) 
			{
				if(data[i-1] > data[i]) 
				{
					temp = data[i-1];
					data[i-1] = data[i];
					data[i] = temp;
					sorted = true;
				}
			}//end for
		}//end while
	}
	
	public String toString()
	{
		String stuff = "\nArray Data: \n";
		double[] revArray = new double[ data.length ];
		int reverseCount = data.length - 1;
		for(double vals: data)
		{
			revArray[reverseCount] = vals;
			reverseCount--;
			stuff += vals + "\n";
		}
		calculateMean();
		stuff += "Mean: " + mean;
		
		return stuff;
	}
}
