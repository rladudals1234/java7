package j0123_01;

import java.util.Scanner;

public class Method {
	static Scanner scanner = new Scanner(System.in);
	//avg()
	double avg(int a,int b) {
		return (a+b)/(double)2.0;
	}
	
	int total(int a, int b, int c) {
		return a+b+c;
	}
	
	// input() 리턴없이 2개의 값을 입력받아, 합을 출력하는 메소드
	void input() {
		System.out.print("첫번째 값을 입력하세요.>> ");
		int a = Method.scanner.nextInt();
		System.out.print("두번째 값을 입력하세요.>> ");
		int b = Method.scanner.nextInt();
		System.out.println("합:"+(a+b));
	}
	
	//input2() 합의 값을 리턴해줌.
	int input2() {
		System.out.print("첫번째 값을 입력하세요.>> ");
		int a = Method.scanner.nextInt();
		System.out.print("두번째 값을 입력하세요.>> ");
		int b = Method.scanner.nextInt();
		return a+b;
	}
	
	// 1. 2개 숫자를 입력받아, 더하기,빼기,곱하기 값을 출력하는 메소드 구현
	// 2. 리턴없이 2개숫자를 입력받아 더하기,빼기,곱하기 값을 리턴 1개만 리턴 가능
	int[] addSubMulti1() {
		System.out.print("첫번째 값을 입력하세요.>> ");
		int a = Method.scanner.nextInt();
		System.out.print("두번째 값을 입력하세요.>> ");
		int b = Method.scanner.nextInt();
		int[] result = new int[3];
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		return result;
	}
	int[] addSubMulti1(int[] result) {
		System.out.print("첫번째 값을 입력하세요.>> ");
		int a = Method.scanner.nextInt();
		System.out.print("두번째 값을 입력하세요.>> ");
		int b = Method.scanner.nextInt();
		result[0] = a+b;
		result[1] = a-b;
		result[2] = a*b;
		return result;
	}
	void addSubMulti() {
		System.out.print("첫번째 값을 입력하세요.>> ");
		int a = Method.scanner.nextInt();
		System.out.print("두번째 값을 입력하세요.>> ");
		int b = Method.scanner.nextInt();
		System.out.println("더하기:"+(a+b));
		System.out.println("빼기:"+(a-b));
		System.out.println("곱하기:"+(a*b));
	}
}
