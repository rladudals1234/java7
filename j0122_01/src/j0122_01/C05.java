package j0122_01;

import java.util.Arrays;

public class C05 {
	int aa = 0;	//인스턴스변수 - 객체선언후 참조변수명.변수명.
	static int bb = 0;	//클래스변수 - 객체선언없이 클래스명.변수명.
	
	void add2(int a, int b) {	//static없는 인스턴스 메소드
		System.out.println("합 : "+(a+b));
	}
	
//	static void add(int a, int b) {	//static존재로 클래스 메소드
//		System.out.println("합 : "+(a+b));
//	}
//	
//	static void sub(int a, int b) {
//		System.out.println("빼기 : "+(a-b));
//	}
//	
//	static void multi(int a, int b) {
//		System.out.println("곱하기 : "+(a*b));
//	}
//	
//	static void divide(int a, int b) {
//		System.out.println("나누기 : "+(a/b));
//	}
	
	static int add(int a, int b) {	//static존재로 클래스 메소드
		System.out.println("합 : "+(a+b));
		return a+b;
	}
	
	static int sub(int a, int b) {
		System.out.println("빼기 : "+(a-b));
		return a-b;
	}
	
	static int multi(int a, int b) {
		System.out.println("곱하기 : "+(a*b));
		return a*b;
	}
	
	static double divide(int a, int b) {
		System.out.println("나누기 : "+(a/b));
		return a/(double)b;
	}
	
//	static int[] addSub(int a, int b) {
//		int result = a+b;
//		int result2 = a-b;
//		return result;		//리턴값은 1개만 전송가능
//	}
	
	public static void main(String[] args) {
		int a = 0;	//지역변수 - 메인메소드 내 선언
		
		C05 c1 = new C05();
		System.out.println(c1.aa);
		System.out.println(bb);	//같은 클래스내에서는 클래스명 생략가능
		
		//흰색,true,7
		Tv t1 = new Tv();
		t1.color = "흰색";
		t1.power = true;
		t1.channel = 7;
		
		//검정,false,10
		Tv t2 = new Tv();
		t2.color = "검정";
		//t2.power = false;
		t2.channel = 10;
		
		System.out.println(t1.color);
		System.out.println(t1.power);
		System.out.println(t1.channel);
		
		System.out.println(t2.color);
		System.out.println(t2.power);
		System.out.println(t2.channel);
		
		int aaa=10;
		int[] aArr = {1,2,3};
		System.out.println(aaa);
		System.out.println(Arrays.toString(aArr));
		//파이썬은 스크립트언어라 한단씩 실행하며 함수정의는 위에 놓기
		//자바는 컴파일후 실행으로 밑에 함수놔도 됨.
		
		int bbb=2;
		//인스턴스 메소드 사용방법
		C05 c2 = new C05();
		c2.add2(aaa,bbb);
		//클래스 메소드 사용방법 - 같은 클래스 내에는 클래스명 생략가능
//		add(aaa,bbb);
//		sub(aaa,bbb);
//		multi(aaa,bbb);
//		divide(aaa,bbb);
		
		aaa=10;
		bbb=3;
		int result = add(aaa,bbb);
		int result2 = sub(aaa,bbb);
		int result3 = multi(aaa,bbb);
		double result4 = divide(aaa,bbb);
		// return문 사용
		// 더하기
		System.out.printf("%d \n",result);
		//빼기
		System.out.printf("%d \n",result2);
		//곱하기
		System.out.printf("%d \n",result3);
		//나누기
		System.out.printf("%.2f \n",result4);
		
		int[] aaArr = {1,2,3};
		System.out.println(Arrays.toString(aaArr));
		Tv t = new Tv();
		System.out.println(t);
	}

}
