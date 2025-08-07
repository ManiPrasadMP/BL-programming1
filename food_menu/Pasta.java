package objectOriented.food_menu;


class Pasta extends FoodItem {
    public Pasta() {
        super(200, 12, new String[]{"Pasta", "Cream", "Spices"});
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pasta...");
    }
}
