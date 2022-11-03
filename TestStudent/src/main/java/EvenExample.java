import java.util.Scanner;
//write a program even or odd

public class EvenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num;
System.out.println("enter the number:");
Scanner scanner=new Scanner(System.in);
num=scanner.nextInt();

for(int i=0;i<=num;i++)
{
	if(i%2==0)
	{
		System.out.println("Even number:"+i);
	}
	else {
		System.out.println("odd number:"+i);
		
	}
}

		

	}

}
