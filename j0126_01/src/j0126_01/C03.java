package j0126_01;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
//		Stuscore s1 = new Stuscore();
//		//s1.no = 1;
//		s1.name = "홍길동";
//		s1.kor = 100;
//		s1.eng = 100;
//		s1.math = 100;
//		s1.total = s1.kor + s1.eng + s1.math;
//		s1.avg = s1.total/(double)3.0;
//		//Stuscore s2 = new Stuscore(2, "유관순", 100, 100, 99);
//		Stuscore s2 = new Stuscore("유관순", 100, 100, 99);
//		Stuscore s3 = new Stuscore("이순신", 90, 90, 91);
//		
//		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s1.no, s1.name, s1.kor, s1.eng, s1.math, s1.total, s1.avg);
//		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s2.no, s2.name, s2.kor, s2.eng, s2.math, s2.total, s2.avg);
//		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s3.no, s3.name, s3.kor, s3.eng, s3.math, s3.total, s3.avg);
		
		Scanner scanner = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
		s[0] = new Stuscore("홍길동", 100, 100, 100);
		s[1] = new Stuscore("유관순", 90, 90, 95);
		s[2] = new Stuscore("이순신", 80, 80, 81);
		
		System.out.print("학생이름을 입력하세요.>> ");
		String name = scanner.next();
		System.out.print("국어점수를 입력하세요.>> ");
		int kor = scanner.nextInt();
		System.out.print("영어점수를 입력하세요.>> ");
		int eng = scanner.nextInt();
		System.out.print("수학점수를 입력하세요.>> ");
		int math = scanner.nextInt();
		s[Stuscore.count] = new Stuscore(name, kor, eng, math);
		System.out.println("학생이 저장되었습니다.");
		
		for(int i=0; i<Stuscore.count; i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", s[i].no, s[i].name, s[i].kor, s[i].eng, s[i].math, s[i].total, s[i].avg);
		}
	}

}
