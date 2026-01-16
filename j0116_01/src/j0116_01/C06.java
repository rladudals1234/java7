package j0116_01;

import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		//Scanner
		//타입크기순서 : byte<short,char<int<long<float<double<String
//		System.out.println(2.0*100);
//		int a = 10;
//		int b = 20;
//		a += 1;	//a=a+1
//		a++;	//증감연산자 : a=a+1
//		a--;	//a=a-1
//		System.out.println(a);

//		int a = 10;
//		int b = 3;
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/(double)b);	//3.33333 -> 정수타입/정수타입 = 정수타입 3
//
//		boolean bol = true;
//		System.out.println(!bol);

		//이름, 국어, 영어, 수학 점수를 입력받아서 이름,합계, 평균을 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.printf("이름을 입력하시오.>> ");
		String name = scan.next();
		System.out.printf("국어를 입력하시오.>> ");
		int kor = scan.nextInt();
		System.out.printf("영어를 입력하시오.>> ");
		int eng = scan.nextInt();
		System.out.printf("수학을 입력하시오.>> ");
		int math = scan.nextInt();

		int total = kor+eng+math;
		double avg = total/3;
		System.out.printf("이름:%s, 국어:%d, 영어:%d, 수학:%d, 합계:%d, 평균:%.2f", name,kor,eng,math,total,avg);
		scan.close();
	}

}
