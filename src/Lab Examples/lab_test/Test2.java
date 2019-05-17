package lab_test;

import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class Test2 {

	public static void main(String[] args) throws IOException
	{
		Scanner kb = new Scanner(in);
		PrintWriter pw = new PrintWriter("output.txt");
		
		out.println("enter  your name: ");
		String name = kb.next();
		
		pw.println("your name is: " + name);
		
		pw.close();
		kb.close();
	}

}
