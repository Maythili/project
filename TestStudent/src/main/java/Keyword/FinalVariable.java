package Keyword;

public class FinalVariable {
	final int b;
	
	final static int y;
	FinalVariable()
	{
		b=20;
	}
	void showValue()
	{
		System.out.println("value of b:"+b);
		
	}
	static
	{
		y=10;
		System.out.println("value of y: "+y);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariable fv=new FinalVariable();
		fv.showValue();

	}

}
