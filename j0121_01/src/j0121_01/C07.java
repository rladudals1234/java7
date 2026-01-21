package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C07 {

	public static void main(String[] args) {
		// 1-100번 사이의 랜덤번호를 생성해서
		// 10번의 기회에 번호를 맞추는 프로그램을 구현하시오.
		// 정답을 맞추면 프로그램을 종료하고
		// 입력한 번호 : 50 30 40 43 45
		// 도전횟수 : 5
		// 정답번호 : 45
		// 프로그램으로 구현하시오.
//		int[] num = new int[100];
//		
//		for(int i=0;i<num.length;i++) {
//			num[i] = i+1;
//		}
//		System.out.println(Arrays.toString(num));
//		for(int i=0;i<200;i++) {
//			int no = (int)(Math.random()*100);
//			int temp = num[0];
//			num[0] = num[no];
//			num[no] = temp;
//		}
		
		Scanner scanner = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		int[] input = new int[10];
		int count = 0;
		for(int i=0;i<10;i++) {
			System.out.print("숫자를 입력하세요.>> ");
			input[i] = scanner.nextInt();
			count++;
			if(num==input[i]) {
				break;
			}
		}
		System.out.println("입력한 번호 : "+Arrays.toString(input));
		System.out.println("도전횟수 : "+count);
		System.out.println("정답번호 : "+num);
		scanner.close();
	}

}
