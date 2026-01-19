package j0119_01;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
//		float pi = 3.141592f;
//		System.out.println((int)(pi*1000)/1000f);
		
		//숫자를 입력받아 소수점 2째자리에서 절사해서 출력하시오.
		//3.141592 -> 3.14
		//405.7931 -> 405.79
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.>> ");
//		double input = scanner.nextDouble();
//		double result = (int)(input*100)/100;
//		System.out.println("결과값 : "+result);
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		double input = scanner.nextDouble();
//		System.out.println(Math.round(input));
//		scanner.close();
		
		//소수점 첫째자리 - 반올림:round, 올림:ceil, 버림:floor
//		System.out.println(Math.round(3.592));
//		System.out.println(Math.ceil(5.12));
//		System.out.println(Math.floor(6.99));
		
		//소수점 2째자리에서 반올림을 하시오. 34.195 -> 34.2
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("소수점이 있는 숫자를 입력하세요.>> ");
//		double input = scanner.nextDouble();
//		double result = (int)(input*100)/100.0;
//		double result = Math.round(input*10)/10.0;
//		System.out.println(result);
		
		//소수점 3자리에서 반올림,올림,버림을 모두 해보세요.
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("소수점이 있는 숫자를 입력하세요.>> ");
//		double input = scanner.nextDouble();
//		System.out.println(Math.round(input*100)/100.0);
//		System.out.println(Math.ceil(input*100)/100.0);
//		System.out.println(Math.floor(input*100)/100.0);
//		scanner.close();
		
//		int a = 10;
//		System.out.println(10*100/100);
		
//		double a = 0.1;
//		float b = 0.1f;
//		String result = (a==b)?"a와 b는 같다.":"a와 b는 다르다.";
//		System.out.println(result);
//		System.out.println((double)b);
//		
//		float c = (float)a;
//		System.out.println(c);
		
//		Scanner scanner = new Scanner(System.in);
//		double input = scanner.nextDouble();
//		String result = (input%2==0?"짝수":"홀수");
//		System.out.println(result);
//		scanner.close();
		
		//이름,국어,영어,수학 입력받아 이름,국어,영어,수학,합계,평균을 출력하시오.
		//홍길동,100,100,99,299,99.67
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름을 입력하세요.>> ");
		String name = scanner.nextLine();
		System.out.print("국어점수를 입력하세요.>> ");
		int kor = scanner.nextInt();
		System.out.print("영어점수를 입력하세요.>> ");
		int eng = scanner.nextInt();
		System.out.print("수학점수를 입력하세요.>> ");
		int math = scanner.nextInt();
		int total = kor+eng+math;
		double avg = total/(double)3;
		System.out.printf("이름:%s, 국어:%d, 영어:%d, 수학:%d, 합계:%d, 평균:%.2f", name, kor, eng, math, total, avg);
		System.out.printf("\n		[	학생성적프로그램		]\n");
		System.out.printf("\n이름\t국어\t영어\t수학\t합계\t평균\n");
		System.out.printf("-----------------------------------------------------------\n");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f", name, kor, eng, math, total, avg);
		scanner.close();
	}

}
