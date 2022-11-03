import java.util.Scanner;
public class NestedLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,rsize;
		System.out.println("enter row number");
		Scanner scanner=new Scanner(System.in);
		rsize=scanner.nextInt();
		for(int r=1; r<=rsize; r++)
		{
			for(int space=1;space<=rsize;space++)
				System.out.println(" ");
			
			for(int c=1; c<=r; c++)
			{
				System.out.println("*");
			}
			System.out.println();
			}
		}
}
		


