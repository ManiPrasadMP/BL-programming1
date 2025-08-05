package objectOriented;

class ElectricCar extends Car {
    ElectricCar(int speed, int battery) {
        super(speed, battery);
    }

    public void status() {
        System.out.println("Distance: " + distance + " Battery%: " + fuel);
    }
}
