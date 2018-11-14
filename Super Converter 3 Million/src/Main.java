import java.util.Scanner;

public class Main
	{

		public static void main(String[] args)
			{
				//okay, this is epic
				
				helpDan();
				weightConverter();

			}

		private static void helpDan()
			{
				System.out.println("HELP ME PLEASE");
				
			}
		
		public static void weightConverter()
		{
			String [ ] units = new String [3];
			units [0] = "Pounds";
			units [1] = "Ounces";
			units [2] = "Grams";
			
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please choose which unit you would like to convert from.");
			for (int i=0; i<units.length; i++)
				{
					System.out.println((i+1)+ " " + units[i]);
				}
			int cunit = userInput.nextInt();
			
			System.out.println("Please choose which unit you would like to convert to.");
			for (int i=0; i<units.length; i++)
				{
					System.out.println((i+1)+ " " + units[i]);
				}
			
			int newUnit= userInput.nextInt();
			
			System.out.println("How many " + units[cunit-1] + " would you like to convert to " + units[newUnit-1] + "?");
			int num= userInput.nextInt();
			
			
			
			
			
		}
		

	}
