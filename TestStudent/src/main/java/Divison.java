import java.util.Scanner;
public class Divison {
	public static void divnumber(int num1,int num2,int num3)
	{
		System.out.println(num1/num2/num3);
	}
	public static void main(String[]args)
	{
		int num1,num2,num3;
		Scanner scanner=new Scanner(System.in);
		System.out.println ("Enter the value num1,num2,num3");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		
		divnumber(num1,num2,num3);
	}

}
		
		






