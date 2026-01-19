package j0119_01;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		//1~10까지 랜덤숫자를 출력하시오.
		int random_num = (int)(Math.random()*10)+1;
		//1~100까지 랜덤숫자를 출력하시오.
		int random_num2 = (int)(Math.random()*100)+1;
		System.out.println(random_num);
		System.out.println(random_num2);
		
		//0~9
		int r_num = (int)(Math.random()*10);
		//0~99
		int r_num2 = (int)(Math.random()*100);
		//0~49
		int r_num3 = (int)(Math.random()*50);
		System.out.println(r_num);
		System.out.println(r_num2);
		System.out.println(r_num3);
		
		//0~9까지 랜덤숫자를 5개를 출력하시오.
		int r1 = (int)(Math.random()*10);
		int r2 = (int)(Math.random()*10);
		int r3 = (int)(Math.random()*10);
		int r4 = (int)(Math.random()*10);
		int r5 = (int)(Math.random()*10);
		System.out.printf("%d%d%d%d%d\n",r1,r2,r3,r4,r5);
		
		//1~45까지 랜덤숫자를 출력하시오.
		int ran_num1 = (int)(Math.random()*45)+1;
		//1~100까지 랜덤숫자를 출력하시오.
		int ran_num2 = (int)(Math.random()*100)+1;
		System.out.println(ran_num1);
		System.out.println(ran_num2);
		
		//랜덤숫자 소수점 15자리까지
		
//		for(int i=0; i<5; i++) {
//			System.out.println(i);
//		}
		
//		int sum=0;
//		for(int i=0; i<=10; i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		//1부터100까지의 홀수의 합을 구하시오.
//		int sum=0;
//		for(int i=1; i<=100; i++) {
//			if(i%2==1) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		//1부터100까지의 홀수의 합이 100을 넘는 시점의 i의 값과 sum을 출력하시오.
//		int sum=0;
//		for(int i=1; i<=100; i++) {
//			if(i%2==1) {
//				sum+=i;
//				if(sum>100) {
//					System.out.println("i의 값:"+i+", 합:"+sum);
//					break;
//				}
//			}
//		}
		
		
		//foreach
//		int[] test = new int[] {1,2,3,4,5,6,7,8,9,10};
//		for (int i : test) {
//			System.out.println(i);
//		}
		
		//0~9 랜덤숫자 5개를 생성해서 -> 14567 -> 7이 몇개 있는지 출력하시오.
//		System.out.print("랜덤숫자:");
//		String random_n = "";
//		int cnt = 0;
//		for(int i=0; i<5; i++) {
//			int num = (int)(Math.random()*10);
//			random_n+=num;
//			System.out.print(num);
//			if(num==7) {
//				++cnt;
//			}
//		}
//		System.out.println("\ncnt:"+cnt);
//		System.out.println(random_n);	//배열없이 문자열로 저장
		
		//숫자 5개를 입력받아, 7이 몇개 입력되었는지 출력하시오.
		//12347
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자 5개를 입력하세요.>> ");
//		String numb_str = scanner.nextLine();
//		int cnt2 = 0;
//		for(int i=0; i<numb_str.length(); i++) {
//			if(numb_str.charAt(i)=='7') {
//			//if((int)(numb_str.charAt(i)-48)==7) {
//				cnt2++;
//			}
//		}
//		System.out.println(cnt2);
//		scanner.close();
		
		//랜덤숫자 1개를 생성해서
		//입력받은 숫자 7개중에 랜덤숫자랑 똑같은 숫자가 몇개인지 출력하시오.
//		int random = (int)(Math.random()*10);
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자 5개를 입력하세요.>> ");
//		String num_str = scanner.nextLine();
//		int cnt=0;
//		for(int i=0; i<num_str.length(); i++) {
//			if((int)(num_str.charAt(i)-48)==random) {	//char의 '0'은 아스키 48 (char에서 int타입으로 변경이라 -)(char타입으로 변경한다면 '0'을+)
//				cnt++;
//			}
//		}
//		System.out.println("랜덤숫자 : "+random+", 입력숫자중 랜덤숫자와 같은수의 개수 : "+cnt);
//		scanner.close();
		
		//String num = "1234567";
		String num = "9789057899979971234567";
		
		// 입력받은 숫자에 7이 있는지 확인하시오.
		// charAt() : 문자열에서 해당위치값을 문자로 변환
		
		// indexOf()메소드 : 해당문자열이 있는 경우 위치값을 알려줌, 없으면 -1리턴
//		System.out.println(num.indexOf("7"));	//어느 위치에 7이 있는지 알려줌
		System.out.println(num.indexOf("7",15));	//7번째부터 위치찾기
		if(num.indexOf("7")==-1) {
			System.out.println("해당문자가 없습니다.");
		}else {
			System.out.println("문자위치:"+num.indexOf("7"));
		}
		//반복문, indexOf메소드를 이용하여 7이 몇개 사용되었는지 출력하시오.
		for(int i=0; i<num.length();i++) {
			
		}
		
		// contains : 해당문자열이 있는지 확인하는 메소드
		if(num.contains("7")) {
			System.out.println("7이 존재합니다.");
		}else {
			System.out.println("7이 존재하지 않습니다.");
		}
		
		
//		String aa = "TEST1234567890";
//		System.out.println(aa=="TEST1234567890");
//		System.out.println(aa.equals("TEST1234567890"));
	}

}
