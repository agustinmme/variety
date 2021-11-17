public class Product {
	private String name;
	private double price;
	private int	stock;
	private boolean promotional;
	public Product(String name, double price, int stock,boolean prom) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.promotional = prom;
	}
	
	public String getName() {
		return name;
	}

	public boolean isPromotional() {
		return promotional;
	}

	public void setPromotional(boolean promotional) {
		this.promotional = promotional;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}



}
