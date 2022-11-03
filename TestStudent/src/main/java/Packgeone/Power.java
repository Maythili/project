package Packgeone;
//two number are entered through the keyboard.
import java.util.Scanner;


public class Power{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,power,result=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the base number:");
		num=scanner.nextInt();
		System.out.println("Enter the power of number:");
		power=scanner.nextInt();
		//running the while loop here
		while(power!=0)
		{
			result=result*num;
			//power decrement here
			power--;
		}
		System.out.println("result = "+result);
		}
		

	}


