package objectOriented.toll_system;

public class Bike implements Vehicle{
	
	private String plateNumber;
    private int stayDuration;
    
    public Bike(String plateNumber, int stayDuration) {
    	 this.plateNumber = plateNumber;
         this.stayDuration = stayDuration;
    }

    public double getTollAmount() {
        return 50 + 1.0 * getStayDuration();
    }
    public String getPlateNumber() {
        return plateNumber;
    }

    public int getStayDuration() {
        return stayDuration;
    }
    public void displayDetails() {
        System.out.println("Vehicle: " + this.getClass().getSimpleName());
        System.out.println("Plate No: " + plateNumber);
        System.out.println("Stay Duration: " + stayDuration + " mins");
        System.out.println("Toll: Rs." + getTollAmount());
    }
}
