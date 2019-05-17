package homework_three;
/**
@Title:		 ModifiedCoin
@Purpose: To practice Method overloading and class with multiple constructors.
@Author:   Taylor, Trevor 
@Date:   	 March 23, 2017
@Version:	1.0
*/

import java.util.Random;

public class ModifiedCoin {

private String sideUp;
	
	/**
	 * Default no-args constuctor that calls toss method.
	 */
	ModifiedCoin()
	{
		toss();
	}
	
	/**
	 * Constuctor with one arg, side, This is used to get the side and pass it to overloaded toss method.
	 * @param side This is the value of sideUp that is picked by the user (or set on calling toss)
	 */
	ModifiedCoin(String side)
	{
		side = sideUp;
		//toss(side);
	}
	
	/**
	 * The getSideUp method will show the the side that is up after a toss
	 * @return the side that is up after a toss
	 */
	public String getSideUp()
	{		
		return sideUp;
	}
	
	/**
	 * Toss method randomly choses a side when called
	 */
	public void toss()
	{
		Random rand = new Random();
		
		int side = rand.nextInt(2);
		
		if(side == 0)
			this.sideUp = "Heads";
		else
			this.sideUp = "Tails";
	}
	
	/**
	 * Toss method (overloaded with sting) sets sideUp to what ever is passed to it.
	 * @param pickedSide This is chosen by user (or set in main when calling toss method)
	 * @return The value of pickedSide
	 */
	public String toss(String pickedSide)
	{
		sideUp = pickedSide;
		
		return pickedSide;
	}
}
