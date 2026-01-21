package j0121_01;

import java.util.Scanner;

public class C10 {

	public static void main(String[] args) {
		//학생성적 프로그램을 구현하시오.
		//변수선언
		int[][] score = new int[5][4];
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = new int[5];
		String[] name = new String[5];
		int count = 0;
		int total = 0;
		double[] avg = new double[5];
		//화면출력
		Scanner scanner = new Scanner(System.in);
		loop:while(true) {
			System.out.println();
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 학생성적입력");
			System.out.println("2. 학생성적출력");
			System.out.println("3. 학생성적수정");
			System.out.println("4. 학생성적삭제");
			System.out.println("0. 종료");
			System.out.print("번호를 입력하세요.>> ");
			int choice = scanner.nextInt();
			switch (choice) {
				case 1:
					total = 0;
					no[count] = count+1;
					System.out.printf("%d번째 학생이름입력하세요.>> ",count+1);
					name[count] = scanner.next();
					for(int i=0;i<3;i++) {
						System.out.printf("%s점수를 입력하세요.>> ", title[i+2]);
						score[count][i] = scanner.nextInt();
						total += score[count][i];
					}
					score[count][3] = total;
					avg[count] = total/(double)3;
					count++;
					break;
				case 2:
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t", title[i]);
					}
					System.out.println();
					for(int i=0;i<count;i++) {
						System.out.printf("%d\t",no[i]);
						System.out.printf("%s\t",name[i]);
						for(int j=0;j<4;j++) {
							System.out.printf("%d\t",score[i][j]);
						}
						System.out.printf("%.2f\n",avg[i]);
					}
					break;
				case 3:
					break;
				case 4:
					break;
				default:
					System.out.println("프로그램을 종료합니다.");
					scanner.close();
					break loop;
			}
		}
		//성적입력
		//성적출력
	}

}
