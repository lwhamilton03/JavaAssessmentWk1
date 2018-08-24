
// Plan Notes:
// Should of created variables for the player and the treasure such they have these attributes.  
//I understand it was requested to be infinite but I was not able to get that far, I was thinking along the lines of as if you got to the edges of an array
//somehow you would be redirected to have the array moved such another column/row is repeated/added... not sure

public class RunnerTerrain {
	
	public static void main(String [] args)
	{

		Swamp map = new Swamp();	
		//no longer need this as changed the positions to be in the attributes of the player 
		//swamp.addPlayer(1, 3);
				
		map.welcome();
		
		map.initialiseGrid();
		
		//visualising and checking for myself
		System.out.println("Let's check the map for clues...");
		System.out.println();
		map.printGrid();
		
		
		MagicCompass magicCompass = new MagicCompass();
		magicCompass.direction();
		
		System.out.println();
		System.out.println("Let's go find this treasure...");
		// map.findTreasure();
		
		map.inputDirection();
		
		
	}
}
