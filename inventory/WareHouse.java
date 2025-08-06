package objectOriented.inventory;

class WareHouse {
    Product[] products;
    int count;

    public WareHouse(int size) {
        products = new Product[size];
        count = 0;
    }

    public void addProduct(Product p) {
        if (count < products.length)
            products[count++] = p;
    }

    public Product findProductById(int id) {
        for (int i = 0; i < count; i++)
            if (products[i].id == id) return products[i];
        return null;
    }
}
