package Packgeone;

import java.util.Scanner;

//Write a program to enter the number till user wants and at the end it should
//display the count of positive,negative,zeros entered
public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,count_positive=0,count_negative=0,count_zero=0;
		
		Scanner scanner=new Scanner(System.in);
		
		char option;
		do
		{
			System.out.println("Enter the number:");
			num=scanner.nextInt();
			
			if(num>00)
			{
				count_positive++;
			}
			if(num<0)
			{
				count_negative++;
			}
			else {
				count_zero++;
			}
			System.out.println("Do you wish to continue Y/N:");
			option=scanner.next().charAt(0);
		}
		while(option=='Y'||option=='Y');
		System.out.println("positive number:"+count_positive);
		System.out.println("Negative number:"+count_negative);
		System.out.println("Zero number:"+count_zero);
	}
}
	
		

	


