import java.util.Scanner;
public class DisplayThisMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int daysinmonth=0;
		String MonthName="Invalid";
		System.out.println("Enter the month number:");
		int month=scanner.nextInt();
		
		if (month==1) {
			MonthName="Jan";
			daysinmonth=31;
		}
		if (month==2) {
			MonthName="Feb";
			daysinmonth=28;
		}
		if (month==3) {
			MonthName="Mar";
			daysinmonth=31;
		}
		if (month==4) {
			MonthName="Apr";
			daysinmonth=30;
		}
		if (month==5) {
			MonthName="May";
			daysinmonth=31;
		}
		if (month==6) {
			MonthName="Jun";
			daysinmonth=30;
		}
		if (month==7) {
			MonthName="Jul";
			daysinmonth=31;
		}
		
		if (month==8) {
			MonthName="Aug";
			daysinmonth=31;
		}
		
		if (month==9) {
			MonthName="Sep";
			daysinmonth=30;
		}
		
		if (month==10) {
			MonthName="Oct";
			daysinmonth=29;
		}
		
		if (month==11) {
			MonthName="Nov";
			daysinmonth=30;
		}
		if (month==12) {
			MonthName="Dec";
			daysinmonth=31;
		}
		System.out.println(MonthName+" "+daysinmonth);
		
		
		
		
		
		
		
		
		

	}

}
