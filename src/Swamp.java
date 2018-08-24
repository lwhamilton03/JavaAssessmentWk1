import java.util.Scanner;

public class Swamp {

		 
	
		String [][] swampGrid = {{"North *", "West *", "South*"}, {"North **", "East *", "South **"}, {"East *", "East **", "South ***"}};
	
		Player person = new Player("FRANK", 0, 0);
		Treasure gold = new Treasure("GOLD", 2, 1);
		
		Scanner sc = new Scanner(System.in);
		

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
		
		/*
		// struggling for time, so basically attempting to have at least one route planned, then consider how to do it with regards to the player and treasure changing and also infinite map 
		public void findTreasure()
		{ 
			while(swampGrid[person.getPositionA()][person.getPositionB()] != swampGrid[gold.getPositionC()][gold.getPositionD()])
			{
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "North *")
				{
					//trying to now assign the position of the player to a new one depending on the scanner 
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
					// new scanner I reckon that should have options on where it should go.... lets go do it 
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
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "East *")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "East **")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
				
				if (swampGrid[person.getPositionA()][person.getPositionB()] == "South **")
				{
					System.out.println(swampGrid[person.getPositionA()][person.getPositionB()]);
				}
			} */
				
				
				//attempting to add a scanner and such that you can input a direction and then move.
				
			// }
			
			public void inputDirection()
			{
				//I've lost the players name in this array, maybe to do with the equals, as it shouldnt be re assigning but... 
				while(true)
				{
					System.out.println("Which direction do you want to take?");
					String where = sc.next();
				
					if (where.equals("North"))
					{
						swampGrid[person.getPositionA()][person.getPositionB()] = swampGrid[person.getPositionA()][person.getPositionB()- 1];
						printGrid(); 
						break; 
					}
				
					if (where.equals("East"))
					{
						swampGrid[person.getPositionA()][person.getPositionB()] = swampGrid[person.getPositionA() + 1][person.getPositionB()];
						printGrid(); 
						break;
					}
				
					if (where.equals("West"))
					{
						swampGrid[person.getPositionA()][person.getPositionB()] = swampGrid[person.getPositionA() - 1][person.getPositionB()];
						printGrid(); 
						break;
					}
				
					if (where.equals("South"))
					{
						swampGrid[person.getPositionA()][person.getPositionB()] = swampGrid[person.getPositionA() ][person.getPositionB() + 1];
						printGrid(); 
						break;
					}
				}
			
		}
		
		
		
		
	
		
	
}
