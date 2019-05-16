package homework_three;
/**
@Title:		 TaylorTrevorCoinDriver
@Purpose:	 To practice random class and objects.
@Author:   Taylor, Trevor 
@Date:   	 March 23, 2017
@Version:	1.0
*/

import static java.lang.System.out;

public class TaylorTrevorCoinDriver {

	static final int NUM_TOSSES = 40;
	static final String HEADS = "Heads";
	static final String TAILS = "Tails";
	
	public static void main(String[] args)
	{
		//Coin Toss
		Coin coin = new Coin();

		//Show Current Side
		out.println("Side currently up is: " + coin.getSideUp());
		out.println("\nThe coin will be tossed: " + NUM_TOSSES + " times.\n");
		
		int countHeads = 0;
		int countTails = 0;
		
		//Loop tosses, show them and count number of each toss
		for (int count = 0; count < NUM_TOSSES; count++)
		{
			coin.toss();
			out.println("Toss #" + (count+1) + ": " + coin.getSideUp());
			
			if(coin.getSideUp().equals(HEADS))
			{
				countHeads++;
			}
			if(coin.getSideUp().equals(TAILS))
			{
				countTails++;
			}
		}
		
		out.println("\n\tTotal heads tossed: " + countHeads);
		out.println("\tTotal tails tossed: " + countTails);
		
		//Modified Coin Toss
		out.println("\n\n=======MODIFIED COIN TOSS=======");
		ModifiedCoin mCoin1 = new ModifiedCoin();
		ModifiedCoin mCoin2 = new ModifiedCoin();
		out.println("Side currently up for fair Coin: " + mCoin1.getSideUp());
		out.println("Side currently up for unfair Coin: " + mCoin2.getSideUp());
		
		//Do a fair toss
		mCoin1.toss();
		out.println("\n\tFair toss (random side): " + mCoin1.getSideUp());
		
		//Do unfair toss
		mCoin2.toss(HEADS);
		out.println("\tUnfair toss (chose Heads): " + mCoin2.getSideUp());
	}

}
