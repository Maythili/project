import java.util.Scanner;
public class NestedLoop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1,rsize;
		System.out.println("enter row number");
		Scanner scanner=new Scanner(System.in);
		rsize=scanner.nextInt();
		for(int r=1; r<=rsize; r++)
		{
			for(int space=1; space<=rsize-r;space++)
				System.out.println(" ");
			for(int c=1; c<=r; c++)//1<=2
			{
				System.out.println("* ");
			}
			System.out.println();
		}
	}
}
			

	
