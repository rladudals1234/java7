package j0127_02;

import java.util.ArrayList;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	//Product[] cart = new Product[10];
	//int count = 0;
	
	//list,set,map
	//ArrayList list = new ArrayList();	//컬렉션:객체를 담는 배열
	
	ArrayList<Product> list = new ArrayList<Product>();	//컬렉션:객체를 담는 배열
	
	void buy(Product product) {
		//cart[count] = product;
		//count++;
		list.add(product);
		money -= product.price;
		bonusPoint += product.bonusPoint;
		System.out.println(product.name + "구매완료");
	}
}
