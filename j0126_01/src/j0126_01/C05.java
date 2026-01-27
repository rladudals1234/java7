package j0126_01;

public class C05 {

	public static void main(String[] args) {
		//Card[] c = new Card[52];
		Deck d = new Deck();
		
		//카드 잘 들어갔는지 확인
//		for(int i=0;i<d.CARD_NUM;i++) {
//			System.out.println(d.c[i].number+","+d.c[i].kind);
//		}
		
		//지정한 카드 1장 뽑기
//		Card c = d.pick(55);
//		System.out.println(c.number+","+c.kind);
		
		//랜덤카드 1장 뽑기
//		Card c1 = d.pick();
//		System.out.println(c1.number+","+c1.kind);	//랜덤
		
		//카드 5장 뽑기
		d.shuffle();
		Card[] cArr = d.pick5();
		
		for(int i=0;i<cArr.length;i++) {
			System.out.println(cArr[i].kind+","+cArr[i].number);
		}
	}

}
