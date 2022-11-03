package Static;

public class StaticEx 
{
	static int a=3;
	static int cube()
	{
		return a*a*a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=StaticEx.cube();
		System.out.println(result);
		

	}

}
