package j0128_01;

abstract public class C05 {

	void add() {}		//완성메소드입니다.
 	abstract void sub();	//미완성메소드입니다.
	public static void main(String[] args) {
		/*Player p = new Player();		//미완성클래스는 객체선언이 안됨.
		System.out.println(p.currentPlay);*/
		
		AudioPlayer a = new AudioPlayer() {
			
		};
	}

}
