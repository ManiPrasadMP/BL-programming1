package objectOriented.food_menu;

class Pizza extends FoodItem {
    public Pizza() {
        super(250, 15, new String[]{"Cheese", "Tomato Sauce", "Chilli"});
    }

    @Override
    public void prepare() {
        System.out.println("Preparing Pizza...");
    }
}
