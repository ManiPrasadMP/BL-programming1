package objectOriented.parking_slots;

public class Truck implements Vehicle {

	private int id;
	private static final int charge = 100;
	
	
	public Truck(int id) {
		this.id = id;
	}
	@Override
	public void details() {
		System.out.println("Vehicle is Truck and its parking charge is :"+charge);
		
	}
	@Override
	public int getCharge() {
		return charge;
	}
	@Override
	public String toString() {
		return "Truck [id=" + id + "]";
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}