package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C06 {

	public static void main(String[] args) {
		int[] num = new int[45];
		int[] random = new int[6];
		int[] input = new int[6];
		int[] lotto = new int[6];
		int count = 0;
		// 1-45 사이의 랜덤숫자 6개를 입력 후 출력하시오.		
		// 1. 순차번호 넣기
		for(int i=0;i<45;i++) {
			num[i] = i+1;
		}
		System.out.println(Arrays.toString(num));
		// 2. 번호섞기
		for(int i=0;i<200;i++) {
			int no = (int)(Math.random()*45);	//0~44
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		System.out.println(Arrays.toString(num));
		// 3. 6개 추출
		for(int i=0;i<6;i++) {
			random[i] = num[i];
		}
		// 6개의 숫자를 입력하시오.
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째, 1-45까지의 숫자를 입력하시오.>> ",i+1);
			input[i] = scanner.nextInt();
		}
		// 번호확인입력
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(input[i]==random[j]) {
					lotto[i] = input[i];
					count++;
				}
			}
		}
		// 모두 출력
		System.out.println("로또숫자 : "+Arrays.toString(random));
		System.out.println("입력한 로또숫자 : "+Arrays.toString(input));
		System.out.printf("맞힌 로또숫자 : ");
		for(int i=0;i<=count;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.printf("맞힌 숫자의 개수는 %d개입니다.",count);
		scanner.close();
	}

}
