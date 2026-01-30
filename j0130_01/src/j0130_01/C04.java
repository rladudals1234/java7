package j0130_01;

import java.util.ArrayList;

public class C04 {

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		Card c1 = new Card("SPADE",1);
//		Card c2 = new Card("SPADE",2);
//		Card c3 = new Card("SPADE",3);
//		Stuscore s1 = new Stuscore("홍길동",100,100,99);
//		Stuscore s2 = new Stuscore("유관순",100,100,99);
//		Stuscore s3 = new Stuscore("이순신",100,100,99);
//		Stuscore s4 = new Stuscore("test",100,100,99);
//		String str1 = "홍길자";
//		String str2 = "홍길순";
//		list.add(c1);
//		list.add(c2);
//		list.add(c3);
//		list.add(s1);
//		list.add(s2);
//		list.add(s3);
//		list.add(str1);
//		list.add(str2);
//		list.add(s4);
//		
//		//출력하시오.
//		System.out.println(list);
//		
//		for(int i=0;i<list.size();i++) {
//			//Object o = list.get(i);
//			if (list.get(i) instanceof Card) {
//				Card c = (Card) list.get(i);
//				System.out.println(c.kind+","+c.number);
//			} else if (list.get(i) instanceof Stuscore) {
//				Stuscore s = (Stuscore) list.get(i);
//				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
//			} else if (list.get(i) instanceof String) {
//				System.out.println((String) list.get(i));
//			}
//		}
		
		
		//제너릭
		ArrayList<Card> list = new ArrayList<Card>();
		Card c1 = new Card("SPADE",1);
		Card c2 = new Card("SPADE",2);
		Card c3 = new Card("SPADE",3);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		//다른 객체는 에러발생
		
		for(int i=0;i<list.size();i++) {
			Card c = list.get(i);
			System.out.println(c.kind+","+c.number);
		}
	}

}
