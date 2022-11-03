package Packageone;
import java.util.Scanner;

public class AlphabetDigitalSpecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter any character:");
		char ch=scanner.next().charAt(0);
		
		if((ch>='a'&&ch<='z')||(ch>='A'&& ch <='Z')) {
			
		
			System.out.println(ch +" is a ALPHABET.");
		}
		else if(ch>='0'&& ch<='9') {
			
			System.out.println(ch +" is a DIGIT.");
		}else 
			System.out.println(ch+"is A SPECIAL CHARACTER.");
		
		}
	}
		
	
			
			
			
	
