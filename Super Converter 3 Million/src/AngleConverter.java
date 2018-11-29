import java.util.Scanner;

public class AngleConverter
	{
		static double pi = Math.PI;
		static int choice;
		static double degrees;
		static double radians;
		static String radiansExact;
		static String radiansChoice;

		//got it
		public static void convertAngles()
		{
			Scanner userInput = new Scanner(System.in);
			Scanner userInputStrings = new Scanner(System.in);
			
			System.out.println("Would you like to convert?");
			System.out.println("1) Degrees to Radians");
			System.out.println("2) Radians to Degrees");
			
			
			choice = userInput.nextInt();
			
			if(choice == 1)
				{
					System.out.println("Please input your angle. ");
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
					else if(degrees == 180)
						{
							System.out.println(degrees + " degrees is pi radians.");
						}
					else
						{
							System.out.println(degrees + " degrees is " + degrees * .0174533 + " radians.");
						}
				}
			else if(choice == 2)
				{
					System.out.println("Will you be converting exact radians?(Contains pi in the angle)");
					radiansChoice = userInputStrings.nextLine();
					
					if(radiansChoice.equals("yes"))
						{
							System.out.println("Please input your angle(no spaces).");
							radiansExact = userInputStrings.nextLine();
							
							if(radiansExact.equals("pi/6"))
								{
									System.out.println(radiansExact + " radians is 30 degrees.");
								}
							else if(radiansExact.equals("pi/4"))
								{
									System.out.println(radiansExact + " radians is 45 degrees.");
								}
							else if(radiansExact.equals("pi/3"))
								{
									System.out.println(radiansExact + " radians is 60 degrees.");
								}
							else if(radiansExact.equals("pi/2"))
								{
									System.out.println(radiansExact + " radians is 90 degrees.");
								}
							else if(radiansExact.equals("2pi/3"))
								{
									System.out.println(radiansExact + " radians is 120 degrees.");
								}
							else if(radiansExact.equals("3pi/4"))
								{
									System.out.println(radiansExact + " radians is 135 degrees.");
								}
							else if(radiansExact.equals("5pi/6"))
								{
									System.out.println(radiansExact + " radians is 150 degrees.");
								}
							else if(radiansExact.equals("pi"))
								{
									System.out.println(radiansExact + " radians is 180 degrees.");
								}
							else if(radiansExact.equals("7pi/6"))
								{
									System.out.println(radiansExact + " radians is 210 degrees.");
								}
							else if(radiansExact.equals("5pi/4"))
								{
									System.out.println(radiansExact + " radians is 225 degrees.");
								
								}
							else if(radiansExact.equals("4pi/3"))
								{
									System.out.println(radiansExact + " radians is 240 degrees.");
								}
							else if(radiansExact.equals("3pi/2"))
								{
									System.out.println(radiansExact + " radians is 270 degrees.");
								}
							else if(radiansExact.equals("5pi/3"))
								{
									System.out.println(radiansExact + " radians is 300 degrees.");
								}
							else if(radiansExact.equals("7pi/4"))
								{
									System.out.println(radiansExact + " radians is 315 degrees.");
								}
							else if(radiansExact.equals("11pi/6"))
								{
									System.out.println(radiansExact + " radians is 330 degrees.");
								}
							else if(radiansExact.equals("2pi"))
								{
									System.out.println(radiansExact + " radians is 0 degrees.");
								}
							else
								{
									System.out.println("I'm sorry, that angle is not in the unit circle.");
								}
						}
					else
						{
							
						
					
							System.out.println("Please input your angle.");
							radians = userInput.nextDouble();
					
							System.out.println(radians + " radians is " + radians * 57.2958 + " degrees.");
					
						}

					
					
				}

		}
	}

