import java.util.ArrayList;
import java.util.Scanner;

public class timeZoneConverter
	{
		static String toAMPM;
		static int userFrom;
		static int userTime;
		static int counter = 0;
		static int fromTimeAdder;
		static int toTimeAdder;
		static String toTimeName;
		static String fromTimeName;
		static String timeZoneNameTemp;
		static int userAMPM;
		static String AMPM;
		static void runner(){
			Scanner userInput = new Scanner(System.in);
			System.out.println("What time zone would you like to convert FROM?");
			timeZoneList();
			userFrom = userInput.nextInt();
			assigner();
			System.out.println("What time is it there with no colons?");
			userTime = userInput.nextInt(); 
			System.out.println("AM or PM?");
			System.out.println("1) AM");
			System.out.println("2) PM");
			userAMPM = userInput.nextInt();
			if (userAMPM == 1){
				AMPM = "AM";
			}
			else {
				AMPM = "PM";
			}
			System.out.println("What time zone would you like to convert TO?");
			timeZoneList();
			userFrom = userInput.nextInt();
			assigner();
			converter();
		}
		
		private static void timeZoneList(){
			System.out.println("1) GMT (Greenwich Mean Time)");
			System.out.println("2) CET (Central European Time)"); //+1
			System.out.println("3) CAT (Central African Time)"); //+2
			System.out.println("4) AST (Arabia Standard Time)"); //+3
			System.out.println("5) IRST (Iran Standard Time)"); //+3:30
			System.out.println("6) GST (Gulf Standard Time)"); //+4
			System.out.println("7) AFT (Afghanistan Time)"); //+4:30
			System.out.println("8) PKT (Pakistan Standard Time)"); //+5
			System.out.println("9) IST (India Standard Time)"); //+5:30
			System.out.println("10) NPT (Nepal Time)"); //+5:45
			System.out.println("11) BIOT (British Indian Ocean Time)"); //+6
			System.out.println("12) MMT (Myanmar Standard Time)"); //+6:30
			System.out.println("13) ICT (Indochina Time)"); //+7
			System.out.println("14) CST (China Standard Time)"); //+8
			System.out.println("15) ACWST (Australian Central Western Standard Time)"); //+8:45
			System.out.println("16) JST (Japan Standard Time)"); //+9
			System.out.println("17) ACST (Australian Central Standard Time)"); //+9:30
			System.out.println("18) AEST (Australian Eastern Standard Time)"); //+10
			System.out.println("19) VUT (Vanuatu Time)"); //+11
			System.out.println("20) NZST (New Zealand Standard Time)"); //+12
			System.out.println("21) CVT (Cape Verde Time)"); //-1
			System.out.println("22) FNT (Fernando de Noronha Time)"); //-2
			System.out.println("23) NDT (Newfoundland Daylight Time)"); //-2:30
			System.out.println("24) BRT (Brasilia Time)"); //-3
			System.out.println("25) NT (Newfoundland Time)"); //-3:30
			System.out.println("26) AST (Atlantic Standard Time)"); //-4
			System.out.println("27) EST (Eastern Standard Time)"); //-5
			System.out.println("28) CST (Central Standard Time)"); //-6
			System.out.println("29) MST (Mountain Standard Time)"); //-7
			System.out.println("30) PST (Pacific Standard Time)"); //-8
			System.out.println("31) AKST (Alaska Standard Time)"); //-9
			System.out.println("32) TAHT (Tahiti Time)"); //-10
			System.out.println("33) SST (Samoa Standard Time)"); //-11
		}
		private static void assigner(){
			int assigner = 0;
			switch(userFrom){
				case 1:
					assigner = 0;
					timeZoneNameTemp = "GMT";
					break;
				case 2:
					assigner = -100;
					timeZoneNameTemp = "CET";
					break;
				case 3:
					assigner = -200;
					timeZoneNameTemp = "CAT";
					break;
				case 4:
					assigner = -300;
					timeZoneNameTemp = "AST";
					break;
				case 5:
					assigner = -330;
					timeZoneNameTemp = "IRST";
					break;
				case 6:
					assigner = -400;
					timeZoneNameTemp = "GST";
					break;
				case 7:
					assigner = -430;
					timeZoneNameTemp = "AFT";
					break;
				case 8:
					assigner = -500;
					timeZoneNameTemp = "PKT";
					break;
				case 9:
					assigner = -530;
					timeZoneNameTemp = "IST";
					break;
				case 10:
					assigner = -545;
					timeZoneNameTemp = "NPT";
					break;
				case 11:
					assigner = -600;
					timeZoneNameTemp = "BIOT";
					break;
				case 12:
					assigner = -630;
					timeZoneNameTemp = "MMT";
					break;
				case 13:
					assigner = -700;
					timeZoneNameTemp = "ICT";
					break;
				case 14:
					assigner = -800;
					timeZoneNameTemp = "CST";
					break;
				case 15:
					assigner = -845;
					timeZoneNameTemp = "ACWST";
					break;
				case 16:
					assigner = -900;
					timeZoneNameTemp = "JST";
					break;
				case 17:
					assigner = -930;
					timeZoneNameTemp = "ACST";
					break;
				case 18:
					assigner = -1000;
					timeZoneNameTemp = "AEST";
					break;
				case 19:
					assigner = -1100;
					timeZoneNameTemp = "VUT";
					break;
				case 20:
					assigner = -1200;
					timeZoneNameTemp = "NZST";
					break;
				case 21:
					assigner = 100;
					timeZoneNameTemp = "CVT";
					break;
				case 22:
					assigner = 200;
					timeZoneNameTemp = "FNT";
					break;
				case 23:
					assigner = 230;
					timeZoneNameTemp = "NDT";
					break;
				case 24:
					assigner = 300;
					timeZoneNameTemp = "BRT";
					break;
				case 25:
					assigner = 330;
					timeZoneNameTemp = "NT";
					break;
				case 26:
					assigner = 400;
					timeZoneNameTemp = "AST";
					break;
				case 27:
					assigner = 500;
					timeZoneNameTemp = "EST";
					break;
				case 28:
					assigner = 600;
					timeZoneNameTemp = "CST";
					break;
				case 29:
					assigner = 700;
					timeZoneNameTemp = "MST";
					break;
				case 30:
					assigner = 800;
					timeZoneNameTemp = "PST";
					break;
				case 31:
					assigner = 900;
					timeZoneNameTemp = "ASKT";
					break;
				case 32:
					assigner = 1000;
					timeZoneNameTemp = "TAHT";
					break;
				case 33:
					assigner = 1100;
					timeZoneNameTemp = "SST";
					break;
			}
			if (counter == 0){
				fromTimeAdder = assigner;
				fromTimeName = timeZoneNameTemp;
				counter++;
			}
			else {
				toTimeName = timeZoneNameTemp;
				toTimeAdder = assigner;
			}
		}
		private static void converter(){
			toAMPM = AMPM;
			int converter = fromTimeAdder - toTimeAdder;
			int userTimeFinal = userTime + converter;
			if (userTimeFinal % 100 > 59){
				userTimeFinal = (userTimeFinal - 60)+100;
			}
			if (userTimeFinal >= 1300){
				userTimeFinal = userTimeFinal - 1200;
				if (userAMPM == 1){
					toAMPM = "PM";
				}
				else {
					toAMPM = "AM";
				}
			}
			else if (userTimeFinal <= 0){
				userTimeFinal = userTimeFinal + 1200;
				if (userAMPM == 1){
					toAMPM = "AM";
				}
				else {
					toAMPM = "PM";
				}
			}
			System.out.println(userTime/100 + ":" + userTime%100 + " " + AMPM + " in " + fromTimeName + " is " + userTimeFinal/100 + ":" + userTimeFinal%100 + " " + toAMPM + " in " + toTimeName);
		}
	}


