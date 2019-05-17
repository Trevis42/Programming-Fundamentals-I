package lab_two;

import static java.lang.System.*;
import java.util.Scanner;

public class Ex_One_L2 {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(in);
		final double TAX_RATE = 0.075;
		final int SHIPPING = 2;
		
		double totalPrice, bookTax;
		
		out.println("Please enter price of the book: ");
		double bookPrice = kb.nextDouble();
		out.println("Enter quantity of the book: ");
		int bookNum = kb.nextInt();
		
		bookTax = bookPrice * TAX_RATE;
		totalPrice = ((bookPrice + bookTax + SHIPPING) * bookNum);
		
		out.println("Your total price after tax and shipping is: " + totalPrice);
		
		kb.close();
	}

}
