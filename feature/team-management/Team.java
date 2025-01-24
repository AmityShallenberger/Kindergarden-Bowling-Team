

import java.util.Arrays;
import java.util.List;

public class Team
{
	
	private List<Player> teamList;
	
	public Team() {
		numCircles = 0;
		teamList = new ArrayList<Player>();
	}
	
	public void addPlayerToList(Player addedPlayer) 
	{
		boolean playerAlreadyAdded = false;
		if (!teamList.isEmpty()) 
		{
			for (int i = 0; i < teamList.length; i++)
			{
				if (teamList.get(i).name.equals(addedPlayer.name))
				{
					playerAlreadyAdded = true;
					break;
				}
			}
		}
		if (playerAlreadyAdded == false)
		{
			teamList.add(addedPlayer);
		}
		//return true;
	}
	
	public void removePlayer(String playerName) 
	{
		int counter = 0;
		boolean found = false;
		while ((!found) && (counter < teamList.length)) 
		{
			if (teamList.get(counter).name.equals(playerName)) 
			{
				teamList.remove(counter);
				found = true;
			}
			else 
			{
				counter++;
			}
		}
		//return found;
	}
	
	public void displayAllEverything() 
	{
		for (int i = 0; i < teamList.length; i++) 
		{
			System.out.println("Player: " + teamList.get(i).name + "\t Score: " + teamList.get(i).score);
		}
			
	}
	
}