package objectOriented.car_simulation;

public class TestCar {

	public static void main(String[] args) {
		
		Car c = new ElectricCar(30,50);
		
		c.status();
		c.drive(4);
		c.status();
	}
}
