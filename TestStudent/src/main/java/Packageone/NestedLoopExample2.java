package Packageone;
import java.util.Scanner;
public class NestedLoopExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=1;
		int rsize;
		System.out.println("enter row number:");
		rsize=scanner.nextInt();
		for(int r=1;r<=rsize;r++)
		{
			for(int space=1;space<=rsize;space++)
				System.out.println(" ");
			for(int c=1;c<=r;c++) {
				System.out.println("*");
			}
				
		}
	}

}
