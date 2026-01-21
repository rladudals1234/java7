package j0121_01;

import java.util.Scanner;

public class C04 {

	public static void main(String[] args) {
		//1차원배열 - 랜덤으로 숫자 입력,출력
//		int[] a = new int[3];
//		//int[] a = {1,2,3};
//		for(int i=0;i<a.length;i++) {
//			a[i] = i+1;
//		}
//		
//		for(int i=0;i<200;i++) {
//			int no = (int)(Math.random()*25);
//			int temp = a[0];
//			a[0] = a[no];
//			a[no] = temp;
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+"\t");
//		}
		
		//2차원 배열
//		int[][] score = new int[5][5];	//25개 5,5 2차원 배열
//		/*int[][] score = {
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//				{0,0,0,0,0},
//				{0,0,0,0,0}
//		};*/
//		int[] a = new int[25];
//		//1차원 입력
//		for(int i=0;i<a.length;i++) {
//			a[i] = i+1;
//		}
//		//랜덤섞기
//		for(int i=0;i<200;i++) {
//			int no = (int)(Math.random()*25);
//			int temp = a[0];
//			a[0] = a[no];
//			a[no] = temp;
//		}
//		// 2차원 입력
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				score[i][j] = a[(i*5)+j];		//0,1,2,...,24
//				//score[i][j] = (i*5)+(j+1);	//1,2,3,...,25
//			}
//		}
//		// 2차원 출력
//		for(int i=0;i<score.length;i++) {
//			for(int j=0;j<score[i].length;j++) {
//				System.out.print(score[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		// 학생성적프로그램 - 이름,국어,영어,수학,합계
		Scanner scanner = new Scanner(System.in);
		String[] name = new String[2];
		int[][] score = new int[2][4];
		double[] avg = new double[2];
		String[] title = {"이름","국어","영어","수학","합계","평균"};
		// 1. 성적입력
		int i = 0;
		while(i<2) {
			System.out.print("이름을 입력하세요.>> ");
			name[i] = scanner.next();
			int total = 0;
			for(int j=0;j<3;j++) {
				System.out.printf("%s점수를 입력하세요.>> ",title[j+1]);
				score[i][j] = scanner.nextInt();
				total += score[i][j];
				avg[i] = total/(double)3;
			}
			score[i][3] = total;
			i++;
		}
		// 2. 성적출력
		System.out.println("		[ 학생성적 프로그램 ]");
		System.out.println("------------------------------------------------");
		for(int j=0;j<title.length;j++) {
			System.out.print(title[j]+"\t");
		}
		System.out.println();
		System.out.println("------------------------------------------------");
		for(int j=0;j<score.length;j++) {
			System.out.print(name[j]+"\t");
			for(int k=0;k<score[j].length;k++) {
				System.out.print(score[j][k]+"\t");
			}
			//평균
			System.out.printf("%.2f",avg[j]);
			System.out.println();
		}
		scanner.close();
	}

}
