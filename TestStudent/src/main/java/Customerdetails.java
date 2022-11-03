import java.util.Scanner;
public class Customerdetails{
	String customer_name,gender,address="   ";
		short age;
		long mobile_no;
		public void ReadData()
		{
			System.out.println("Enter the customer details are");
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter the customer name:");
			customer_name=scanner.next();
			System.out.println("Enter the age:");
			age=scanner.nextShort();
			System.out.println("Enter the gender:");
			gender=scanner.next();
			System.out.println("Enter the customer address:");
			Scanner Scanner= new Scanner(System.in);
			address=scanner.next();
			System.out.println("Enter the customer mobile_number:");
			mobile_no=scanner.nextLong();
		}
		
		public void printData()
		{
			System.out.println("customer_name:"+customer_name);
			System.out.println("age:"+age);
			System.out.println("gender:"+gender);
			System.out.println("address:"+address);
			System.out.println("mobile_no:"+mobile_no);
		}
}
			
			
			
			
			
			
			
		




