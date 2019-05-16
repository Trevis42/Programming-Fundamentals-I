package lab_six;

import static java.lang.System.*;

public class Ex_Three {

	public static void main(String[] args)
	{
		int num = 3;
		String str = "Rawr";
		String repeated = repeat(str, num);
		
		out.println(repeated);
		//out.println(repeat(str, num));
	}
	
	public static String repeat(String str, int n)
	{
		String repString = "";
		
		for(int i = 0; i < n; i++)
			repString += str;
		
		return repString;
	}

}
