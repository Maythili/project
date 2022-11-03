package Packageone;
//Write a program the user to input an
//integer and then output the number with digits reversed.
public class ReversedNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int num=12345;
		int revernum=0;
		while(num!=0)
		{
			//calculate reverse number
			revernum=revernum*10;
			revernum=revernum+num%10;
			num=num/10;
		}
		System.out.println("Reverse number is :"+revernum);
		}

	}


