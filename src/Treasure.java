
public class Treasure {
		
		private String treasure;
		private int positionC;
		private int positionD;
		
		public Treasure(String treasure, int positionC, int positionD)
		{
			this.treasure = treasure;
			this.positionC = positionC;
			this.positionD = positionD;
		}
		
		public int getPositionC() {
			return positionC;
		}

		public void setPositionC(int positionC) {
			this.positionC = positionC;
		}

		public int getPositionD() {
			return positionD;
		}

		public void setPositionD(int positionD) {
			this.positionD = positionD;
		}

		public String getTreasure() {
			return treasure;
		}

		public void setTreasure(String treasure) {
			this.treasure = treasure;
		}
}
