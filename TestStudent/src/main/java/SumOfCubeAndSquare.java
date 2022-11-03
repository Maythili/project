import java.util.Scanner;
public class SumOfCubeAndSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a[]=new int[30];
		int s=scanner.nextInt();
		for(int i=0;i<s;i++)
		{
			a[i]=scanner.nextInt();
		}
		System.out.println(pattern(a));
	}
	public static int pattern(int[]a)
	{
		int n1=0,n2=0;
		for(int i=0;i<a.length;i++)
			
			if(a[i]%2==0)
				
				n1+=(a[i]*a[i]);
			else
				
				n2+=(a[i]*a[i]*a[i]);
		
		return n1+n2;
			
		
		}

	}


