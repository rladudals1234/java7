package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C03 {
	static int aa;	//클래스내 변수 초기화 됨.
	public static void main(String[] args) {
		// 배열 같은 타입만 가능
//		int[] score = new int[5];
//		int[] scores = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		
		//메소드내에 변수들은 초기화를 해야 실행이 가능함.
//		int a;
//		System.out.println(a);
		//static aa는 사용가능
//		System.out.println(aa);
		
//		int[] score = new int[5];	//배열은 자동초기화가 됨.
//		System.out.println(score);
//		for(int i=0;i<score.length;i++) {
//			System.out.println(score[i]);
//		}
		
		// 배열에 값을 입력하는 방법
//		int[] score = new int[5];
//		score[0]=1;
//		score[1]=2;
//		score[2]=3;
//		score[3]=4;
//		score[4]=5;
		
//		int[] num = {1,2,3,4,5};		//가장 많이 사용
//		int[] num2 = new int[] {1,2,3,4,5};
		
//		int[] score = new int[5];
//		for(int i=0; i<5; i++) {
//			score[i] = i+1;
//		}
//		for(int i=0;i<5;i++) {
//			System.out.println(score[i]);
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		int[] a = new int[3];
////		a[0]=1;
//		//a[1]=1.1;	//다른타입은 넣을 수 없음.
//		//입력을 3개 받아서 출력하시오.
//		for(int i=0;i<3;i++) {
//			System.out.print("숫자를 입력하시오.>> ");
//			a[i] = scanner.nextInt();
//		}
//		for(int i=0;i<3;i++) {
//			System.out.printf("%d ",a[i]);
//		}
////		System.out.printf("%d,%d,%d \n",a);
//		scanner.close();
		
		//1~10까지 랜덤숫자5개를 생성해서 배열에 넣고 출력하시오.
//		int[] a = new int[5];
//		for(int i=0;i<5;i++) {
//			a[i] = (int)(Math.random()*10)+1;
//		}
//		for(int i=0;i<5;i++) {
//			System.out.printf("%d ",a[i]);
//		}
		
		//1~10까지 랜덤숫자5개, 입력받아 5개를 생성해서 배열에 넣고 출력하시오.
//		int[] a = new int[10];
//		Scanner scanner = new Scanner(System.in);
//		for(int i=0;i<5;i++) {
//			a[i] = (int)(Math.random()*10)+1;
//		}
//		for(int i=5;i<10;i++) {
//			System.out.printf("%d번째 숫자를 입력하시오.>> ",i+1);
//			a[i] = scanner.nextInt();
//		}
//		for(int i=0;i<10;i++) {
//			System.out.printf("%d ",a[i]);
//		}
//		scanner.close();
		
		//1~10까지 랜덤숫자5개, 입력받아 5개를 생성해서 배열에 넣고 출력하시오.
//		int[] a = new int[5];
//		int[] input = new int[5];
//		Scanner scanner = new Scanner(System.in);
//		for(int i=0;i<a.length;i++) {
//			a[i] = (int)(Math.random()*10)+1;
//			System.out.printf("%d번째 숫자를 입력하시오.>> ",i+1);
//			input[i] = scanner.nextInt();
//		}
//		for(int i=0;i<a.length;i++) {
//			System.out.printf("%d\t",a[i]);
//		}
//		for(int i=0;i<input.length;i++) {
//			System.out.printf("%d\t",input[i]);
//		}
//		scanner.close();
		
		//이름, 국어 점수를 입력받아, 마지막에 3명 모두 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		String[] name = new String[3];
//		int[] kor = new int[3];
//		for(int i=0;i<name.length;i++) {
//			System.out.print("이름을 입력하시오.>> ");
//			name[i] = scanner.next();
//			System.out.print("국어 점수를 입력하시오.>> ");
//			kor[i] = scanner.nextInt();
//		}
//		System.out.println("-------------");
//		System.out.printf("%s\t%s\n","이름","국어");
//		System.out.println("-------------");
//		for(int i=0;i<name.length;i++) {
//			System.out.printf("%s\t%d\n",name[i],kor[i]);
//		}
//		scanner.close();
		
		//1~3까지 랜덤숫자를 변수에 각각 다른 숫자를 입력해서 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		int[] num = new int[3];
//		int a1=0;
//		int a2=0;
//		int a3=0;
//		a1 = (int)(Math.random()*3)+1;
//		while(true) {
//			a2 = (int)(Math.random()*3)+1;
//			a3 = (int)(Math.random()*3)+1;
//			if(a2 != a1 && a3 != a1 && a3 != a2) break;
//		}
//		System.out.printf("%d %d %d",a1,a2,a3);
//		scanner.close();
//		for(;;) {
//			a2 = (int)(Math.random()*3)+1;
//			a3 = (int)(Math.random()*3)+1;
//			if(a2 != a1 && a3 != a1 && a3 != a2) break;
//		}
		
		//1~3까지 랜덤숫자를 변수에 각각 다른 숫자를 입력해서 출력하시오.
		//배열을 사용해서 각각 다른 랜덤숫자를 입력해서 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		int[] num = new int[3];
//		num[0] = (int)(Math.random()*3)+1;
//		int i = 1;
//		loop:while(true) {
//			num[i] = (int)(Math.random()*3)+1;
//			if(num[i] != num[i-1]) {
//				i++;
//				while(true) {
//					num[i] = (int)(Math.random()*3)+1;
//					if(num[i]!=num[i-1] && num[i] != num[i-2]) {
//						break loop;
//					}
//				}
//			}
//		}
//		
//		System.out.println("[ 랜덤번호 ]");
//		for(int j=0;j<num.length;j++) {
//			System.out.printf("%d ",num[j]);
//		}
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[10];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		System.out.println(Arrays.toString(num));	//순차
		//랜덤숫자 섞기(이전보다 속도 빠름)
		for(int i=0;i<300;i++) {		//최대값(i<300 : 섞는 횟수만 높아짐)은 상관없고 기존 값에서 다른곳에 있는 값을 교체만 되서 중복X
			int no = (int)(Math.random()*10);
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		System.out.println(Arrays.toString(num));	//랜덤
		scanner.close();
	}

}
