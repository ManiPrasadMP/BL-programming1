package objectOriented;

class Car {
    int speed, fuel, distance;

    Car(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void drive(int hours) {
        int canDrive = Math.min(hours, fuel);
        distance += canDrive * speed;
        fuel -= canDrive;
    }

    public void status() {
        System.out.println("Distance: " + distance + " Fuel: " + fuel);
    }
}

