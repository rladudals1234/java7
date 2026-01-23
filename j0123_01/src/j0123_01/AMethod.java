package j0123_01;

import java.util.Scanner;

public class AMethod {
	void input(int[] num) {
		Scanner scanner = new Scanner(System.in);
		//3개의 input을 받아, num에 저장해서 출력하시오.
		for(int i=0;i<num.length;i++) {
			System.out.print("숫자를 입력하세요.>> ");
			num[i] = scanner.nextInt();
		}
		scanner.close();
	}
}
