package j0127_01;

public class CaptionTv extends Tv {
	String text;
	
	CaptionTv() {
		super();
		this.power = !power;
		System.out.println("자막이 나타납니다.");
	}
	
	void caption() {
		System.out.println("자막이 나타납니다.");
	}
}
