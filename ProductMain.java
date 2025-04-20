class Product {
	int productId;
	String productName;
	double price;
	int quantity;
	public Product(int productId,String productName,double price , int quantity){
		this.productId=productId;
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;

	}
	public double getTotalPrice(){
		return price*quantity;
	}
}
class ProductMain{
	public static void main(String [] args){
		Product p1= new Product(101,"Laptop",75000,1);
		Product p2= new Product(102,"Mouse",500,2);
		Product p3= new Product(103,"Keyboard",1500,2);
		double totalBill = p1.getTotalPrice()+p2.getTotalPrice()+p3.getTotalPrice();
		System.out.println("Total Bill Amount:"+ totalBill);
	}
}