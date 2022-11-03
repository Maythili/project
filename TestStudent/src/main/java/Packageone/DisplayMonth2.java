package Packageone;
import java.util.Scanner;

public class DisplayMonth2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int daysinMonth=0;
		String monthName="Invalid";
		
		System.out.println("Enter the month number:");
		int month=scanner.nextInt();
		if(month==1)
		{
			monthName="January";
			daysinMonth=31;
		}
		else if(month==3) {
			monthName="March";
			daysinMonth=31;
		}
		else if(month==4) {
			monthName="April";
			daysinMonth=31;
		}

		else if(month==5) {
			monthName="May";
			daysinMonth=31;
		}
		
		

	}

}
