package thisKeyword;

public class Plants {
	//istance variable
	String plant_name;
	String colour;
	//declared parameterized constructor
	Plants(String plant_name,String colour)
	{
		this.plant_name=plant_name;
		this.colour=colour;
	}
	void display()
	{
		System.out.println("Plant_name="+plant_name);
		System.out.println("Plants colour="+colour);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plants plan=new Plants("jasmine","White");
		plan.display();

	}

}
