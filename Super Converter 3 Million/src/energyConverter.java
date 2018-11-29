import java.util.Scanner;

public class energyConverter
	{

		public static void energyConverter()
			{
		
				String [] unit = new String[3];
				unit[0] = "Joules";
				unit[1] = "BTU";
				unit[2] = "Horsepower(Electric)";
				Scanner userInput = new Scanner(System.in);


				System.out.println("Which unit are you converting from?");
				for(int i = 0; i < unit.length; i++)
					{
						System.out.println((i + 1) + " " + unit[i]);
					}
				int initialUnit = userInput.nextInt();
				
			
				System.out.println("Which unit are you converting to?");
				for(int i = 0; i < unit.length; i++)
					{
						System.out.println((i + 1) + " " + unit[i]);
					}
				int finalUnit = userInput.nextInt();
				
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
				
				//Joules
				if(initialUnit == 1 && finalUnit == 2)
					{
						double convert = num/1055.056;
						System.out.println("There are " + convert + " BTU in " + num + " joules.");
					}
		
				else if(initialUnit == 1 && finalUnit == 3)
					{
						double convert = num*745.70;
						System.out.println("There are " + convert + " horsepower in " + num + " joules/sec.");
					}
				
				//BTU
				else if(initialUnit == 2 && finalUnit == 1)
					{
						double convert = num*1055.056;
						System.out.println("There are " + convert + " joules in " + num + " BTU.");
					}
				else if(initialUnit == 2 && finalUnit == 3)
					{
						double convert = num*2544.43;
						System.out.println("There are " + convert + " horsepower in " + num + " BTU/hr.");
					}
				
				//Horsepower
				else if(initialUnit == 3 && finalUnit == 1)
					{
						double convert = num/745.70;
						System.out.println("There are " + convert + " joules/sec in " + num + " horsepower.");
					}
				else if(initialUnit == 3 && finalUnit == 2)
					{
						double convert = num/2544.43;
						System.out.println("There are " + convert + " BTU/hr in " + num + " horsepower.");
					}
			}

	}
