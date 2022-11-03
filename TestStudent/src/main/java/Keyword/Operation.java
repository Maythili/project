package Keyword;

public class Operation {
	private int a,b;
	public Operation() {
	
	}
	public Operation(int a,int b) {
		
		this.a=a;
		this.b=b;
	}
	public int calculate()
	{
		return(a+b);
	
	}
	
public class Addition extends Operation{
	public Addition() {
		super();
	}
public Addition(int a,int b) {
	super(a,b);
	
}
public int calculate(int a,int b)
{
	return(a+b);
	
}
public class Subtraction extends Operation{
	public Subtraction()
	{
	
	}

public Subtraction (int a,int b) 
{
	super(a,b);
	
}
public int calculate(int a,int b)
{
	return(a-b);
	
}
public class Multiplication extends Operation{
	public Multiplication()
	{
	
	}

public Multiplication(int a,int b) 
{
	super(a,b);
	
}
public int calculate(int a,int b)
{
	return(a*b);
	
}
public class Division extends Operation{
	public Division()
	{
	
	}

public Division(int a,int b) 
{
	super(a,b);
	
}
public int calculate(int a,int b)
{
	return(a/b);
	
}
public class CalculationTest{
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Operation op=new Addition(50,100);
	System.out.println(op.calculate());
	op= new Subtraction();
	System.out.println(op.calculate());
	op= new Multiplication();
	System.out.println(op.calculate());
	op= new Division();
	System.out.println(op.calculate());

}
}


	


