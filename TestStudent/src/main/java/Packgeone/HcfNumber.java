package Packgeone;
//Write a program to calculate HCF of two givennumber
public class HcfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=25;
		int number2=50;
		int temp;
		while(number2>0)
		{//calculate the HCF here
			temp=number2;
			number2=number1%number2;
			number1=temp;
		}//print the HCF values on output screen
		System.out.println("HCF of given number is="+number1);
	}
			
		}

	


