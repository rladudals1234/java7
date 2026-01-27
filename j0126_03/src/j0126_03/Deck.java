package j0126_03;

public class Deck {
	static final int CARD_NUM = 52;
	Card[] c = new Card[CARD_NUM];
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	int pick_size = 5;
	Deck() {
		for(int i=0;i<c.length;i++) {
			c[i] = new Card();
			c[i].number = (i%Card.NUM_MAX)+1;		//0,1,2,3,4,...,12
			c[i].kind = shape[i/Card.NUM_MAX];		//0-12:SPADE, 13-25:HEART, 26-38:DIAMOND, 39-51:CLOVER
		}
	}
	
	//카드섞기
	void shuffle() {
		for(int i=0; i<500;i++) {
			int random = (int)(Math.random()*52);	//0-51
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}
	
	//5장뽑기
	Card[] pick() {
		Card[] pick = new Card[pick_size];
		for(int i=0;i<pick_size;i++) {
			pick[i] = c[i];
			System.out.println(c[i].number+","+c[i].kind);
		}
		return pick;
	}
	
	//5장 뽑기(특정 번지부터)
	Card[] pick(int index) {
		Card[] pick = new Card[pick_size];
		for(int i=index;i<(index+pick_size);i++) {
			pick[i-index] = c[i];
			System.out.println(c[i].number+","+c[i].kind);
		}
		return pick;
	}
}
