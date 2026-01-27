package j0127_01;

import j0127_01.Product;

public class C09 {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		System.out.println("회원명 : "+b.name);
		System.out.println("현재보유금액 : "+b.money);
		System.out.println("현재보유포인트 : "+b.bonusPoint);
		
		System.out.println("1. 삼성TV");
		System.out.println("2. 그램노트북");
		System.out.println("3. 하만오디오");
		
		//삼성Tv
		b.buy(new PTv());
		System.out.println("현재보유금액 : "+b.money);
		System.out.println("현재보유포인트 : "+b.bonusPoint);
		
		//노트북
		b.buy(new NoteBook());
		System.out.println("현재보유금액 : "+b.money);
		System.out.println("현재보유포인트 : "+b.bonusPoint);
		
		//오디오
		b.buy(new Audio());
		System.out.println("현재보유금액 : "+b.money);
		System.out.println("현재보유포인트 : "+b.bonusPoint);
		
		System.out.println("---------------------------");
		System.out.print("구매물품 : ");
		for(int i=0;i<b.count;i++) {
			Product p = (Product) b.list.get(i);
			System.out.print(p.name+" ");
		}
	}

}
