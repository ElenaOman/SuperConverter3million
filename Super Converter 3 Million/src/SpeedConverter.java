import java.util.Scanner;

public class SpeedConverter
	{
		public static void convertSpeed()
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Would you like to convert 1)mph to kph 2)kph to mph ?");
				int choice = userInput.nextInt();
				
				if(choice == 1)
					{
						System.out.println("Please input your speed.");
						double mph = userInput.nextDouble();
						
						System.out.println(mph + " miles per hour is " + mph * 1.61 + " kilometers per hour");
						
					}
				else
					{
						System.out.println("Please input your speed.");
						double kph = userInput.nextDouble();
						
						System.out.println(kph + " kilometers per hour is " + kph * 1.61 + " meters per hour");
					}
			}
	}
