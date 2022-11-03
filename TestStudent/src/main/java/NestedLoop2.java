import java.util.Scanner;
public class NestedLoop2 {

	public static void main(String[] args) {
		
		int num=1,rsize;
		System.out.println("enter row number");
		Scanner scanner=new Scanner(System.in);
		rsize=scanner.nextInt();
		for(int r=1; r<=rsize; r++ )//row
		{
			for(int space=1; space<=rsize-r;space++)//sapce
				System.out.print(" ");
			for(int c=1; c<=r; c++)//column
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
		
