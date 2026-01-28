package j0128_02;

public class C01 {

	public static void main(String[] args) {
		Buyer b = new Buyer("홍길동",100_000_000);
		b.buy(new Tv());
		b.buy(new Audio());
		
		System.out.println(b.userName+"님 환영합니다.");
		System.out.print("구매상품 : ");
		for(int i=0;i<b.list.size();i++) {
			Product p = (Product)b.list.get(i);
			System.out.print(p.name+"/"+p.price+"원, ");
		}
		System.out.println();
		System.out.println("잔액:"+b.money+"원");
		System.out.println("보너스포인트:"+b.bonusPoint);
	}

}
