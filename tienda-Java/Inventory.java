import java.util.ArrayList;
public class Inventory {
	private ArrayList<Product> listOfProduct;

	public Inventory() {
		listOfProduct = new ArrayList<Product>();
	}

	public void addProduct(Product product) {
		listOfProduct.add(product);
	}
	
	public void printTotal() {
		double auxBuy=0,auxSell=0,stock =0,price =0;
		for (int i=0;i<listOfProduct.size();i++) {
		 price = listOfProduct.get(i).getPrice();
		 stock = listOfProduct.get(i).getStock();
		 auxBuy+=price;
		 if(listOfProduct.get(i).isPromotional()) {
			 price*=1.21;
		 }
		 else {
			 if((price<1500 && stock>=100)|| stock<50){
				 price*=1.15;
				 price*=1.21;
			}else{
				 price*=1.20;
				 price*=1.21;
			}
		 }
		 auxSell+=price;
		 System.out.println("Price Sale of "+listOfProduct.get(i).getName()+":   "+Math.floor(price));
		 
		}
		System.out.println("Total Price Buy: "+auxBuy);
		System.out.println("Total Price Sell: "+auxSell);
	}

	
}
