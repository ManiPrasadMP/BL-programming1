package objectOriented.zoo_management;

class Monkey extends Animal {
    public Monkey(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " chatters!");
    }
}
