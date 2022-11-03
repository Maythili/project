package Packgeone;
//Write a program to calculate the sum of first 10 natural number
import java.util.Scanner;

public class SumofNaturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10,sum=0;
		
//the condition return true
		for(int i=1;i<=num;i++)
		{
			//Adding the value i into sum variable
			sum=sum+i;
		}
		//print value
		System.out.println("Sum of the 10 natural number is  ="+sum);
		}
	}


