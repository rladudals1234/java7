package j0128_01;

public class C04 {

	public static void main(String[] args) {
		Buyer b = new Buyer();	//aaa,1111,홍길동,10_000_000,0
		System.out.println(b.userName+"님 환영합니다.");
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new Tv());
		b.buy(new NoteBook());
		b.buy(new Audio());
		b.buy(new Refrigerator());
		
		System.out.print("구매상품 : ");		
		for(int i=0;i<b.list.size();i++) {
			Product p = (Product)b.list.get(i);
			System.out.print(p.name+"/"+p.price+"원, ");
		}
		System.out.println();
		System.out.println("잔액:"+b.money);
		System.out.println("보너스포인트:"+b.bonusPoint);
	}

}
