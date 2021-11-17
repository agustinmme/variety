

public class App {

	public static void main(String[] args) {
		
		Product productSoda = new Product("Gaseosa", 100, 40,false);
		Product productWine = new Product("Vino", 2000, 70,false);
		
		Product productWater = new Product("Agua", 100, 40,true);
		Product productMate = new Product("Mate", 2000, 70,true);
		
		Inventory inventory = new Inventory();
		
		inventory.addProduct(productSoda);
		inventory.addProduct(productWine);
		
		inventory.addProduct(productWater);
		inventory.addProduct(productMate);
		inventory.printTotal();
	}

}
