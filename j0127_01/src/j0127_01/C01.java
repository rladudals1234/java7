package j0127_01;

import member.Login;

public class C01 extends Object {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		Date today = new Date();
//		System.out.println(today);
//		scanner.close();
		
//		Shape s1 = new Shape();
//		s1.draw();
		
//		Circle c1 = new Circle();
//		System.out.println(c1.color);
//		c1.draw();
		
//		Card[] c = new Card[52];
//		c[0] = new Card("SPADE",1);
//		c[1] = new Card("SPADE",2);
		
		Deck d = new Deck();	//카드 한 묶음
		//d.cardAllPrint();
		d.shuffle();
		d.pick();
		
		Login l = new Login();
		System.out.println(l.pw);
		System.out.println(d.c[0].number);
	}

}
