package Packgeone;
import java.util.Scanner;


//Write a program that prompt the user to input a position integer .it should then
//print the multiplication table of that number
public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter the positive number:");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		//for loop execute from until the conditioni<=10 becomes false
		for(int i=1;i<=10;i++)
		{
			
			//print the table values
			System.out.println(i+"*"+num+"="+i*num);
		}
		

	}

}
