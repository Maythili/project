package Keyword;

public class Employee {
	String Emp_name;
	int Emp_id;
	int Salary;
	int age;
	static String company;
	Employee(String n,int a,int id,int s)
	{
		Emp_name=n;
		age=a;
		Emp_id=id;
		Salary=s;
	}
	void show()
	{
		System.out.println(Emp_name+" " +age+" "+Emp_id+" "+Salary+" "+company);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Mythili",22,132,20000);
		Employee emp2=new Employee("vanitha",22,120,20000);
		Employee.company="Capgemini";
		emp1.show();
		emp2.show();
		

	}

}
