package Keyword;

public class InheritanceExample {
	int x;
	public void add(int a,int b)
	{
		x=a+b;
		System.out.println("sum of addition values:"+x);
	}
	public void sub(int a,int b)
	{
		x=a-b;
		System.out.println("sum of subtraction values:"+x);
		
	}
	public class My_Inheritance extends InheritanceExample
	{
		public void multi(int a,int b)
		{
			x=a*b;
			System.out.println("sum of multiplication values:"+x);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=10,q=20;
		My_InheritanceExample demo=new My_InheritanceExample();
		demo.add(p,q);
		demo.sub(p,q);
		demo.multi(p,q);

	}

}
