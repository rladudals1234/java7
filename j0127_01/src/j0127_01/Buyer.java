package j0127_01;

import java.util.ArrayList;

public class Buyer {
	String name = "홍길동";
	int money = 1000;
	int bonusPoint = 0;
	
	/*void buy(PTv p) {
		money = money - p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.name+" 구매가 되었습니다.");
	}
	
	void buy(NoteBook p) {
		money = money - p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.name+" 구매가 되었습니다.");
	}
	
	void buy(Audio p) {
		money = money - p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.name+" 구매가 되었습니다.");
	}*/
	
	//배열10개 선언
	int count = 0;
	//Product[] cart = new Product[10];
	ArrayList list = new ArrayList();
	
	//다형성
	void buy(Product p) {
		//cart[count] = p;		//구매물품보관
		list.add(p);
		count++;
		money = money - p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.name+" 구매가 되었습니다.");
	}
}
