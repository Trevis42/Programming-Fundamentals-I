package dice_thrower_test;


import static java.lang.System.out;

public class DiceThrowDriver {

	static final int NUM_TOSSES = 10;
	static final int D4 = 4;
	static final int D6 = 6;
	static final int D8 = 8;
	static final int D10 = 10;
	static final int D12 = 12;
	static final int D20 = 20;
	
	public static void main(String[] args)
	{
		//Coin Toss
		Dice die = new Dice();

		//Show Current Side
		die.setDiceType(D6);
		out.println("Die being tossed: " + "d" + die.getDiceType());
		out.println("\nThe coin will be tossed: " + NUM_TOSSES + " times.\n");

		//Loop tosses, show them and count number of each toss
		for (int count = 0; count < NUM_TOSSES; count++)
		{
			die.toss();
			out.println("Toss #" + (count+1) + ": " + die.getSideUp());
		}
	}

}
