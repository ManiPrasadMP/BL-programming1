package objectOriented.zoo_management;

abstract class Animal {
    private String name;
    private int health;
    private boolean isSleeping;

    public Animal(String name) {
        this.name = name;
        this.health = 100;
        this.isSleeping = false;
    }
 
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = Math.max(0, Math.min(100, health));
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void sleep() {
        isSleeping = true;
        System.out.println(name + " is now sleeping.");
    }

    public void wakeUp() {
        isSleeping = false;
        System.out.println(name + " woke up.");
    }

    public void eat() {
        setHealth(getHealth() + 10);
        System.out.println(name + " is eating. Health is now: " + health);
    }

    public abstract void makeSound();

    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Sleeping: " + isSleeping);
    }
}
