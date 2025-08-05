package objectOriented;

class Product {
    int id;
    String name;
    double price;
    int quantity;

    public Product(int id, String name, double price, int qty) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = qty;
    }

    public boolean reduceStock(int qty) {
        if (quantity >= qty) {
            quantity -= qty;
            return true;
        }
        return false;
    }
}
