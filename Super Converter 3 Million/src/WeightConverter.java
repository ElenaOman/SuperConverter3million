import java.util.Scanner;

public class WeightConverter
	{
		static boolean run = true;
		static double num;
		static double converted;
		public static void weightConverter()
			{
				String [ ] units = new String [3];
				units [0] = "Pounds";
				units [1] = "Ounces";
				units [2] = "Grams";
				
				Scanner userInput = new Scanner(System.in);
			while (run==true)
			{
					
				
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
				
				if (cunit==newUnit)
					{
						System.out.println("This is the same unit. " + num + " " + newUnit);
					}
				
				else
					{
						System.out.println("How many " + units[cunit-1] + " would you like to convert to " + units[newUnit-1] + "?");
						num= userInput.nextDouble();
					}
				
				if (cunit==1 && newUnit==2)
					{
						converted = num*16;
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[cunit-1]+".");
					}
				else if (cunit==1 && newUnit==3)
					{
						converted = num*453;
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[cunit-1]+".");
					}
				else if (cunit==2 && newUnit==1)
					{
						converted = num*(.0625);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[cunit-1]+".");
					}
				else if (cunit==2 && newUnit==3)
					{
						converted = num*(28.3945);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[cunit-1]+".");
					}
				else if (cunit==3 && newUnit==1)
					{
						converted = num*(0.00220462);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[cunit-1]+".");
					}
				else if (cunit==3 && newUnit==2)
					{
						converted = num*(0.035274);
						System.out.println("There are " + converted + " " + units[newUnit-1] + " in " + num + " "+ units[cunit-1]+".");
					}
				
				System.out.println("Would you like to make another conversion?");
				String convertAgain = userInput.nextLine();

				if (convertAgain.equals("true"))
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
