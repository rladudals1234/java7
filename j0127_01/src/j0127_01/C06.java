package j0127_01;

public class C06 {

	public static void main(String[] args) {
		//다형성 - 조상의 참조변수로 자손의 객체를 다룸
		
		// 객체선언
		CaptionTv c1 = new CaptionTv();
		System.out.println(c1.text);
		System.out.println(c1.power);
		System.out.println(c1.channel);
		
		Tv t1 = new Tv();
		System.out.println(t1.channel);
		
		Tv c2 = new CaptionTv();
		System.out.println(c2.power);
		System.out.println(c2.channel);
		//자손의 참조변수로 조상의 객체를 다루는 것(X)
		
		
	}

}
