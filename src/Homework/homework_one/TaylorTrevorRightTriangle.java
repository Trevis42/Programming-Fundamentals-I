package homework_one;

/*******************************************************************
@Title:	TaylorTrevorRightTriangle
@Purpose:	To get familiar with simple comparisons in Java
@Author:    Taylor, Trevor
@Date:   	Feb 2, 2017
@Version:	1.0
********************************************************************/

import static java.lang.System.*;
import java.util.Scanner;

public class TaylorTrevorRightTriangle
{
	private static Scanner scanner;

public static void main(String[] args)
   {
       scanner = new Scanner(in);

       int longest,
           secondSide,
           thirdSide,
           hypotenuse,
           squaredSides;

       //send message to user and get input from user
       out.println("Enter the longest side: ");
       longest = scanner.nextInt();
       out.println("Enter the 2nd side: ");
       secondSide = scanner.nextInt();
       out.println("Enter the 3rd side: ");
       thirdSide = scanner.nextInt();

       hypotenuse = (longest * longest);
       squaredSides = (secondSide * secondSide) + (thirdSide * thirdSide);

       if (hypotenuse == squaredSides)
           out.println("The Triangle is a right triangle.");
       else
           out.println("the triangle is not a right triangle.");

   }
}
