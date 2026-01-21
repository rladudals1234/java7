package j0121_01;

import java.util.Arrays;

public class C03 {

	public static void main(String[] args) {
		// 다차원 배열 - 2차원 배열
		//int[][] score = new int[5][3];
//		int[][] score = {
//				{100,100,100},
//				{90,90,90},
//				{80,80,80},
//				{70,70,70},
//				{60,60,60}
//		};
//		//System.out.println(Arrays.toString(score[0]));
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {				
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		// 2차원 [5][5] 1~25까지
//		int[][] aa = {
//				{1,2,3,4,5},
//				{6,7,8,9,10},
//				{11,12,13,14,15},
//				{16,17,18,19,20},
//				{21,22,23,24,25}
//		};
		//for문으로 출력
//		for(int i=0;i<aa.length;i++) {
//			for(int j=0;j<aa[i].length;j++) {				
//				System.out.print(aa[i][j]+"\t");
//			}
//			System.out.println();
//		}
		//3행 2열, 5행 1열, 2행 4열, 5행 5열 출력
		
		
		// 2차원 [5][5] 1~25까지 자동입력 및 출력 (랜덤 추가)
		int[][] aa = new int[5][5];
		int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};	//랜덤 돌리기 용
		for(int i=0;i<200;i++) {
			int no = (int)(Math.random()*25);
			int temp = num[0];
			num[0] = num[no];
			num[no] = temp;
		}
		//for문으로 입력
		// 1. 번호넣기
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				aa[i][j] = num[(i*5)+j];
				//aa[i][j] = (i*5)+(j+1);
			}
		}
		//for문으로 출력
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {				
				System.out.print(aa[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
