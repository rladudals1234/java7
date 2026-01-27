package j0126_02;

public class Deck {
	Card[] c = new Card[52];
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	
	
	Deck(){
		for(int i=0;i<(Card.KIND_MAX*Card.NUM_MAX);i++) {
			c[i] = new Card();
			c[i].number = (i%Card.NUM_MAX)+1;
			c[i].kind = shape[i/Card.NUM_MAX];
		}
	}
	
	//카드 섞기
	void shuffle() {
		for(int i=0;i<500;i++) {
			int random = (int)(Math.random()*52);
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}
	
	//1~5번까지 5장의 카드를 출력하시오.
	void card5Print() {
		for(int i=0;i<5;i++) {
			System.out.println(c[i].kind+","+c[i].number);
		}
	}
	
	//지정한 번호부터 5장 뽑기
	void card5Print(int index) {
		for(int i=index;i<index+5;i++) {
			System.out.println(c[i].kind+","+c[i].number);
		}
	}
}
