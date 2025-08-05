package objectOriented;

class Orders {
    public boolean requestProduct(WareHouse w, int productId, int qty) {
        Product p = w.findProductById(productId);
        if (p != null && p.reduceStock(qty)) {
            System.out.println("Order Confirmed for: " + p.name);
            return true;
        }
        System.out.println("Order Failed");
        return false;
    }
}
