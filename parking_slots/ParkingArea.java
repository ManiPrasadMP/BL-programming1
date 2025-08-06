package objectOriented.parking_slots;

import java.util.Arrays;

public class ParkingArea {
	
	int slots;
	int total_amount;
	Vehicle[] vhl;
	public ParkingArea(int slots) {
		this.slots = slots;
		vhl = new Vehicle[slots];
	}
	
	public void viewSlots() {
		System.out.println("Available no. of slots count is : "+slots);
	}

	public boolean parkVehicle(Vehicle v) {
		if(slots > 0) {
			for(int i = 0;i<vhl.length;i++) {
			if(vhl[i]==null) {
				vhl[i]=v;
				slots--;
				System.out.println("Vehicle "+v+" is parked at "+(i+1)+"th slot");
				total_amount +=v.getCharge();
				return true;
			}
			}
		}
		System.out.println("Slots are not available!!");
		return false;
	}
	
	public void removeVehicle(Vehicle v) {
//		Vehicle[] v1 = new Vehicle[vhl.length];
////		int i = 0;
//		boolean get = false;
		for(int i = 0;i<vhl.length;i++) {
			if(vhl[i]!=null && vhl[i].getId()==v.getId()) {
				slots++;
				vhl[i]=null;
				System.out.println("Vehicle is removed");
				return;
			}
		}
//		for(Vehicle vl : vhl) {
//			
//			if(vl!=null && vl.getId()==v.getId()) {
//				slots++;
//				System.out.println("Vehicle is removed");
//				get = true;
//				break;
//			}
//			v1[i++]=vl;
//		}
//		if(get) {
//			for(int j = i+1;j<vhl.length;j++) {
//				v1[j]=vhl[j];
//			}
//			vhl=v1;
//			return;
//		}
		System.out.println("vehicle not found");
	}

	@Override
	public String toString() {
		return "ParkingArea [Availabel slots=" + slots + ", total_amount=" + total_amount + "\n------------slots vehicle vlist---------\n" + Arrays.toString(vhl)
				+"]";
	}
	
	
}
