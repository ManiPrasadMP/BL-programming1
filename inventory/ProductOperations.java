package objectOriented.inventory;

public class ProductOperations {

	public static void main(String[] args) {
		
		WareHouse w1 = new WareHouse(5);
		w1.addProduct(new Product(12, "Book",156.77, 12));
		w1.addProduct(new Product(13, "Pen",89, 4));
		w1.addProduct(new Product(14, "Watch",5678.9, 2));
		w1.addProduct(new Product(15, "Laptop",56098.77, 6));
		w1.addProduct(new Product(16, "Keyboard",12564.1, 1));
		
		Product prd = w1.findProductById(12);
		System.out.println(prd);
		
		Orders ord = new Orders();
		ord.requestProduct(w1, 14, 1);
		
		
	}
}
