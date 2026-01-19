package j0119_01;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		//단항연산자 - 부호연산자
//		int a = -10;
//		System.out.println(a);
//		int b = +10;
//		System.out.println(b);
//		
//		//단항연산자 - 증감연산자
//		a++;	//a=a+1, a = a+1
//		b--;	//b=b-1, b = b-1
//		
//		//논리연산자 : &&, ||
//		
//		//산술연산 - +,-,*,/,%
//		System.out.println(10+3);
//		System.out.println(10-3);
//		System.out.println(10*3);
//		System.out.println(10/3);
//		System.out.println(10%3);	//나머지 연산
//		
//		// 비교연산자 : >,<,>=,<=,==,!=
//		System.out.println(10>3);
//		System.out.println(10<3);
//		System.out.println(10>=3);
//		System.out.println(10<=3);
//		System.out.println(10==3);
//		System.out.println(10!=3);
//		
//		//삼항연산자
//		String str = (a>b)?"맞습니다.":"틀렸습니다.";
//		System.out.println(str);
		
//		int a = 1_000_000;
//		int b = 2_000_000;
//		long c = (long)a * (long)b;
//		System.out.println(c);
		
//		char ch1 = 'a';
//		System.out.println((char)ch1+1);
//		int ch2 = ch1+1;
//		System.out.println((char)ch2);
//		char ch3 = (char)++ch1;	//char특징 : ++,-- 실행시켜줌.
//		System.out.println(ch3);
//		
//		int i = 'b'-'a';
//		System.out.println(i);
//		
//		int j = '2'-'0';
//		System.out.println(j);
//		
//		int k = '5'-'0';
//		System.out.println(k);
//		
//		char ch = '5';
//		int num = (int)ch;
//		System.out.println(num-48);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.>> ");
//		int num = scanner.nextInt();
//		System.out.print("숫자2를 입력하세요.>> ");
//		int num2 = scanner.nextInt();
//		System.out.printf("숫자1: %d, 숫자2: %d \n", num, num2);
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 한번에 입력하세요.>> ");
//		String num = scanner.nextLine();
//		char ch = num.charAt(0);
//		char ch2 = num.charAt(1);
//		int num1 = (int) ch-48;
//		int num2 = (int) ch2-48;
//		System.out.printf("숫자1: %d, 숫자2: %d \n", num1, num2);
//		scanner.close();
		
		//숫자 5개를 연속으로 입력받아 합계를 출력하시오. 12345 = 15
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 한번에 입력하세요.>> ");
//		String num = scanner.nextLine();
//		char ch = num.charAt(0);
//		char ch2 = num.charAt(1);
//		char ch3 = num.charAt(2);
//		char ch4 = num.charAt(3);
//		char ch5 = num.charAt(4);
//		int num1 = (int) ch-48;
//		int num2 = (int) ch2-48;
//		int num3 = (int) ch3-48;
//		int num4 = (int) ch4-48;
//		int num5 = (int) ch5-48;
//		int sum = num1+num2+num3+num4+num5;
//		System.out.printf("합계 : %d \n", sum);
//		scanner.close();
		
		//숫자 5개를 연속으로 입력받아 합계를 출력하시오. 12345 = 15 (for문 사용)
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 한번에 입력하세요.>> ");
		String num = scanner.nextLine();
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum += (int) num.charAt(i)-48;
		}
		System.out.printf("합계 : %d \n", sum);
		scanner.close();
	}

}
