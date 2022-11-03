import java.util.Scanner;
public class RemovingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1,name2;
		Scanner scanner=new Scanner(System.in);
		name1=scanner.next();
		name2=name1.replaceAll("[aeiouAEIOU]","");
		for(int i=0;i<name1.length();i++)
		{
			char ch=name1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='0'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
			{
				System.out.println(ch);
			}
		}
		System.out.println(name2);
	}
}
			