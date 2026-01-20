package j0120_01;

import java.util.*;

public class C05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] num = new int[45];
		int[] random = new int[6];
		int[] input = new int[6];
		int[] lotto = new int[6];
		int count = 0;
		// 1~45 사이의 랜덤숫자 6개를 입력후 출력하시오.
		// 1. 순차번호 넣기
		for(int i=0;i<num.length;i++) {
			num[i] = i+1;
		}
		// 2. 번호 섞기
		for(int i=0;i<200;i++) {
			int no = (int)(Math.random()*45);	//0~44
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		// 3. 6개 번호 추출
		for(int i=0;i<6;i++) {
			random[i] = num[i];
		}
		// 6개의 숫자를 입력하시오.
		for(int i=0;i<6;i++) {
			System.out.printf("%d번째, 1-45까지의 숫자를 입력하세요.>> ",i+1);
			input[i] = scanner.nextInt();
		}
		// 번호확인(로또번호 몇개 맞췄는지)
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(random[i]==input[j]) {						
					lotto[count] = input[j];	//맞춘개수 증가하니 로또번지로 활용
					count++;
					break;
				}
			}
		}
		String str = Arrays.toString(random);
		System.out.println("랜덤번호 : "+str);
		System.out.println("입력번호 : "+Arrays.toString(input));
//		System.out.println("맞춘번호 : "+Arrays.toString(lotto));
		System.out.print("맞춘번호 : ");
		for(int i=0;i<count;i++) {
			System.out.print(lotto[i]+", ");
		}
		System.out.println("맞춘번호 개수 : "+count);
		scanner.close();
	}

}
