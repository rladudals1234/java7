package j0128_01;

abstract public class Player {
	int currentPlay;
	Player(){
		currentPlay = 0;
	}

	void play() {		//오버로딩 - 완성메소드
		System.out.println("실행합니다.");
	}
	
	abstract void play(int cp);	//미완성메소드
	abstract void stop();		//미완성메소드
	
	/*void play(int no) {
		currentPlay = no;
	}*/
}
