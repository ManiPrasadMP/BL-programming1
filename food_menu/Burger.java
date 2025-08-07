package objectOriented.food_menu;

class Burger extends FoodItem {
    public Burger() {
        super(150, 10, new String[]{"Bun", "Tomato", "Onion", "Cheese"});
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Burger...");
    }
}
