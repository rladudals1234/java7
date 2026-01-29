package j0129_01;

public class C02 {

	public static void main(String[] args) {
//		A a = new A();
//		B b = new B();
//		B2 b2 = new B2();		//추가
//		a.methodA(b2);		//b에서 b2로 수정되면 일일히 변경이 필요 interface로 변경하면 밑처럼 버전등 변경시 수정할 필요없음
		
		
		A a = new A();
		I i = new B();		//여기만 변경하면 됨 - 다형성:부모의 참조변수로 자손의 객체를 다루는 것
		a.methodA(i);
	}

}
