

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Team
{
	
	private List<Player> teamList;
	
	public Team() {
		teamList = new ArrayList<Player>();
	}
	
	public void addPlayerToList(Player addedPlayer) 
	{
		boolean playerAlreadyAdded = false;
		if (!teamList.isEmpty()) 
		{
			for (int i = 0; i < teamList.size(); i++)
			{
				if (teamList.get(i).getName().equals(addedPlayer.getName()))
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
		while ((!found) && (counter < teamList.size())) 
		{
			if (teamList.get(counter).getName().equals(playerName)) 
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
		for (int i = 0; i < teamList.size(); i++) 
		{
			System.out.println("Player: " + teamList.get(i).getName() + "\t Score: " + teamList.get(i).getScore());
		}
			
	}
	
	public int getLength()
	{
		return teamList.size();
	}
	
	public Player getPlayerAtIndex(int indexVal)
	{
		return teamList.get(indexVal);
	}
}