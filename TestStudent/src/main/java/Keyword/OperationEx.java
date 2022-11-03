package Keyword;

public class OperationEx
{
	int a=10;
	int b=20;
	OperationEx()
	{
		System.out.println("add:"+(a+b));
	}
	OperationEx(int a)
	{
		this();
		System.out.println("sub:"+(a-b));
		
	}
	OperationEx(int a,int b)
	{
	this(30);
	System.out.println("mul:"+(a*b));
	}
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   OperationEx obj=new OperationEx(4,4);

	}

}
