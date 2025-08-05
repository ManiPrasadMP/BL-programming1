package objectOriented.car_simulation;

class Car {
    int speed, fuel, distance;

    Car(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void drive(int hrs) {
        if(fuel<hrs*10) {
        	System.out.println("Low fuel");
        	return;
        }
        fuel -=hrs*10;
        	
    }

    public void status() {
        System.out.println("Distance: " + distance + " Fuel: " + fuel);
    }
}

