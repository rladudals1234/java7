package j0128_02;

import java.util.ArrayList;

public class Buyer {
	String userName;
	int money;
	int bonusPoint;
	ArrayList list = new ArrayList();
	
	Buyer() {}
	
	Buyer(String userName, int money) {
		this.userName = userName;
		this.money = money;
	}
	
	void buy(Product p) {
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p);
	}
}
