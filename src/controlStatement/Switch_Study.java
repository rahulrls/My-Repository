package controlStatement;

public class Switch_Study {



	public static void main(String[] args) {
		
		int Day=8;
		switch (Day)
		{
		
		case 1: System.out.println("Monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break; 
		case 4: System.out.println("Thursday");	
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		default : System.out.println("Please Enter The day between 1 to 7");
		}
	//switch between Months
		
		String Month="Julw";
		
		switch(Month)
		{
		case "Jan": System.out.println("This is the January Month");
		break;
		case "Feb": System.out.println("This is the February Month");
		break;
		case "Mar": System.out.println("This is the March Month");
		break;
		case "Apr": System.out.println("This is the April Month");
		break;
		case "May": System.out.println("This is the May Month");
		break;
		case "Jun": System.out.println("This is the June Month");
		break;
		case "Jul": System.out.println("This is the July Month");
		break;
		case "Aug": System.out.println("This is the August Month");
		break;
		case "Sep": System.out.println("This is the September Month");
		break;
		case "Oct": System.out.println("This is the October Month");
		break;
		case "Nov": System.out.println("This is the November Month");
		break;
		case "Dec": System.out.println("This is the Decemner Month");
		break;
		default:System.out.println("Please enter The Month Between Jan to Dec");
		}
		
		//switch between grade
		
		
		char Gread ='h';
		switch (Gread)
		{
		case 'A': System.out.println("Your are in distinction");
		break;
		case 'B': System.out.println("Your are in Fist Class");
		break;
		case 'C': System.out.println("Your are in Second Class");
		break ;
		case 'D': System.out.println("Your are Just Pass");
		break;
		default: System.out.println("please enter the Gread between A to D");
		}
		
		
		
		
		
	}

}
