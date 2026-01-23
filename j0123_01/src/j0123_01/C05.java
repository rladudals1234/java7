package j0123_01;

import java.util.Arrays;

public class C05 {

	long a,b;
	int aa;
	
	long add() {	//오버로딩 - 메소드명은 동일 - 매개변수 개수 또는 타입
		return a+b;
	}
	
	long add(long a, long b) {
		return a+b;
	}
	
	static long add(long a, long b, long c) {
		return a-b-c;
	}
	
	public static void main(String[] args) {
		int[] num = new int[3];
		AMethod a = new AMethod();
		a.input(num);
		System.out.println(Arrays.toString(num));
	}

}
