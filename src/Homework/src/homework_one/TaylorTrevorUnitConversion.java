package homework_one;

/***********************************************************************
@Title:	TaylorTrevorUnitConversion
@Purpose:	To get familiar with primitive arithmetic data types in Java
@Author:    Taylor, Trevor
@Date:   	Feb 2, 2017
@Version:	1.0
************************************************************************/

import static java.lang.System.*;
import java.util.Scanner;

public class TaylorTrevorUnitConversion
{
	private static Scanner scanner;

public static void main(String[] args)
   {
       scanner = new Scanner(in);

       double inch, foot,
               centimeter, meter,
               grams, pound, kilogram;
       double tempC, tempF;
       double seconds, minutes, hours, days, years;

       //-------Conversions-----------
       //meters to inches
       out.println("Convert meters to inches. \nEnter meters: ");
       meter = scanner.nextDouble();
       centimeter = meter * 100;
       inch = centimeter / 2.54;
       out.println(meter + " meters is equivalent to " + inch + " inches.");

       //feet to meters
       out.println("\nConvert feet to meters. \nEnter feet: ");
       foot = scanner.nextDouble();
       inch = foot * 12;
       centimeter = 2.54 * inch;
       meter = centimeter / 100;
       out.println(foot + " feet is equivalent to " + meter + " meters.");

       //pounds to grams
       out.println("\nConvert pounds to grams. \nEnter pounds: ");
       pound = scanner.nextDouble();
       grams = pound * 453.6;
       out.println(pound + " pounds is equivalent to " + grams + " grams.");

       //kilograms to pounds
       out.println("\nConvert kilograms to pounds. \nEnter kilograms: ");
       kilogram = scanner.nextDouble();
       grams = (kilogram * 1000);
       pound = grams / 453.6;
       out.println(kilogram + " kilograms is equivalent to " + pound + " pounds.");

       //Fahrenheit to Celsius
       out.println("\nConvert Fahrenheit to Celsius. \nEnter Temperature in Fahrenheit: ");
       tempF = scanner.nextDouble();
       tempC = (tempF - 32) / 1.8; // tempC = (tempF -32) * 5/9 or tempC = (tempF -32) / (9/5); 9/5 == 1.8
       out.println(tempF + " degrees Fahrenheit is equivalent to " + tempC + " Celsius.");

       //Celsius to Fahrenheit
       out.println("\nConvert Fahrenheit to Fahrenheit. \nEnter Temperature in Celsius: ");
       tempC = scanner.nextDouble();
       tempF = (tempC * 1.8 + 32); // tempF = temC * 1.8 + 32; 9/5 == 1.8
       out.println(tempC + " degrees Celsius is equivalent to " + tempF + " Fahrenheit.");

       //Seconds in a year
       out.println("\nCalculate number of seconds in a year. \nEnter number of years: ");
       years = scanner.nextDouble();
       days = years * 365;
       hours = days * 24;
       minutes = hours * 60;
       seconds = minutes * 60;
       out.println("Minutes: " + minutes + " Hours: " + hours); //debug
       out.println("The number of seconds in " + years + " year(s) is " + seconds);
       
       //scanner.close();
   }

}
