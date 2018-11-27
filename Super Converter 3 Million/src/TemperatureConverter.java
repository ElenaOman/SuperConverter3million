import java.util.Scanner;

public class TemperatureConverter
	{
		
		public static void convertTemperature()
			{
				String type1 = "this is gonna change";
				String type2 = "help im trapped in a text bubble";
				double temp1 = 0;
				double temp2 = 0;
				
				//asks for first temperature type
				System.out.println("What's the type of your first temperature? (kelvin, celcuis, fahrenheit)");
				Scanner userInput = new Scanner(System.in);
				type1 = userInput.nextLine();
				
				//ask for second temperature type
				System.out.println("Okay and what are you trying to convert that into?");
				Scanner userInput2 = new Scanner(System.in);
				type2 = userInput2.nextLine();
				
				//ask for temperature
				System.out.println("Alright whats the temperature in " + type1 + "?");
				Scanner userInput3 = new Scanner(System.in);
				temp1 = userInput3.nextInt();
								
				//kelvin converter
				if (type1.equals("kelvin") || type1.equals("k") || type1.equals("K"))
					{
						if (type2.equals("celcuis") || type2.equals("c") || type2.equals("C"))
							{
								temp2 = temp1 - 273.15;
							}
						else if (type2.equals("fahrenheit") || type2.equals("f") || type2.equals("F"))
							{
								temp2 = (temp1 - 273.15) * 9/5 + 32;
							}
					}
				//celcuis converter
				else if (type1.equals("celcuis") || type1.equals("c") || type1.equals("C"))
					{
						if (type2.equals("kelvin") || type2.equals("k") || type2.equals("K"))
							{
								temp2 = temp1 + 273.;
							}
						else if (type2.equals("fahrenheit") || type2.equals("f") || type2.equals("F"))
							{
								temp2 = (temp1 * 9/5) + 32;
							}
					}
				
				//fahrenheit converter
				else if (type1.equals("fahrenheit") || type1.equals("f") || type1.equals("F"))
					{
						if (type2.equals("kelvin") || type2.equals("k") || type2.equals("K"))
							{
								temp2 = (temp1 - 32) * 5/9 + 273.15;
							}
						else if (type2.equals("celcuis") || type2.equals("c") || type2.equals("C"))
							{
								temp2 = (temp1 - 32) * 5/9;
							}
					}
				
				
				//print method
				System.out.println(temp1 + " " + type1 + " = " + temp2 + " " + type2);
				
			}

	}
	
