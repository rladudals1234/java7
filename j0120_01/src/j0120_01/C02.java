package j0120_01;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		//중첩for문
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d\n",i,j,(i*j));
//			}
//			System.out.println();
//		}
		
		//구구단을 출력하는데 2,4,6,8단 짝수단만 출력하시오.
//		for(int i=2;i<=9;i++) {
//			if(i%2!=0) continue;
//			System.out.printf("[ %d단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d\n",i,j,(i*j));
//			}
//			System.out.println();
//		}
		//조건없이 증감값으로
//		for(int i=2;i<=9;i+=2) {
//			System.out.printf("[ %d단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d\n",i,j,(i*j));
//			}
//			System.out.println();
//		}
		
//		for(int i=2;i<=9;i++) {
//			if(i%2!=0) continue;
//			System.out.printf("[ %d단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				if(j%2==0) continue;	//홀수만
//				System.out.printf("%d X %d = %d\n",i,j,(i*j));
//			}
//			System.out.println();
//		}
		
//		for(int i=2;i<=9;i++) {
//			System.out.printf("[ %d단 ]\t\t",i);
//		}
//		System.out.println();
//		for(int i=1;i<=9;i++) {
//			for(int j=2;j<=9;j++) {
//				System.out.printf("%d X %d = %d\t",j,i,(i*j));
//			}
//			System.out.println();
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		for(int i=0;i<2;i++) {
//			System.out.print("이름을 입력하세요.>> ");
//			String name = scanner.next();
//			System.out.print("국어점수를 입력하세요.>> ");
//			int kor = scanner.nextInt();
//			System.out.print("영어점수를 입력하세요.>> ");
//			int eng = scanner.nextInt();
//			System.out.print("수학점수를 입력하세요.>> ");
//			int math = scanner.nextInt();
//			int sum = kor + eng + math;
//			double avg = sum/3.0;
//			System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name,kor,eng,math,sum,avg);
//		}
//		scanner.close();
		
		// 000
		// 001
		// 002
		// ...
		// 999
//		for(int i=0; i<=9;	i++) {
//			for(int j=0; j<=9; j++) {
//				for(int k=0; k<=9; k++) {					
//					System.out.printf("%d%d%d\n",i,j,k);
//				}		
//			}
//		}
		
//		int i=0;	//초기값
//		while(i<=9) {	//조건식
//			int j=0;
//			while(j<=9) {
//				int k=0;
//				while(k<=9) {
//					System.out.printf("%d%d%d\n",i,j,k);
//					k++;	//증감식
//				}
//				j++;	//증감식
//			}
//			i++;	//증감식
//		}
		
//		for(int i=0; i<=9;	i++)
//			for(int j=0; j<=9; j++)
//				for(int k=0; k<=9; k++)			
//					System.out.printf("%d%d%d\n",i,j,k);
		
		// 구구단 출력
		// 입력을 2개 받아 구구단 출력하시오. 
		// 3,7 -> 3단에서 7단까지 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자1을 입력하세요.>> ");
//		int input1 = scanner.nextInt();
//		System.out.print("숫자2를 입력하세요.>> ");
//		int input2 = scanner.nextInt();
//		int num1 = Math.min(input1, input2);
//		int num2 = Math.max(input1, input2);
//		for(int i=num1;i<=num2;i++) {
//			System.out.printf("[ %d단 ]\n",i);
//			for(int j=1;j<=9;j++) {
//				System.out.printf("%d X %d = %d\n",i,j,(i*j));
//			}
//			System.out.println();
//		}
//		scanner.close();
		
		// 랜덤숫자 1~100까지의 랜덤숫자를 생성해서
		// 10번 시도해서 맞추는 프로그램을 구현하시오.
		// 1번째 시도입니다.
		// while 구현하시오. for문 구현하시오.
		// 번호를 입력했을때 입력한 수보다 큰수입니다., 입력한 수보다 작은수입니다.
		// 정답입니다.
		// 랜덤숫자 정답 : 7
		
		//while로 구현
//		Scanner scanner = new Scanner(System.in);
//		int random = (int)(Math.random()*100+1);	//1~100
//		int count = 0;
//		while(count<10) {
//			System.out.printf("%d번째 시도입니다. 1~100까지의 숫자를 입력하시오.>> ", count+1);
//			int input = scanner.nextInt();
//			if(input<random) {
//				System.out.println("입력한 수보다 큰수입니다.");
//			}else if(input>random) {
//				System.out.println("입력한 수보다 작은수입니다.");
//			}else {
//				System.out.printf("%d 정답입니다.",random);
//				break;
//			}
//			count++;
//		}
//		System.out.println("랜덤숫자 정답 : "+random);
//		scanner.close();
		
		//for로 구현
//		Scanner scanner = new Scanner(System.in);
//		int random = (int)(Math.random()*100+1);	//1~100
//		for(int i=0;i<10;i++) {
//			System.out.printf("%d번째 시도입니다. 1~100까지의 숫자를 입력하시오.>> ", i+1);
//			int input = scanner.nextInt();
//			if(input<random) {
//				System.out.println("입력한 수보다 큰수입니다.");
//			}else if(input>random) {
//				System.out.println("입력한 수보다 작은수입니다.");
//			}else {
//				System.out.printf("정답입니다.");
//				break;
//			}
//		}
//		System.out.println("랜덤숫자 정답 : "+random);
//		scanner.close();
		
		//조건문 - if, switch
		//반복문 - for, while
//		int i = 1;
//		while(i<10) {
//			System.out.println(i);
//			i++;
//			break;
//		}
		
		//1번은 무조건 실행해야 할 때
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//			break;
//		}while(i<10);
//		
		//반복문에 이름달기
//		loop:while(true) {
//			while(i<10) {
//				if(i==0) {
//					break loop;	//이름달린 반복문을 빠져나옴.(가장 바깥 등)
//				}
//			}
//		}
		
		//반복문에 이름달기
//		loop:for(int i=0;i<10;i++) {
//			if(i==0) {
//				break loop;	//이름달린 반복문을 빠져나옴.(가장 바깥 등)
//			}
//		}
		
//		int i=0;
//		int sum=0;
//		while(true) {
//			if(sum>100) {
//				break;
//			}
//			sum+=i;
//			i++;
//		}
//		System.out.println("i-1의 값 : "+(i-1));
//		System.out.printf("%d-1의 sum의 값 : %d \n",i,sum-i);
//		System.out.println("i의 값 : "+i);
//		System.out.println("sum의 값 : "+sum);
//		//무한반복
//		for(;;) {
//			break;
//		}
		
//		int i = 10;
//		String name="홍길동";
//		double avg = 99.67;
//		//"번호:10 , 이름:홍길동, 평균:99.67"
//		System.out.printf("번호:%d, 이름:%s, 평균:%.2f",i,name,avg);
		
//		int num = 100;
//		System.out.printf("%10d \n",num);
//		System.out.printf("%010d \n",num);
		
		String num = "100";
		int num1 = 100;
		String a = String.format("%10s", num);
		String a1 = String.format("%10d", num1);
		System.out.println(a);
		System.out.println(a1);
		int no = 10;
		String name = "홍길동";
		String a2 = String.format("번호:%d 이름:%s 국어:%d", no, name, num1);
		System.out.println(a2);
	}

}
