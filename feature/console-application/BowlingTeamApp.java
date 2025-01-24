

import java.util.Scanner;


public class BowlingTeamApp 
{
	public static void main (String [] args) 
	{
		
		Scanner input = new Scanner(System.in);
		
		boolean shouldLoop = true;
		
		String addNewPlayer = "1";
		String removePlayer = "2";
		String displayAll = "3";
		String updatePlayerScore = "4";
		String exitApp = "5";
		
		Team<Player> bowlingTeam = new Team<>;
		
		while (shouldLoop == true) 
		{
			
			System.out.println("----------------------------------------------------");
			System.out.println("Press '" + addNewPlayer + "' to add a new player");
			System.out.println("Press '" + removePlayer + "' to remove a player");
			System.out.println("Press '" + displayAll + "' to display all players and scores");
			System.out.println("Press '" + updatePlayerScore + "' to update a players score");
			System.out.println("Press '" + exitApp + "' to exit the application");
			System.out.println("----------------------------------------------------");
			
			String userInput = input.nextLine();
			
			if (userInput.equals(addNewPlayer)) 
			{
				System.out.print("Input player name: ");
				userInput = input.nextLine();
				// Add new player code
				bowlingTeam.addPlayerToList(new Player(userInput));
			}
			else if ( (bowlingTeam.length < 1) && ( 
				(userInput.equals(removePlayer)) || 
				(userInput.equals(displayAll)) || 
				(userInput.equals(updatePlayerScore)) ) )
			{
				System.out.println("There are no players on the team. Please add players to the team first.");
			}
			else if (userInput.equals(removePlayer))
			{
				System.out.print("Input player name to remove: ");
				userInput = input.nextLine();
				// Remove player code
				bowlingTeam.removePlayer(userInput);
			}
			else if (userInput.equals(displayAll))
			{
				bowlingTeam.displayAllEverything();
				// Display all code
			}
			else if (userInput.equals(updatePlayerScore))
			{
		
				System.out.print("Input player's name to update: ");
				
				String playerUpdate = input.nextLine();
			
				boolean found = false;
				int index = 0;
				while ((!found) && (index < bowlingTeam.length)) 
				{
					if (bowlingTeam.get[i].name.equalsIgnoreCase(playerUpdate))
					{
						found = true;
					}
					else
					{
						index++;
					}
				}
				if (!found)
				{
					System.out.println("Could not find a player with that name!");
				}
				else 
				{
					System.out.print("Input how much the player scored: ");
					int addScore = input.nextInt();
					System.out.println(playerUpdate + "'s new score: " + bowlingTeam.get[index].incrementScore(addScore));
				}
				
			}
			else if (userInput.equals(exitApp)) 
			{
				shouldLoop = false;
				System.out.println("Exiting Application...");
			}
			else 
			{
				System.out.println("Invalid Input: Please enter a valid command.");
			}

		}
		
	}
    
}
