package j0127_02;

public class C02 {

	public static void main(String[] args) {
		Buyer b1 = new Buyer();
		
		b1.buy(new Tv());
		System.out.println("잔액 : "+b1.money);
		System.out.println("보너스포인트 : "+b1.bonusPoint);
		
		b1.buy(new Phone());
		System.out.println("잔액 : "+b1.money);
		System.out.println("보너스포인트 : "+b1.bonusPoint);
		
		b1.buy(new Audio());
		System.out.println("잔액 : "+b1.money);
		System.out.println("보너스포인트 : "+b1.bonusPoint);
		
		b1.buy(new NoteBook());
		System.out.println("잔액 : "+b1.money);
		System.out.println("보너스포인트 : "+b1.bonusPoint);
		
		System.out.print("구매목록 : ");
		for(int i=0;i<b1.list.size();i++) {
			Product p = b1.list.get(i);
			System.out.print(p.name+",");
		}
	}

}
