package homework_two;
/***********************************************************************
@Title:	    TaylorTrevorCarpenter
@Purpose:	To get familiar with with loop and simple comparisons in Java
@Author:    Taylor, Trevor
@Date:   	Feb 17, 2017
@Version:	1.0
************************************************************************/
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Scanner;

public class TaylorTrevorCarpenter {
	//costs that dont change but are added or used in the program
	final static int BASE_SIGN_COST = 20;
	final static int WOOD_MAT_COST = 10;
	final static int PLASTIC_MAT_COST = 5;
	final static int EXTRA_CHAR_COST = 2;
	final static int COLOR_LETTER_COST = 8;
	final static double DISCOUNT = .25;

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(in);

		String name = null, 
				type = null;
		int orderNum = 0,
			numChars = 0, 
	        charColorCost = 0, 
	   	    numOrders = 0,
	        charCost = 0;
       	double totalCost = 0, orderCost = 0;
       int typeCost = 0;
       String receipt = null;
	       
       //boolean quit = true;
       //numOrders = 0;
       
       out.print("How many orders would you like to create? ");
       numOrders = scanner.nextInt();
       scanner.nextLine();
       
       while(orderNum < numOrders)
       {   
	       displayWelcome();
	       orderNum += 1;
	       name = promptName(scanner);
	       type = promptType(scanner);
	       numChars = charCount(name);
	       charCost = totalCharCost(numChars);
	       charColorCost = charColor(scanner, name, numChars);
	       //displayOrderInfo(orderNum, name, type, numChars, charColorCost);
	       typeCost = costOfSignMaterial(type);
	       orderCost = totalOrderSale(typeCost, charCost, charColorCost); 
    	   totalCost += orderCost;
    	   receipt += finalReceipt(orderNum, name, type, typeCost, numChars, charCost, charColorCost, orderCost);    	   
       }
       //show each order number receipt
       out.println(receipt);
       //show final total of all orders and discount if it applies
       displayFinalCost(totalCost);
	       
       scanner.close();
   }
	
	/**
	 * This method shows the user the final cost after all orders have been added up.
	 * It will also display the final cost with a 25% discount added if the order cost
	 * is more than 100 dollars.
	 * 
	 * @param totalCost The total cost of all orders.
	 * 
	 */
	public static void displayFinalCost(double totalCost)
	{
		out.printf("%n****************************************************"
       		    + "%n***     (Total over $100 gets a %.0f%% discount)    ***"
       		    + "%n***    Final Total of all orders:     $%.2f    ***", (DISCOUNT * 100), totalCost);
	   if(totalCost >= 100 )
	   {
		   totalCost = totalCost - (totalCost * DISCOUNT);
		   out.printf("%n***    Total with discount applied:   $%.2f    ***"
	       		    + "%n****************************************************", totalCost);
	   }
	   else
		   out.printf("\n****************************************************");
	}
	
	/**
	 * This method is used to calculate the addition cost of a sign based on the material selected.
	 * 
	 * @param type The material the user chose for the sign
	 * @return Base cost of sign plus the cost of the material chosen
	 */
	public static int costOfSignMaterial(String type)
	{
		int typeCost = BASE_SIGN_COST;
		switch(type)
		{
		case "wood":
			typeCost += 10;
			break;
		case "plastic":
			typeCost += 5;
			break;
		case "aluminum":
			typeCost += 0;
			break;
		default:
			typeCost += 0;
			break;
		}
		return typeCost;
	}

	/**
	 * This function takes all the parameters and displays them as an itemized receipt.
	 * 
	 * @param orderNum The order number count
	 * @param name Name used on the sign for the order
	 * @param type Sign material type
	 * @param typeCost Cost of the chosen sign material
	 * @param charNum Character count of name
	 * @param charCost Cost per character over the included 5 characters
	 * @param colorCost Cost of each character that will have color;
	 * @param orderCost Cost of each order
	 * @return Output string which contains the receipt display for each order
	 */
	public static String finalReceipt(int orderNum, String name, String type, int typeCost, int charNum, int charCost, int colorCost,
									  double orderCost)
	{
		//Integers.toString(int); String.valueOf(int);
		String output = "";
		String orderNumStr = String.valueOf(orderNum);
		int extraCharNum = 0;
		extraCharNum = (charNum > 5) ? (charNum - 5) : (0);

		output += "\n\nOrderNumber: "  + orderNumStr
				+ "\nName entered for sign: " + name.toUpperCase()
				+ "\nSign material type: " + type.toUpperCase()
				+ "\n=============================================================="
				+ "\nOrder itemization: "
				+ "\n  --base sign cost: $" + BASE_SIGN_COST
				+ "\n      -material cost: +$" + (typeCost - BASE_SIGN_COST)
				+ "\n  --total number of characters: " + charNum
				+ "\n  --total number of extra characters: " +  extraCharNum
				+ "\n      -cost per char($" + EXTRA_CHAR_COST + " per extra char over 5 char): +$" + charCost
				+ "\n  --total number of colored characters: " + (colorCost/COLOR_LETTER_COST)
				+ "\n      -cost per char (+$"+COLOR_LETTER_COST+" per letter): " + colorCost
				+ "\n=============================================================="
				+ "\nOrder Total: " + orderCost;	
		return output;
	}

	public static void displayWelcome()
	{
		out.println();
		out.println("\n====== Welcome to our sign company! ======");
		out.println("(Pricing will be show for each section and an itemized total will display at the end)"
				  + "\n\n--> Please follow prompts to set up your order.\n");
	}

	public static double totalOrderSale(int typeCost, int charCost, int colorCost)
	{
		double total = 0;		
		total = typeCost + charCost + colorCost;
		return total;
	}
	
	private static String promptName(Scanner input)
	{
		out.print("What is your name: ");
		String name = input.nextLine();
		
		return name;
	}
	
	private static int promptColorLetters(Scanner input)
	{
		int amntChars = 0;
		out.print("How many characters do you want colored? ");
		amntChars = input.nextInt();
		input.nextLine();		
		
		return amntChars;
	}
	
	public static String promptType(Scanner input)
	{
		out.print("\n---  Base price ($"+ BASE_SIGN_COST +"), Addtional cost for type of material selected  ---"
				+ "\nSign material options: \n\tWood(+$10), \n\tPlastic(+$5), \n\tAluminum(no extra charge)");
		out.print("\nWhat type of sign are you wanting to make? ");
		
		String type = input.next();
		input.nextLine();

		return type.toLowerCase();
	}
	
	public static int charCount(String name)
	{
		int charCount = 0;
		int spaceCount = 0;
		for(int i = 0; i < name.length(); i++)
		{
		   char c = name.charAt(i);
		   charCount++;
			if(Character.isSpaceChar(c))
			{
				spaceCount++;
				//charCount--;
			}
		}
		//out.println("\n###-DEBUG-### WHITESPACE COUNT: " + spaceCount + " ###-DEBUG-###");
		//out.println("###-DEBUG-### CHARACTER COUNT: " + charCount + " ###-DEBUG-###");
		charCount = charCount - spaceCount;
		//out.println("###-DEBUG-### CHARACTER minus SPACE: " + charCount + " ###-DEBUG-###\n");
		
		return charCount;
	}
	
	public static int charColor(Scanner input, String name, int numChars)
	{
		int colorCost = 0;
		out.print("\n---  Colors for each character, cost per character listed below  ---"
				+ "\nCharacter Color Options: \n\tBlack (+$0), \n\tWhite (+$0), \n\tAny Other Color (+$"+ COLOR_LETTER_COST +")"
				+ "\n**** Name entered: " + name.toUpperCase() + " and it Contains: " + numChars + " characters ****");
		out.print("\n\nEnter \"yes\" if you want colored lettering: ");
		String colors = input.nextLine();

		if(colors.equalsIgnoreCase("yes"))
		{	
			int amntChars = promptColorLetters(input);
			
			if(colors.equalsIgnoreCase("yes"))
			{
				colorCost = (COLOR_LETTER_COST * amntChars);
			}
			else
				colorCost = 0;
		}
		
		return colorCost;
	}
	
	public static int totalCharCost(int numChars)
	{
		int cost = 0;
		if(numChars > 5)
		{
			cost = EXTRA_CHAR_COST * (numChars - 5);
			return cost;
		}		
		return cost;
	}
}
