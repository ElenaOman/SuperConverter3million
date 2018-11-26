import java.util.Scanner;

public class VolumeConverter
	{

		public static void main(String[] args)
			{
				
				String [] iu = new String[6];
				iu[0] = "Liters";
				iu[1] = "Milliliters";
				iu[2] = "Ounces";
				iu[3] = "Pints";
				iu[4] = "Quarts";
				iu[5] = "Gallons";
				
				Scanner userInput = new Scanner(System.in);

				//Initial Unit
				System.out.println("Which unit are you converting from?");
				for(int i = 0; i < iu.length; i++)
					{
						System.out.println((i + 1) + " " + iu[i]);
					}
				double initialUnit = userInput.nextDouble();
				
				//Final Unit
				System.out.println("Which unit are you converting to?");
				for(int i = 0; i < iu.length; i++)
					{
						System.out.println((i + 1) + " " + iu[i]);
					}
				double finalUnit = userInput.nextDouble();
				
				//Conversions
				
				if(initialUnit == finalUnit)
					{
						System.out.println("There is no conversion, they are the same unit!");
					}
				
				else if(initialUnit == 1 && finalUnit == 2)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				
				else if(initialUnit == 1 && finalUnit == 3)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				
				else if(initialUnit == 1 && finalUnit == 4)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				
				else if(initialUnit == 1 && finalUnit == 5)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				
				else if(initialUnit == 2 && finalUnit == 1)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				
				else if(initialUnit == 2 && finalUnit == 3)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				
				else if(initialUnit == 2 && finalUnit == 4)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				
				else if(initialUnit == 2 && finalUnit == 5)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				else if(initialUnit == 3 && finalUnit == 1)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				else if(initialUnit == 3 && finalUnit == 2)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}

				else if(initialUnit == 3 && finalUnit == 4)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}

				else if(initialUnit == 3 && finalUnit == 5)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				else if(initialUnit == 4 && finalUnit == 1)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}
				else if(initialUnit == 4 && finalUnit == 2)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}

				else if(initialUnit == 4 && finalUnit == 3)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}

				else if(initialUnit == 4 && finalUnit == 5)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}

				else if(initialUnit == 5 && finalUnit == 1)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}

				else if(initialUnit == 5 && finalUnit == 2)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}

				else if(initialUnit == 5 && finalUnit == 3)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}

				else if(initialUnit == 5 && finalUnit == 4)
					{
						System.out.println("How many liters would you like to convert to milliliters?");
					}






			}

	}
