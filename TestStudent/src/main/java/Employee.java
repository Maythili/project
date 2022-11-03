
public class Employee {
	String e_name;
	int e_id;
	Employee()//no argument constructor
	{
		System.out.println("no argument constructor");
		e_name="mythili";
		e_id=10;
	}
	Employee(String e_name,int e_id)
	{
		System.out.println("no argument constructor");
		this.e_name=e_name;
		this.e_id=e_id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		System.out.println(employee.e_name);
		System.out.println(employee.e_id);
		
		Employee employee1=new Employee();
		         System.out.println("employee.e_name");
		         System.out.println("employee.e_id");
}
		
	}


