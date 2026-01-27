package j0127_01;

import java.util.Arrays;

public class Deck extends Object {
	Card[] c = new Card[52];
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	
	Deck() {
		super();
		for(int i=0;i<c.length;i++) {
			c[i] = new Card(shape[i/13],(i%13)+1);
		}
	}
	
	//카드전체확인
	void cardAllPrint() {
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i].toString());
		}
	}
	
	//카드섞기
	void shuffle() {
		for(int i=0;i<500;i++) {
			int no = (int)(Math.random()*52);	//0-51
			Card temp = c[0];
			c[0] = c[no];
			c[no] = temp;
		}
	}
	
	//카드 5장 뽑기
	Card[] pick() {
		Card[] pick = new Card[5];
		for(int i=0;i<5;i++) {
			pick[i] = c[i];
			//System.out.println(c[i].num[c[i].number]+","+c[i].kind);
			System.out.println(c[i].toString());
		}
		return pick;
		//return Arrays.copyOfRange(c, 0, 5);
	}
	
	//카드 5장 뽑기(특정 번지부터-이미 5장 다른 사람에게 돌린부분 제외용)
	Card[] pick(int index) {
		Card[] pick = new Card[5];
		for(int i=index;i<index+5;i++) {
			pick[i-index] = c[i];
			//System.out.println(c[i].num[c[i].number]+","+c[i].kind);
			System.out.println(c[i].toString());
		}
		return pick;
		//return Arrays.copyOfRange(c, index, index+5);
	}
}
