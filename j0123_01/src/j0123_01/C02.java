package j0123_01;

public class C02 {

	public static void main(String[] args) {
		//객체사용목적 - 여러개 값을 저장
		//배열사용목적 - 각각 여러개 값을 저장
		
		//클래스명.변수명
		Card.width = 200;
		Card.height = 300;
		System.out.println(Card.width);
		
		//Card.kind = "SPADE";
		Card c1 = new Card();
		c1.kind = "SPADE";
		c1.number = 10;	//1~10,J,Q,K, ....
		System.out.println(c1.number);
		System.out.println(c1.width);
		Card c2 = new Card();
		
	}

}
