package Packgeone;
//Write a program find the largest number and smallest number
import java.util.Scanner;

public class LargestSmallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		
		Scanner scanner=new Scanner(System.in);
	
		int max=scanner.nextInt();
		int min=scanner.nextInt();
		char option;
		do
		{
			System.out.println("Enter the number:");
			number=scanner.nextInt();
			if(number>max)
			{
				max=number;
			}
			if(number>min)
			{
				min=number;
			}
			
			System.out.println("Do you want to continuey/n:");
			option=scanner.next().charAt(0);
		}while(option=='Y'||option=='Y');
		
		System.out.println("largest number are:"+max);
		System.out.println("smallest number are:"+min);
	}
}
		
	
