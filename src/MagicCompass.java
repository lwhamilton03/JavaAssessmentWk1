import java.util.Scanner;

public class MagicCompass {

		Scanner sc = new Scanner(System.in);
		
		public void direction()
		{
			//need to change this I think...
			while(true)
			{
				System.out.println("Try 'North', 'South', 'East' or 'West'");
				String where = sc.next();  
				
				if(where.equals("North")) break;
				if(where.equals("South")) break;
				if(where.equals("East")) break;
				if(where.equals("West")) break; 
				
			}
		}
		
}
