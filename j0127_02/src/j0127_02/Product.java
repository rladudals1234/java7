package j0127_02;

public class Product {
	String name;
	int price;
	int bonusPoint;
	
	Product(){}
	
	Product(String name, int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
