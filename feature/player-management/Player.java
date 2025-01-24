


public class Player
{
	
	private String name;
	private int score;
	
	public Player(String addedName)
	{
		name = addedName;
		score = 0;
	}
	
	public int incrementScore(int newPoints) 
	{
		score += newPoints;
		return score;
	}
	
}