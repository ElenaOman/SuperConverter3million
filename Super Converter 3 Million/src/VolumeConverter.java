
import java.util.Scanner;

public class VolumeConverter
	{

		public static void main(String[] args)
			{
				
				String [] unit = new String[6];
				unit[0] = "Liters";
				unit[1] = "Milliliters";
				unit[2] = "Ounces";
				unit[3] = "Pints";
				unit[4] = "Quarts";
				unit[5] = "Gallons";
				
				//User Input
				Scanner userInput = new Scanner(System.in);

				//Initial Unit
				System.out.println("Which unit are you converting from?");
				for(int i = 0; i < unit.length; i++)
					{
						System.out.println((i + 1) + " " + unit[i]);
					}
				int initialUnit = userInput.nextInt();
				
				//Final Units
			
				System.out.println("Which unit are you converting to?");
				for(int i = 0; i < unit.length; i++)
					{
						System.out.println((i + 1) + " " + unit[i]);
					}
				int finalUnit = userInput.nextInt();
				
				//Conversions
				
				if(initialUnit == finalUnit)
					{
						System.out.println("How many " + unit[initialUnit - 1] + " would you like to convert to " + unit[finalUnit - 1] + "?" );
						double num = userInput.nextDouble();
						System.out.println("Well, there is no need for conversion, they are the same unit!");
					}
				else
					{
						System.out.println("How many " + unit[initialUnit - 1] + " would you like to convert to " + unit[finalUnit - 1] + "?" );
					}
				
				double num = userInput.nextDouble();
				
				//Liters
				if(initialUnit == 1 && finalUnit == 2)
					{
						double convert = num*1000;
						System.out.println("There are " + convert + " milliliters in " + num + " liters.");
					}
				
				else if(initialUnit == 1 && finalUnit == 3)
					{
						double convert = num*33.184;
						System.out.println("There are " + convert + " ounces in " + num + " liters.");
						
					}
				
				else if(initialUnit == 1 && finalUnit == 4)
					{
						double convert = num*2.113;
						System.out.println("There are " + convert + " pints in " + num + " liters.");
					}
				
				else if(initialUnit == 1 && finalUnit == 5)
					{
						double convert = num*1.057;
						System.out.println("There are " + convert + " quarts in " + num + " liters.");
					}
				
				else if(initialUnit == 1 && finalUnit == 6)
					{
						double convert = num*0.264;
						System.out.println("There are " + convert + " gallons in " + num + " liters.");
					}
				
				
				//Milliliters
				else if(initialUnit == 2 && finalUnit == 1)
					{
						double convert = num/1000;
						System.out.println("There are " + convert + " liters in " + num + " milliliters.");
					}
				
				else if(initialUnit == 2 && finalUnit == 3)
					{
						double convert = num/29.574;
						System.out.println("There are " + convert + " ounces in " + num + " milliliters.");
						
					}
				
				else if(initialUnit == 2 && finalUnit == 4)
					{
						double convert = num/473.176;
						System.out.println("There are " + convert + " pints in " + num + " milliliters.");
					}
				
				else if(initialUnit == 2 && finalUnit == 5)
					{
						double convert = num/946.353;
						System.out.println("There are " + convert + " quarts in " + num + " milliliters.");
					}
				
				else if(initialUnit == 2 && finalUnit == 6)
					{
						double convert = num/3785.412;
						System.out.println("There are " + convert + " gallons in " + num + " milliliters.");
					}
				
				
				//Ounces
				else if(initialUnit == 3 && finalUnit == 1)
					{
						double convert = num/33.814;
						System.out.println("There are " + convert + " liters in " + num + " ounces.");
					}
				
				else if(initialUnit == 3 && finalUnit == 2)
					{
						double convert = num*29.574;
						System.out.println("There are " + convert + " milliliters in " + num + " ounces.");
						
					}
				
				else if(initialUnit == 3 && finalUnit == 4)
					{
						double convert = num/16;
						System.out.println("There are " + convert + " pints in " + num + " ounces.");
					}
				
				else if(initialUnit == 3 && finalUnit == 5)
					{
						double convert = num/32;
						System.out.println("There are " + convert + " quarts in " + num + " ounces.");
					}
				
				else if(initialUnit == 3 && finalUnit == 6)
					{
						double convert = num/128;
						System.out.println("There are " + convert + " gallons in " + num + " ounces.");
					}
				
				
				//Pints
				else if(initialUnit == 4 && finalUnit == 1)
					{
						double convert = num/2.113;
						System.out.println("There are " + convert + " liters in " + num + " pints.");
					}
				
				else if(initialUnit == 4 && finalUnit == 2)
					{
						double convert = num*473.176;
						System.out.println("There are " + convert + " milliliters in " + num + " pints.");
						
					}
				
				else if(initialUnit == 4 && finalUnit == 3)
					{
						double convert = num/16;
						System.out.println("There are " + convert + " ounces in " + num + " pints.");
					}
				
				else if(initialUnit == 4 && finalUnit == 5)
					{
						double convert = num/2;
						System.out.println("There are " + convert + " quarts in " + num + " pints.");
					}
				
				else if(initialUnit == 4 && finalUnit == 6)
					{
						double convert = num/8;
						System.out.println("There are " + convert + " gallons in " + num + " pints.");
					}
				
				
				
				//Quarts
				else if(initialUnit == 5 && finalUnit == 1)
					{
						double convert = num/1.057;
						System.out.println("There are " + convert + " liters in " + num + " quarts.");
					}
				
				else if(initialUnit == 5 && finalUnit == 2)
					{
						double convert = num*946.353;
						System.out.println("There are " + convert + " milliliters in " + num + " quarts.");
						
					}
				
				else if(initialUnit == 5 && finalUnit == 3)
					{
						double convert = num*32;
						System.out.println("There are " + convert + " ounces in " + num + " quarts.");
					}
				
				else if(initialUnit == 5 && finalUnit == 4)
					{
						double convert = num*2;
						System.out.println("There are " + convert + " pints in " + num + " quarts.");
					}
				
				else if(initialUnit == 5 && finalUnit == 6)
					{
						double convert = num/4;
						System.out.println("There are " + convert + " gallons in " + num + " quarts.");
					}
				
				
				
				//Gallons
				else if(initialUnit == 6 && finalUnit == 1)
					{
						double convert = num*3.785;
						System.out.println("There are " + convert + " liters in " + num + " gallons.");
					}
				
				else if(initialUnit == 6 && finalUnit == 2)
					{
						double convert = num*3785.412;
						System.out.println("There are " + convert + " milliliters in " + num + " gallons.");
						
					}
				
				else if(initialUnit == 6 && finalUnit == 3)
					{
						double convert = num*128;
						System.out.println("There are " + convert + " ounces in " + num + " gallons.");
					}
				
				else if(initialUnit == 6 && finalUnit == 4)
					{
						double convert = num*8;
						System.out.println("There are " + convert + " pints in " + num + " gallons.");
					}
				
				else if(initialUnit == 6 && finalUnit == 5)
					{
						double convert = num*4;
						System.out.println("There are " + convert + " quarts in " + num + " gallons.");
					}
			}

	}