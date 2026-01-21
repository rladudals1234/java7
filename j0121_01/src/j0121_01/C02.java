package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		// 숫자타입 -> 문자열 타입
//		System.out.println(""+7+7.7);	//문자열타입으로 변경
//		
//		//문자열타입 -> int타입으로 변경
//		int a = Integer.parseInt("77");
//		double b = Double.parseDouble("77.77");
//		
//		//문자(char)숫자타입 -> int타입으로 변경
//		System.out.println('9'-'0');	// int 9
//		
//		//int타입 -> char타입으로 변경
//		System.out.println((char)(9+'0'));	//char타입 9
//		
//		//int타입 -> 문자열타입
//		String aa = Integer.toString(77);
//		Integer tt = 15;
//		String aa1 = tt.toString();
//		System.out.println(aa);
//		System.out.println(aa1);
		
//		String[] binary = {
//				"0000","0001","0010","0011",
//				"0100","0101","0110","0111",
//				"1000","1001","1010","1011",
//				"1100","1101","1110","1111"
//		};
		
		// 1987 -> 0001 1001 1000 0111
//		Scanner	scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.>> ");
//		String input = scanner.next();
//		for(int i=0; i<input.length(); i++) {
//			int no = (int) input.charAt(i)-'0';
//			System.out.print(binary[no]+" ");
//		}
//		scanner.close();
		
		// 숫자1개를 입력받아 2진수를 출력하시오.
//		Scanner	scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하시오.>> ");
//		System.out.println(binary[scanner.nextInt()]);
//		scanner.close();

		//test
//		String c = "123";
//		int tt1 = (int)c.charAt(0)-'0';
//		System.out.println(tt1);
//		System.out.println(binary[tt1]);
		
		// 퀴즈 - 1조123456
		// 6 - 500원
		// 56 - 1000원
		// 456 - 10000원
		// 3456 - 70000원
		// 23456 - 1000000원
		// 123456 - 10000000원
		
		// 6자리를 랜덤으로 복권번호 생성
		// 0 - 999999 랜덤번호 생성해서 출력하시오.
		int random = (int)(Math.random()*1000000);
		String lotto = String.format("%06d", random);
		System.out.println(lotto);
		
		// 프로그램을 구현하시오.
		// 입력번호(000005)와 끝번호가 맞는지 확인해서 맞춤,틀림 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.>> ");
//		String input = scanner.next();
//		char inLastNo = input.charAt(5);
//		char loLastNo = lotto.charAt(5);
//		String result = inLastNo==loLastNo?"맞춤":"틀림";
//		System.out.println(result);
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.>> ");
		String input = scanner.next();
		//번호가 포함되는 경우
//		int count = 0;
//		int[] lottoIn = new int[6];	// 맞춘 복권번호 
//		for(int i=0; i<lotto.length(); i++) {
//			for(int j=0; j<input.length(); j++) {
//				if(lotto.charAt(i)==input.charAt(j)) {
//					lottoIn[count] = (int)lotto.charAt(i)-'0';
//					count++;
//					break;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(lottoIn));
//		System.out.println("맞춘 개수 : "+count);
//		//금액
//		switch(count) {
//			case 6:
//				System.out.println("10000000원");
//				break;
//			case 5:
//				System.out.println("1000000원");
//				break;
//			case 4:
//				System.out.println("70000원");
//				break;
//			case 3:
//				System.out.println("10000원");
//				break;
//			case 2:
//				System.out.println("1000원");
//				break;
//			case 1:
//				System.out.println("500원");
//				break;
//			default:
//				System.out.println("0원");
//		}
		
		//번호가 포함된게 아닌 각 자리수에 값을 맞춰야 하는 경우(랜덤숫자 각 자리 번호가 중복가능해서 이 방식)
		int count = 0;
		int[] lottoIn = new int[6];	// 맞춘 복권번호 
		for(int i=0; i<lotto.length(); i++) {
			if(lotto.charAt(i)==input.charAt(i)) {
				lottoIn[i] = (int)lotto.charAt(i)-'0';
				count++;
			}
		}
		System.out.println(Arrays.toString(lottoIn));
		System.out.println("맞춘 개수 : "+count);
		//금액
		switch(count) {
			case 6:
				System.out.println("10000000원");
				break;
			case 5:
				System.out.println("1000000원");
				break;
			case 4:
				System.out.println("70000원");
				break;
			case 3:
				System.out.println("10000원");
				break;
			case 2:
				System.out.println("1000원");
				break;
			case 1:
				System.out.println("500원");
				break;
			default:
				System.out.println("0원");
		}
		scanner.close();
	}

}
