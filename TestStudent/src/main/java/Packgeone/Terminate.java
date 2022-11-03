package Packgeone;
//Write a program do-while loop that ask the user to enter two number.
import java.util.Scanner;

public class Terminate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num1,num2, sum=0;
		char option = 0;
		do
		{
			System.out.println("Enter the two number:");
			num1=scanner.nextInt();
			num2=scanner.nextInt();
			sum=sum+num1+num2;
			System.out.println("Sum:"+sum);
			System.out.println("Do you wish to perform another operation Y/N:");
			option=scanner.next().charAt(0);
		}
		while(option=='y'||option=='y');
	}
}

			
			
		

	


