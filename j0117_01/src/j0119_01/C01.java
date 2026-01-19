package j0119_01;

import java.util.Scanner;

//내장객체는 import해야 사용가능 - System.in

public class C01 {
	public static void main(String[] args) {
		// 함수 -> 메소드
		// 함수,객체 차이점 -> 이름():함수, 클래스:첫글자가 대문자
//		System.out.println("출력입니다.");
//		System.out.println("입력해주세요.");
//		
//		//입력부분 - 객체선언
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.>> ");
//		int a = scanner.nextInt();
//		System.out.println("입력된 숫자 : "+a);
//		scanner.close();
		
//		int a = 2_147_483_647;
//		System.out.println(a+1);
//		System.out.println(a-1);
//		System.out.println(a+10);
//		int b = 10;
//		System.out.println(b-1);
		
//		int True = 10;
//		//int true;	//예약어 안됨.
//		boolean a = true;
//		boolean b = true;
//		byte c = 1;	//256개 -128~127
//		short d = 1;
//		int e = 1;
//		long f = 10000000000L;
//		float g = 1.0f;
//		double h$_a = 1.0d;
//		char cc = 'a';
//		char cc2 = ' ';
//		//char cc3 = '';	//아무것도 넣지 않은 것은 안됨.
//		
//		String str = new String("aaa");
//		System.out.println(str);
//		String str2 = "aaa";	//String 객체만 new를 사용하지 않아도 됨.
//		System.out.println(str2);
		
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int) ch);
		System.out.println(ch+1);	// byte,short,char -> + 연산을 하면 int타입
		int ch2 = 97;
		System.out.println((char) ch2);
		
		String str = "aaa";
		System.out.println(str+77);
		System.out.println(77-11+str);
		
	}

}