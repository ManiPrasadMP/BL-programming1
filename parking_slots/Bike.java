package objectOriented.parking_slots;

public class Bike implements Vehicle {

	private int id;
	private static final int charge = 25;
	public Bike(int id) {
		this.id = id;
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
		return "Bike [id=" + id + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
