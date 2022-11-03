import java.util.Scanner;
public class MultiplicationMethod {
	public static void multinumber(int num1,int num2,int num3)
	{
		System.out.println(num1*num2*num3);
	}
	
	
	
	public static void main(String[]args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the value num1,num2,num3");
		num1=scanner.nextInt();
		num2=scanner.nextInt();
		num3=scanner.nextInt();
		
		multinumber(num1,num2,num3);
	}
}
	
	

		




