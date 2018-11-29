import java.util.Scanner;

public class AngleConverter
	{
		static double pi = Math.PI;
		static int choice;
		static double degrees;
		static double radians;

		
		public static void piToDegrees()
		{
			
		}
		
		
		
		public static void convertAngles()
		{
			Scanner userInput = new Scanner(System.in);
			
			System.out.println("Would you like to convert?");
			System.out.println("1) Degrees to Radians");
			System.out.println("2) Radians to Degrees");
			
			
			choice = userInput.nextInt();
			
			if(choice == 1)
				{
					System.out.println("Please input your angle.");
					degrees = userInput.nextDouble();
					if(degrees == 45)
						{
							System.out.println(degrees + " degrees is pi/4 radians.");
						}
					else if(degrees == 90)
						{
							System.out.println(degrees + " degrees is pi/2 radians.");
						}
					else if(degrees == 30)
						{
							System.out.println(degrees + " degrees is pi/6 radians.");
						}
					else if(degrees == 60)
						{
							System.out.println(degrees + " degrees is pi/3 radians.");
						}
					else
						{
							System.out.println(degrees + " degrees is " + degrees * .0174533 + " radians.");
						}
				}
			else if(choice == 2)
				{
					
					
					System.out.println("Please input your angle.");
					radians = userInput.nextDouble();
					
					System.out.println(radians + " radians is " + radians * 57.2958 + " degrees.");
					
					

					
					
				}

		}
	}

