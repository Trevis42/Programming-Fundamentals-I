package homework_three;
/**
@Title:		 Coin
@Purpose:	 To practice random class and objects.
@Author:   Taylor, Trevor 
@Date:   	 March 23, 2017
@Version:	1.0
*/

import java.util.Random;

public class Coin {

	private String sideUp;
	
	/**
	 * Default no-args constuctor that calls toss method.
	 */
	Coin()
	{
		toss();
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
	 * The toss method choses 0 or 1 randomly and sets sideUp field to either Heads (0) or Tails (1)
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

}
