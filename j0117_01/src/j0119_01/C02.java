package j0119_01;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		// 변수 - boolean,char,(정수:byte,short,int,long),(실수:float,double),String
//		int a = 10;
//		int b = 3;
//		System.out.println(a/(double)b);
//		// 소수점자리수 출력가능, 공백크기 지정가능, 공백 0표시 가능
//		System.out.printf("%.2f", a/(double)b);
		
		//이름과 실수를 입력해서(실수소수점 3자리까지 입력) 소수점 첫째자리까지 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("이름을 입력하세요.>> ");
//		String name = scanner.nextLine();
//		System.out.print("실수를 입력하세요.>> ");
//		double num = scanner.nextDouble();
//		System.out.printf("이름:%s, 숫자:%.1f", name, num);
//		scanner.close();
		
//		System.out.println("안녕"+5.8);
//		System.out.print(3+5+"방가"+4+2);
//		System.out.printf("%s:%d","홍길동",15);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요.>> ");
		String name = scanner.next();	//사이띄움 안됨, enter키 입력없음.
		System.out.println("이름 : "+name);
		scanner.close();
	}

}
