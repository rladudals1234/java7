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
//		Scanner scan = new Scanner(System.in);
//		System.out.printf("이름을 입력하시오.>> ");
//		String name = scan.next();
//		System.out.printf("국어점수를 입력하시오.>> ");
//		int kor = scan.nextInt();
//		System.out.printf("영어점수를 입력하시오.>> ");
//		int eng = scan.nextInt();
//		System.out.printf("수학점수를 입력하시오.>> ");
//		int math = scan.nextInt();
//
//		int total = kor+eng+math;
//		double avg = total/3;
//		System.out.printf("이름:%s, 국어:%d, 영어:%d, 수학:%d, 합계:%d, 평균:%.2f", name,kor,eng,math,total,avg);
//		scan.close();
		
		//대입연산자
//		int a = 10;
//		int b = 3;
		
		//삼항연산자
//		System.out.println(a>5?"맞음":"틀림");
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("두수를 입력하시오.>> ");
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		int result = (a>b)?a:b;
//		System.out.println("더 큰수 : "+result);
//		String result_str = (a>0)?"0보다 큰수입니다.":"0보다 작은수입니다.";
//		System.out.println(result_str);
		
		//3개의 숫자를 입력받아, 가장 큰수를 출력하시오.
		//삼항연산자를 2번 쓰면 됩니다.
		//(a>b)?(   ):(   );
		//(a>c)?a:c
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("세개의 수를 입력하시오.>> ");
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		int c = scanner.nextInt();
//		int result=(a>b)?((a>c)?a:c):((b>c)?b:c);
//		System.out.println(result);
		
		//가장 큰수 다른 방식
		//Math.max(a, b);	//두수중 최대값 반환
//		System.out.println(Math.max(a, Math.max(b, c)));
		
//		int aa=5;
//		int bb=10;
//		int cc=7;
//		//최대값 - 삼항식
//		//최소값 - 삼항식
//		//(aa+bb+cc)-최대값-최소값 = 중간값
//		//최대값,중간값,최소값
//		int max = (aa>bb)?((aa>cc)?aa:cc):((bb>cc)?bb:cc);
//		int min = (aa<bb)?((aa<cc)?aa:cc):((bb<cc)?bb:cc);
//		int middle = (aa+bb+cc)-max-min;
//		System.out.printf("최대:%d,최소:%d,중간값:%d",max,min,middle);
		
		//논리연산자 (a>5)&&(b<5), (a>11)||(b<5)
//		System.out.println(a>5 && b<5);
		
		//비교연산자
//		System.out.println(a>b);
//		System.out.println(a<b);
//		System.out.println(a==b);
//		System.out.println(a!=b);
		//System.out.println(a<>b);//안됨
		
		//산술연산자
//		System.out.println(a+b);
//		System.out.println(a-b);
//		System.out.println(a*b);
//		System.out.println(a/b);
//		System.out.println(a%b);
		
		int a=5;
		int b=0;
		b=a++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		++a;
		b=a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		//test
		
	}

}
