


public class Player
{
	String name;
	int score = 0;
	
	boolean addPlayer(String addedName) 
	{
		name = addedName;
		return true;
	}
	
	int incrementScore(int newPoints) 
	{
		score += newPoints;
		return score;
	}
	
}