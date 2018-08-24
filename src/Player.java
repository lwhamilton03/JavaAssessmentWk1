
public class Player {
	
	private String name; 
	private int positionA;
	private int positionB;

	// Constructor
	public Player(String name, int positionA, int positionB)
	{
		this.name = name; 
		this.positionA = positionA;
		this.positionB = positionB;
	}
	
	public String getPlayer()
	{
		return name;
	}
	
	public int getPositionA()
	{
		return positionA;
	}
	
	public int getPositionB()
	{
		return positionB;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPositionA(int positionA) {
		this.positionA = positionA;
	}

	public void setPositionB(int positionB) {
		this.positionB = positionB;
	}
	
}
