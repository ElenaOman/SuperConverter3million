import java.util.Scanner;
public class CurrencyConverter
	{
		static double amount;
		static double assigner;
		static double finalAmount;
		static int currency;
		static double fromConversion;
		static double toConversion;
		static String fromAbb;
		static String toAbb;
		static int counter = 1;
		static String tempAbb;
		
		static void runner(){
			Scanner userInput = new Scanner(System.in);
			System.out.println("What currency do you want to convert FROM?");
			currencyList();
			currency = userInput.nextInt();
			assigner();
			System.out.println("How much do you want to convert?");
			amount = userInput.nextDouble();
			System.out.println("What currency do you want to convert TO?");
			currencyList();
			currency = userInput.nextInt();
			assigner();
		}
		private static void assigner(){
			switch(currency){
				case 1:
					tempAbb = "$";
					assigner = 1;
					break;
				case 2:
					tempAbb = "€";
					assigner = 0.88317;
					break;
				case 3:
					tempAbb = "£";
					assigner = 0.77727;
					break;
			}
			if (counter == 1){
				fromAbb = tempAbb;
				fromConversion = assigner;
				counter++;
			}
			else {
				toAbb = tempAbb;
				toConversion = assigner;
				converter();
			}
		}
		private static void currencyList(){
			System.out.println("1) USD (United States Dollar"); //1
			System.out.println("2) EUR (EURO)"); // 0.88317
			System.out.println("3) GBP (British Pound)"); //0.77727
		}
		private static void converter(){
			finalAmount = amount / fromConversion;
			finalAmount = finalAmount * toConversion;
			System.out.println(fromAbb + amount + " = " + toAbb + finalAmount);
		}
	}
