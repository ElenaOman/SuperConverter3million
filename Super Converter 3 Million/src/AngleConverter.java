import java.util.Scanner;

public class AngleConverter
	{
		public static void main(String[] args)
		{
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Would you like to convert 1)Degrees to radians 2)Radians to degrees ?");
			
			int choice = userInput.nextInt();
			
			if(choice == 1)
				{
					System.out.println("Please input your angle.");
					double degrees = userInput.nextDouble();
					
					System.out.println(degrees * .0174533);
				}
			else if(choice == 2)
				{
					System.out.println("Please input your angle.");
					double radians = userInput.nextDouble();
					
					System.out.println(radians * 57.2958);
					
					
					//pls help.
					
					
				}

		}
	}

