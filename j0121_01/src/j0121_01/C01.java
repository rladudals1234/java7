package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// [ 1-45까지 로또 프로그램 구현 ]
		// 1. 순차번호 넣기
		int[] num = new int[45];	//1-45까지 번호저장
		int[] random = new int[6];	//당첨로또번호6개
		int[] input = new int[6];	//입력번호 6개 저장
		int[] lotto = new int[6];	//맞춘 로또번호
		int count = 0;				//맞춘개수
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<num.length;i++) {
			num[i] = i+1;
		}
		System.out.println(Arrays.toString(num));
		// 2. 번호섞기
		for(int i=0;i<300;i++) {
			int no = (int)(Math.random()*45);
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		System.out.println(Arrays.toString(num));
		// 3. 6개 번호추출
		for(int i=0; i<random.length;i++) {
			random[i] = num[i];
		}
		// 6개의 숫자를 입력하시오.
		for(int i=0; i<input.length;i++) {
			System.out.printf("%d번째 1-45까지 번호를 입력하세요.>> ",i);
			input[i] = scanner.nextInt();
		}
		// 5. 입력번호 확인
		for(int i=0;i<random.length;i++) {
			for(int j=0;j<input.length;j++) {
				if(random[i]==input[j]) {
					lotto[count] = input[j];
					count++;
					break;
				}
			}
		}
		//확인
		System.out.println("로또당첨번호 : "+Arrays.toString(random));
		System.out.println("로또입력번호 : "+Arrays.toString(input));
		if(count>0) {
			System.out.print("맞춘 로또번호 : ");
			for(int i=0;i<count;i++) {			
				System.out.printf("%d ",lotto[i]);
			}
			System.out.println();
		}
		System.out.printf("맞춘 로또번호 개수 : %d",count);
		scanner.close();
	}

}
