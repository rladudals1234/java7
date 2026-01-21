package j0121_01;

import java.util.Arrays;
import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		// 1-45번 사이의 랜덤숫자 6개를 추출해서
		// 입력받은 6개 숫자와 몇개 맞는지 출력하시오.
		// 로또번호 : 
		// 입력번호 : 
		// 당첨번호 : 
		// 당첨개수 : 
		int[] num = new int[45];	//1-45까지 번호저장
		int[] random = new int[6];	//로또번호6개
		int[] input = new int[6];	//입력번호 6개 저장
		int[] lotto = new int[6];	//맞춘 로또번호
		int count = 0;				//당첨개수
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<num.length;i++) {
			num[i] = i+1;
		}
		
		for(int i=0;i<300;i++) {
			int no = (int)(Math.random()*45);
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		
		for(int i=0; i<random.length;i++) {
			random[i] = num[i];
		}
		
		System.out.println(Arrays.toString(num));
		
		for(int i=0; i<input.length;i++) {
			System.out.printf("%d번째 1-45까지 번호를 입력하시오.>> ",i);
			input[i] = scanner.nextInt();
		}
		
		for(int i=0; i<input.length;i++) {
			for(int j=0; j<random.length;j++) {
				if(input[i]==random[j]) {
					lotto[count] = input[i];
					count++;
				}
			}
		}
		System.out.println("로또번호 : "+Arrays.toString(random));
		System.out.println("입력번호 : "+Arrays.toString(input));
		System.out.print("당첨번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		System.out.println("당첨개수 : "+count);
		scanner.close();
	}

}
