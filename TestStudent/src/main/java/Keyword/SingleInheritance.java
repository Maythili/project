package Keyword;

public class SingleInheritance {
	static int num1=20;
	static int num2=15;
}
class MainInheritance extends SingleInheritance{
	   

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	int num3=2;
	int result=num1+num2+num3;
	System.out.println("Result of child class is "+result);
	
	}

}

