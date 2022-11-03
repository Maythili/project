import java .util.Scanner;
public class Myname {

	public static void StringConcatenate(String fname,String mname,String lname) 
	{
		System.out.println(fname+mname+""+lname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname,mname,lname;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the fname:");
		fname=scanner.nextLine();
		System.out.println("Enter the sname:");
		mname=scanner.nextLine();
		System.out.println("Enter the lname:");
		lname=scanner.nextLine();
		StringConcatenate(fname,mname,lname);
	}
}
																																																																										
	
	
	
	



