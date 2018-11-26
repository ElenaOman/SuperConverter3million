import java.util.Scanner;

public class Main
	{
		static boolean run= true;
		public static void main(String[] args)
			{
				Scanner userInput1 = new Scanner(System.in);
				Scanner u = new Scanner(System.in);
				String [] conversionType = new String [10];
				conversionType [0] = "Weight";
				conversionType [1] = "Time Zone";
				conversionType [2] = "Distance";
				conversionType [3] = "Angles";
				conversionType [4] = "Speed";
				conversionType [5] = "Currency";
				conversionType [6] = "Temperature";
				conversionType [7] = "Other1";
				conversionType [8] = "Other2";
				conversionType [9] = "Other3";
							
	           System.out.println("Welcome to the super converter 3 million!");
	           System.out.println("Please choose which converter you would like to use.");
	        while (run==true)
	        {
	           for (int i=0; i<conversionType.length; i++)
	        	   {
	        		   System.out.println((i+1)+ ") " + conversionType[i]);
	        	   }
	           int conversionChoice = u.nextInt(); 
	           switch (conversionChoice)
	           {
	        	   case 1:
	        		     WeightConverter.weightConverter();
	        			 break;
	        		
	        	   case 2:
	        		   timeZoneConverter.runner();
	        		   break;
	        		   
	        	   case 3:
	        		   DistanceConverter.convertDistance();
	        		   break;
	        		  
	        	   case 4:
	        		   AngleConverter.convertAngles();
	        		   break;
	        		   
	        	   case 5:
	        		   SpeedConverter.convertSpeed();
	        		   break;
	        		   
	        	   case 6:
	        		   CurrencyConverter.runner();
	        		   break;
	        		   
	        	   case 7:
	        		   //  input your method for temperature 
	        		   break;
	        		   
	        	   case 8:
	        		   //  input your method for ?? 
	        		   break; 
	        		   
	        	   case 9:
	        		   //  Elena input your method for ?? 
	        		   break;
	        		  
	        	   case 10:
	        		   //  Elena input your method for ?? 
	        		   break;
	        		  		   
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
	        System.out.println("THANKS FOR CONVERTING using our very own SUPERCONVERTER3MILLION!");
	          
			}
	}							
