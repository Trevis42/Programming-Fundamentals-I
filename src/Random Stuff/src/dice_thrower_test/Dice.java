package dice_thrower_test;


import java.util.Random;

public class Dice {

	private int sideUp;
	private int diceFaceNum, dice;
	/**
	 * Default no-args constuctor that calls toss method.
	 */
	Dice()
	{
		toss();
		setDiceType(dice);
	}
	
	/**
	 * The getSideUp method will show the the side that is up after a toss
	 * @return the side that is up after a toss
	 */
	public int getSideUp()
	{		
		return sideUp;
	}
	
	public void setDiceType(int dType)
	{
		this.dice = dType;
	}
	
	public int getDiceType()
	{
		return dice;
	}
	/**
	 * The toss method choses 0 or 1 randomly and sets sideUp field to either Heads (0) or Tails (1)
	 */
	public void toss()
	{
		Random rand = new Random();
		diceFaceNum = getDiceType();
		int side = rand.nextInt(diceFaceNum + 1);	
		//int random = (int )(Math.random() * diceFaceNum + min);
		//sideUp = random;
		if(side == 0)
		{
			sideUp = side +1;
		}
		else
			sideUp = side;

	}

}
