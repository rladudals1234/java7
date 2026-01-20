package j0120_01;

import java.util.Arrays;
import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		// 1부터 45까지의 랜덤번호를 출력하시오.
		// (int)(Math.random()*45)+1;
		int[] random = new int[45];
		for (int i = 0; i < random.length; i++) {
			random[i] = i+1;
		}
		System.out.println(Arrays.toString(random));
		for(int i=0;i<300;i++) {		//최대값(i<300 : 섞는 횟수만 높아짐)은 상관없고 기존 값에서 다른곳에 있는 값을 교체만 되서 중복X
			int no = (int)(Math.random()*45);
			int temp = random[0];	//임시저장
			random[0] = random[no];	//교체
			random[no] = temp;		//0번째랑 교체한 자리에 중복되지 않게 임시저장한 값을 넣기
			//System.out.println(i+"번째: "+Arrays.toString(random));
		}
		System.out.println(Arrays.toString(random));
		
		//앞 6개만 출력하시오.
		for(int i=0; i<6; i++) {
			System.out.print(random[i]+" ");
		}
		System.out.println();
		
		//번호6개를 입력받아 출력하시오.
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[6];
//		for(int i=0; i<6; i++) {	//1~45번 아닌 번호를 입력했을때 다시 입력
//			System.out.print("번호를 입력하세요.>> ");
//			input[i] = scanner.nextInt();
//			if(input[i]<1 || input[i]>45) {
//				System.out.println("1~45번 번호를 입력해주세요.");
//				i--;
//			}
//		}
		//다른방식
		for(int i=0; i<6; i++) {	//1~45번 아닌 번호를 입력했을때 다시 입력
			System.out.printf("%d번째 번호를 입력하세요.>> ",i+1);
			input[i] = scanner.nextInt();
			if(input[i]<=0 || input[i]>=46) {
				System.out.printf("입력번호 : %d, 번호를 잘못 입력하셨습니다.",input[i]);
				i-=1;
				continue;
			}
		}
		System.out.println(Arrays.toString(input));
		scanner.close();
	}

}
