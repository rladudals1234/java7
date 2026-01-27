package j0127_01;

public class C04 {

	//클래스변수
	static int aa;
	//인스턴스변수
	int b;
	
	public static void main(String[] args) {
		//지역변수는 초기화가 자동으로 되지 않기에 초기화를 해줘야 함.
		int a=0;
		System.out.println(a);
		
		//객체선언 후 사용
		C04 c = new C04();
		System.out.println(c.b);
		
		System.out.println(C04.aa);
	}

}
