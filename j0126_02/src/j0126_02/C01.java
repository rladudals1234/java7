package j0126_02;

public class C01 {

	public static void main(String[] args) {
		//52장의 카드를 생성해서
		//0-4번까지 5장의 카드를 출력하시오.
		//1-13
		//스페이드,하트,다이아몬드,클로버
		//SPADE,HEART,DIAMOND,CLOVER
		
		Deck d = new Deck();
		//0-4번까지 5장의 카드를 출력하시오.
		//d.card5Print();
		//5-9번까지 5장의 카드를 출력하시오.
		//d.card5Print(5);
		
		//카드섞기
		d.shuffle();
		//5장 출력
		d.card5Print();
	}

}
