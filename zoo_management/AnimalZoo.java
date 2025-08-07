package objectOriented.zoo_management;

public class AnimalZoo {
    public static void main(String[] args) {
  
        Animal[] zoo = new Animal[3];
        zoo[0] = new Lion("Leo");
        zoo[1] = new Elephant("Arjuna");
        zoo[2] = new Monkey("santha");

        for (Animal animal : zoo) {
            animal.makeSound();
            animal.eat();
            animal.sleep();
            animal.displayStatus();
            animal.wakeUp();
        }
    }
}
