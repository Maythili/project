package Packgeone;

import java.util.Scanner;

//Write a program to find the factorial value of any number entered through the keyboard 
public class FactorialNumberExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,fact=1;
		System.out.println("Enter the number:");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		//for loop execute here
		for(int i=1;i<+num;i++)
		{
		//calculate factorial number
			fact=fact*1;
		}
		//print the factorial values on output screen
		System.out.println("Factorial of number is :"+fact);
		}

	}


