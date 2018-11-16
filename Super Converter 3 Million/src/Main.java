import java.util.Scanner;

public class Main
	{

		public static void main(String[] args)
			{
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
	        		   // dunham input your method for time zones
	        		   break;
	        		   
	        	   case 3:
	        		   DistanceConverter.convertDistance();
	        		   break;
	        		  
	        	   case 4:
	        		   // dan input your method for angles 
	        		   break;
	        		   
	        	   case 5:
	        		   // dan input your method for speed 
	        		   break;
	        		   
	        	   case 6:
	        		   // dunham input your method for currency 
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
	           
	          
			}
	}							

//		public static void weightConverter()
//		{
//			String [ ] units = new String [3];
//			units [0] = "Pounds";
//			units [1] = "Ounces";
//			units [2] = "Grams";
//			
//			Scanner userInput = new Scanner(System.in);
//			System.out.println("Please choose which unit you would like to convert from.");
//			for (int i=0; i<units.length; i++)
//				{
//					System.out.println((i+1)+ " " + units[i]);
//				}
//			int cunit = userInput.nextInt();
//			
//			System.out.println("Please choose which unit you would like to convert to.");
//			for (int i=0; i<units.length; i++)
//				{
//					System.out.println((i+1)+ " " + units[i]);
//				}
//			
//			int newUnit= userInput.nextInt();
//			
//			System.out.println("How many " + units[cunit-1] + " would you like to convert to " + units[newUnit-1] + "?");
//			int num= userInput.nextInt();