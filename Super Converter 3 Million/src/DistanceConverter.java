import java.util.Scanner;

public class DistanceConverter
	{
		static boolean run= true;
		static int startingUnit;
		static int newUnit;
		static double num;
		static double converted;
		
		public static void convertDistance()
		{
			String [ ] units = new String [4];
			units [0] = "Feet";
			units [1] = "Meters";
			units [2] = "Miles";
			units [3] = "Inches";
			
			Scanner userInput = new Scanner(System.in);
			Scanner userInput1 = new Scanner(System.in);
			while (run==true)
			{
					
				
				System.out.println("Please choose which unit you would like to convert from.");
				for (int i=0; i<units.length; i++)
					{
						System.out.println((i+1)+ " " + units[i]);
					}
				int startingUnit = userInput.nextInt();
				
				System.out.println("Please choose which unit you would like to convert to.");
				for (int i=0; i<units.length; i++)
					{
						System.out.println((i+1)+ " " + units[i]);
					}
				
				int newUnit= userInput.nextInt();
				
				if (startingUnit==newUnit)
					{
						System.out.println("This is the same unit. " + num + " " + newUnit);
					}
				
				else
					{
						System.out.println("How many " + units[startingUnit-1] + " would you like to convert to " + units[newUnit-1] + "?");
						num= userInput.nextDouble();
					}
				
				if (startingUnit==1 && newUnit==2)
					{
						converted = num*.3048;
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==1 && newUnit==3)
					{
						converted = num*0.000189394;
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==1 && newUnit==4)
					{
						converted = num*12;
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==2 && newUnit==1)
					{
						converted = num*(3.28084);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==2 && newUnit==3)
					{
						
						converted = num*(0.000621371);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==2 && newUnit==4)
					{
						
						converted = num*(39.3701);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==3 && newUnit==1)
					{
						converted = num*(5280);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==3 && newUnit==2)
					{
						converted = num*(1609.34);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==3 && newUnit==4)
					{
						converted = num*(63360);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==4 && newUnit==1)
					{
						converted = num*(0.0833333);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==4 && newUnit==2)
					{
						converted = num*(0.0254);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				else if (startingUnit==4 && newUnit==3)
					{
						converted = num*(0.0000157828);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[startingUnit-1]+".");
					}
				
				
				System.out.println("Would you like to make another conversion?");
				String convertAgain = userInput1.nextLine();
				convertAgain.toLowerCase();

				if (convertAgain.equals("yes"))
					{
						run=true;
					}
				else
					{
						run=false;
					}
				
				}
				
				System.out.println("THANKS FOR CONVERTING!!!!!!!!!!!!!!");	
				
			
			
		}
	}
