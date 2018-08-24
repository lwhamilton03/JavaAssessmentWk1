
public class Swamp {

		 
	
		String [][] swampGrid = {{"North *", "West *", "South*"}, {"North **", "East *", "South **"}, {"East *", "East **", "South ***"}};
	
		Player person = new Player("FRANK", 0, 0);
		Treasure gold = new Treasure("GOLD", 2, 1);

		public String[][] getSwampGrid() {
			return swampGrid;
		}

		public void setSwampGrid(String[][] swampGrid) {
			this.swampGrid = swampGrid;
		}

		public Player getPerson() {
			return person;
		}

		public void setPerson(Player person) {
			this.person = person;
		}

	
		public void welcome()
		{
			System.out.println("It's dark and cold, you are outside, a storm is approaching, the thunder is getting louder...");
			System.out.println(person.getPlayer()+ ", you notice a watch in your hand, yet it doesn't tell normal time...");
		}
		
				
		public void printGrid()
		{
			for (int i = 0; i < swampGrid.length; i++)
			{
				for (int j = 0; j < swampGrid[i].length; j++)
				{
					System.out.print(swampGrid[i][j] + " ");
					}
				System.out.println();
			}
			
		}
		
		public void initialiseGrid()
		{ 
			
			if (person.getPositionA() == gold.getPositionC() && person.getPositionB() == gold.getPositionD())
			{
				// I know i need a better rule as otherwise it could go out of the grid, but currently this will have to do... 
				person.setPositionA(person.getPositionA() + 1);
			}
			
			swampGrid[person.getPositionA()][person.getPositionB()] = person.getPlayer();
			swampGrid[gold.getPositionC()][gold.getPositionD()] = gold.getTreasure();
			
		}
		
		
		// struggling for time, so basically attempting to have at least one route planned, then consider how to do it with regards to the player and treasure changing and also infinite map 
		public void findTreasure()
		{ 
			while(swampGrid[person.getPositionA()][person.getPositionB()] != swampGrid[gold.getPositionC()][gold.getPositionD()])
			{
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "North *")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "West *")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "South *")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "North **")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "East *")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "South **")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "North *")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "North *")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "South **")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
			}
		}
		
		
		
		
	
		
	
}
