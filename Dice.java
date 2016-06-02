
public class Dice {
	
	private int maximum;
	private int diceRolled;
	
	public Dice ()
	{
		maximum = 6;
	}
	
	public int rollDice (int number)
	{
		int max = maximum * number;
		diceRolled = ( number + (int) (Math.random() * max) );
		return diceRolled;
	}

}
