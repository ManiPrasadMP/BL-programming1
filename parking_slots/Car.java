package objectOriented.parking_slots;

public class Car implements Vehicle {

	private int id;
	private static final int charge = 50;
	
	public Car(int id) {
		this.id=id;
	}
	@Override
	public void details() {
		System.out.println("Vehicle is car and its parking charge is :"+charge);
		
	}
	@Override
	public int getCharge() {
		return charge;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	

}
