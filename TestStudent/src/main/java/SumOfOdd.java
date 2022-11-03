import java.util.Scanner;
public class SumOfOdd {
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,i,sumofodd=0;
	    scanner=new Scanner(System.in);
	    System.out.println("Enter the number");
	    number=scanner.nextInt();
	    for(int s=1;s<=number;s++)
	    {
	    	if(s%2!=0)
	    	{
	    		sumofodd=sumofodd+s;
	    	}
	    }
	    System.out.println("sum of odd number uoto"+number+" = "+sumofodd);
	
		

	}

}
