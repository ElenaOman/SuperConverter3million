import java.awt.Rectangle;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
import javax.xml.soap.Node;

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
				conversionType [8] = "Volume";
				conversionType [9] = "Energy";
							
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
	        		   TemperatureConverter.convertTemperature();
	        		   break;
	        		   
	        	   case 8:
	        		   //  Caleb input your method for ?? 
	        		   break; 
	        		   
	        	   case 9:
	        		   VolumeConverter.volumeConverter(); 
	        		   break;
	        		  
	        	   case 10:
	        		   energyConverter.energyConverter(); 
	        		   break;
	        		  		   
	           }
	           
	           System.out.println("Would you like to make another conversion?");
	           System.out.println("Pleas input yes or no.");
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
	        delay();
	        System.out.println();
	        System.out.print("C");
	        delay();
	        System.out.print("r");
	        delay();
	        System.out.print("e");
	        delay();
	        System.out.print("d");
	        delay();
	        System.out.print("i");
	        delay();
	        System.out.print("t");
	        delay();
	        System.out.print("s");
	        delay();
	        System.out.println();
	        System.out.println("BROUGHT TO YOU BY:");
	        System.out.println();
	        delay();
	        delay();
	        System.out.print("-Dunh");
	        delay();
	        System.out.print("am");
	        delay();
	        System.out.print(" or the group ");
	        delay();
	        System.out.print("leader");
	        delay();
	        delay();
	        delay();
	        System.out.println();
	        System.out.print("-B");
	        delay();
	        System.out.print("o");
	        delay();
	        delay();
	        System.out.println();
	        System.out.print("-D");
	        delay();
	        System.out.print("a");
	        delay();
	        System.out.print("n");
	        System.out.print("i");

	        delay();
	        System.out.println();
	        System.out.print("-Cale");
	        delay();
	        System.out.print("b");
	        delay();
	        System.out.println();
	        System.out.print("-E");
	        delay();
	        System.out.print("lena");
	        
			}


		
		
		public static void delay()
			{
			try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			
			}
	}							
