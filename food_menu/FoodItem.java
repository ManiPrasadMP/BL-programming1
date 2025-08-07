package objectOriented.food_menu;

abstract class FoodItem {
    private double price;
    private int prepTime;
    private String[] ingredients;

    public FoodItem(double price, int prepTime, String[] ingredients) {
        this.price = price;
        this.prepTime = prepTime;
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public int getPrepTime() {
        return prepTime;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public abstract void prepare();

    public void display() {
        System.out.println("Item: " + this.getClass().getSimpleName());
        System.out.println("Price: Rs." + price);
        System.out.println("Preparation Time: " + prepTime + " mins");
        System.out.print("Ingredients: ");
        for (String ing : ingredients) {
            System.out.print(ing + " ");
        }
        System.out.println();
    }
}

