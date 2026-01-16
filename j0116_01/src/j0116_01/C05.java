package j0116_01;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		// String 문자열 타입 : next() - 사이띄움X,enter키 입력X, nextLine()-사이띄움, enter키
		// 정수타입 : nextInt(),nextLong()
		// 실수 타입 : nextFloat(),nextDouble()
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.>> ");
//		String name = scanner.nextLine();
//		System.out.println("이름 : "+name);
//		System.out.println("아이디를 입력하세요.>> ");
//		String id = scanner.nextLine();
//		System.out.println("아이디 : "+id);
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("이름을 입력하세요.>> ");
//		String name = scanner.next();
//		System.out.println("국어점수를 입력하세요.>> ");
//		int kor = scanner.nextInt();
//		System.out.println("이름 : "+name+" 국어점수 : "+kor);
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		System.out.printf("이름을 입력하세요.>> ");
		String name = scanner.next();
		System.out.printf("국어점수를 입력하세요.>> ");
		int kor = scanner.nextInt();
		System.out.printf("영어점수를 입력하세요.>> ");
		int eng = scanner.nextInt();
		System.out.printf("이름 : %s 국어점수 : %d 영어점수 : %d", name, kor, eng);
		scanner.close();
	}

}
