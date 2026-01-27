package j0126_01;

public class Deck {
	final int CARD_NUM = 52;		//static 상수선언은 변경할때 여기저기 파일들에 사용할때 수정할 필요없이 관리하기 위해
	Card[] c = new Card[CARD_NUM];
	String[] shape = {"SPADE","HEART","DIAMOND","CLOVER"};
	
	//기본생성자
	Deck() {
		/*for(int i=0;i<Card.KIND_MAX;i++) {
			for(int j=0;j<Card.NUM_MAX;j++) {
				int no = (i*Card.NUM_MAX)+(j);
				c[no] = new Card();
				if(i==0) {
					c[i].kind = "SPADE";
				}else if(i==1) {
					c[i].kind = "HEART";
				}else if(i==2) {
					c[i].kind = "DIAMOND";
				}else if(i==3) {
					c[i].kind = "CLOVER";
				}
				c[no].number = (i*Card.NUM_MAX)+(j+1);
			}
		}*/
		for(int i=0;i<c.length;i++) {
			c[i] = new Card();
			c[i].number = (i%Card.NUM_MAX)+1;		//0,1,2,3,4,...,12
			c[i].kind = shape[i/Card.NUM_MAX];		//0-12:SPADE, 13-25:HEART, 26-38:DIAMOND, 39-51:CLOVER
		}
	}
	
	//카드 1장 뽑기
	Card pick(int index) {
		if(index>CARD_NUM) {		//숫자 잘못넣을 수 있는 부분 변경 52이상이면 다시 처음번지부터
			index = index%CARD_NUM;	//index = index%52;
			//System.out.println(index);
		}else if(index==0){	//숫자 잘못넣을 수 있는 부분 변경 0이면 첫번째로 1도 첫번째
			index=1;
		}
		return c[index-1];
	}
	
	//랜덤 1장 뽑기
	Card pick() {
		return c[(int)(Math.random()*52)];
	}
	
	//5장 뽑기
	Card[] pick5() {
		//c[0].c[1].c[2]...c[5]
		
		/*Card[] pick6 = new Card[6];	//6장 뽑기
		for(int i=0;i<6;i++) {
			pick6[i] = pick();	//랜덤은 중복 가능
		}*/
		
		return new Card[]{c[0],c[1],c[2],c[3],c[4]};
	}
	
	//카드 섞기
	void shuffle() {
		for(int i=0; i<500;i++) {
			int random = (int)(Math.random()*52);	//0-51
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
		System.out.println("카드섞기가 완료되었습니다.");
	}
}
