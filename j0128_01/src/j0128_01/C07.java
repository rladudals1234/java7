package j0128_01;

import java.util.ArrayList;

public class C07 {

	public static void main(String[] args) {
		A a = new A();
		I b = new B();
		a.methodA(b);
		I b3 = new B2();
		a.methodA(b3);
		
		B b1 = new B();
		B2 b4 = new B2();
		
		ArrayList list = new ArrayList();
		B b2 = new B();
		list.add(b2);
	}

}
