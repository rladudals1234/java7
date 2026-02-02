package j0130_01;

import java.util.ArrayList;
import java.util.Comparator;

public class C08 {

	public static void main(String[] args) {
//		ArrayList<Integer> list = new ArrayList<Integer>();
//		list.add(5);
//		list.add(1);
//		list.add(3);
//		list.add(2);
//		list.add(4);
//		list.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				return o1-o2;
//			}
//			
//		});	//정렬
//		System.out.println(list);
		
		ArrayList<Card> list = new ArrayList<Card>();
		list.add(new Card("SPADE",1));
		list.add(new Card("SPADE",2));
		list.add(new Card("HEART",10));
		list.add(new Card("DIAMOND",5));
		list.add(new Card("CLOVER",7));
		list.sort(new Comparator<Card>() {
			@Override
			public int compare(Card o1, Card o2) {		//비교
				//return o1.number-o2.number;			//번호기준정렬
				return o1.kind.compareTo(o2.kind);		//문자열기준정렬
				//return o2.kind.compareTo(o1.kind);		//문자열기준역순정렬
			}
		});	//정렬
		for(int i=0;i<list.size();i++) {
			Card c = list.get(i);
			System.out.printf("[%s,%d]\n",c.kind,c.number);
		}
	}

}
