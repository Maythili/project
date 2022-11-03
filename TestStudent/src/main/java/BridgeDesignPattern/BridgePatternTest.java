package BridgeDesignPattern;

public class BridgePatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle1= new Car(new NewVehicle(),new
				OldVehicle());
				vehicle1.purchase();
				Bike vehicle2 = new Bike(new NewVehicle(),new
				OldVehicle());
				vehicle2.purchase();

	}

}
