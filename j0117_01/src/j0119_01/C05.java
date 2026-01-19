package j0119_01;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요.>> ");
//		int input = scanner.nextInt();
		
//		if(input>=60) {
//			System.out.println("합격입니다.");
//		}else {
//			System.out.println("불합격입니다.");
//		}
		
		//양수, 0, 음수 if else if else
//		if(input>0) {
//			System.out.println("양수입니다.");
//		}else if(input==0) {
//			System.out.println("0 입니다.");
//		}else {
//			System.out.println("음수입니다.");
//		}
		
		//수(90점이상),우(80점이상),미(70점이상),양(60점이상),가(60점미만)
//		if(input>=90) {
//			System.out.println("수");
//		}else if(input>=80) {
//			System.out.println("우");
//		}else if(input>=70) {
//			System.out.println("미");
//		}else if(input>=60) {
//			System.out.println("양");
//		}else {
//			System.out.println("가");
//		}
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		// 다섯개 숫자 입력해서 19854 -> 7이 몇개 있는지 출력하시오.
//		// 문자열 -> charAt()
//		System.out.print("다섯개 숫자를 입력해주세요.>> ");
//		String input = scanner.nextLine();
//		int ch1 = (int)input.charAt(0)-48;
//		int ch2 = (int)input.charAt(1)-48;
//		int ch3 = (int)input.charAt(2)-48;
//		int ch4 = (int)input.charAt(3)-48;
//		int ch5 = (int)input.charAt(4)-48;
//		int count = 0;
//		if(ch1==7) {
//			++count;
//		}
//		if(ch2==7) {
//			++count;
//		}
//		if(ch3==7) {
//			++count;
//		}
//		if(ch4==7) {
//			++count;
//		}
//		if(ch5==7) {
//			++count;
//		}
//		System.out.println("개수:"+count);
//		scanner.close();
		
//		Scanner scanner = new Scanner(System.in);
//		// 다섯개 숫자 입력해서 19854 -> 7이 몇개 있는지 출력하시오.
//		// 문자열 -> charAt()
//		System.out.print("다섯개 숫자를 입력해주세요.>> ");
//		String input = scanner.nextLine();
//		int cnt = 0;
//		for(int i=0; i<input.length(); i++) {
//			int ch = (int)input.charAt(i)-48;
//			if(ch==7) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
//		scanner.close();
		
		// 97이상 A+, 97-94 A 93 A-
		// 88이상 B+, 87-84 B 83 B-
		// 77이상 C+, 76-74 C 73 C-
		// 66이상 D+, 65-63 D 62 D-
		// 60미만 F
		// 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("점수를 입력해주세요.>> ");
//		int score = scanner.nextInt();
//		if(score>=97) {
//			System.out.println("A+");
//		}else if(score>=94) {
//			System.out.println("A");
//		}else if(score==93) {
//			System.out.println("A-");
//		}else if(score>=88) {
//			System.out.println("B+");
//		}else if(score>=84) {
//			System.out.println("B");
//		}else if(score==83) {
//			System.out.println("B-");
//		}else if(score>=77) {
//			System.out.println("C+");
//		}else if(score>=74) {
//			System.out.println("C");
//		}else if(score==73) {
//			System.out.println("C-");
//		}else if(score>=66) {
//			System.out.println("D+");
//		}else if(score>=63) {
//			System.out.println("D");
//		}else if(score==62) {
//			System.out.println("D-");
//		}else {
//			System.out.println("F");
//		}
		
//		if(score>=90) {
//			if(score>=98) {
//				System.out.println("A+");
//			}else if(score>=94) {
//				System.out.println("A");
//			}else {
//				System.out.println("A-");
//			}
//		}else if(score>=80) {
//			if(score>=88) {
//				System.out.println("B+");
//			}else if(score>=84) {
//				System.out.println("B");
//			}else {
//				System.out.println("B-");
//			}
//		}else if(score>=70) {
//			if(score>=77) {
//				System.out.println("C+");
//			}else if(score>=74) {
//				System.out.println("C");
//			}else {
//				System.out.println("C-");
//			}
//		}else if(score>=60) {
//			if(score>=66) {
//				System.out.println("D+");
//			}else if(score>=63) {
//				System.out.println("D");
//			}else {
//				System.out.println("D-");
//			}
//		}
//		scanner.close();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("음료선택을 하세요.");
		System.out.println("1.아메리카노");
		System.out.println("2.바닐라라떼");
		System.out.println("3.아이스티");
		System.out.println("원하는 번호를 선택하시오.>> ");
		switch(scanner.nextInt()) {
			case 1:	//무조건 == 함 
				System.out.println("아메리카노를 생산합니다.");
				//2분
				break;
			case 2:
				System.out.println("바닐라라떼를 생산합니다.");
				//3분
				break;
			case 3:
				System.out.println("아이스티를 생산합니다.");
				//1분40초
				break;
			default:
				System.out.println("없는 주문입니다.");
				break;
		}
		scanner.close();
	}

}
