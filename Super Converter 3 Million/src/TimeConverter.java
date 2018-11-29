

import java.util.Scanner;

public class TimeConverter
	{
		
		public static void secondConverter()
			{
				long seconds = 0;
				
				System.out.println("How many seconds would you like to convert?");
				Scanner userInput = new Scanner(System.in);
				seconds = userInput.nextInt();
				
				System.out.println("what do you want to convert that into");
				System.out.println("1) min");
				System.out.println("2) hours");
				System.out.println("3) days");
				System.out.println("4) months");
				Scanner userInput2 = new Scanner(System.in);
				int type = userInput2.nextInt();
				
				long min = seconds / 60;
				long hours = min / 60;
				long days = hours / 24;
				long months = days / 30;
				
				if (type == 1)
					{
						System.out.println(seconds + " seconds = " + min + " min");
					}
				else if (type == 2)
					{
						System.out.println(seconds + " seconds = " + hours + " hours");
					}
				else if (type == 3)
					{
						System.out.println(seconds + " seconds = " + days + " days");					
					}
				else if (type == 4)
					{
						System.out.println(seconds + " seconds = " + months + " months");
					}
				
				
				
			}
	}
