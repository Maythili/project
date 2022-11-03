import java.util.Scanner;
 class TestAccount {
	String account_name;
	int account_no,amount;
	int account_deposit;
	int account_withdraw,account_balancecheck;
	
public void readData() 
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter account_name:,account_no:,amount:,account_deposit:,account_withdraw");
	account_name=scanner.next();
	account_no=scanner.nextInt();
	amount=scanner.nextInt();
	account_deposit=scanner.nextInt();
	account_withdraw=scanner.nextInt();
	account_balancecheck=amount+account_deposit-account_withdraw;
}
public void printData()
{
	System.out.println("account_name:"+account_name+" "
			+"account_no:"+account_no +"amount: "+amount
+"account_deposite:"+account_deposit+" "
+"account_withdraw :"+account_withdraw+"account_balancecheck:"+account_balancecheck);
}
public static void main (String[] args)
{
	System.out.println("Enter the account details are");
	TestAccount account=new TestAccount();
	account.readData();
	account.printData();
}
 }
 


	


			
	

	
	
	
		


	


