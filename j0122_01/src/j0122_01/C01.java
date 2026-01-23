package j0122_01;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 변수선언
		String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int[] no = new int[10];
		String[] name = new String[10];
		int[][] score = new int[10][4];
		double[] avg = new double[10];
		int total = 0, count = 0, temp = 0;
		String search = "";
		int choice = 0;
		
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("3. 성적수정");
			System.out.println("4. 성적검색");
			System.out.println("0. 종료");
			System.out.println("----------------------");
			System.out.print("원하는 번호를 입력하세요.>> ");
			choice = scanner.nextInt();
			temp = 0;
			search = "";
			switch(choice) {
				case 1:
					while(true) {
						total = 0;
						System.out.println("[ 성적입력 ]");
						System.out.printf("%d번째 학생이름을 입력하세요.(0.이전페이지 이동)>> ",count+1);
						name[count] = scanner.next();	//count때문에 저장되어도 출력으로 보여지지 않음
						if(name[count].equals("0")) {
							System.out.println(">> 이전페이지로 이동합니다.");
							System.out.println();
							break;
						}
						no[count] = count+1;
						for(int i=0;i<3;i++) {
							//국어,영어,수학
							System.out.printf("%s점수를 입력하세요.>> ",title[i+2]);
							score[count][i] = scanner.nextInt();
							total += score[count][i];
						}
						score[count][3] = total;
						avg[count] = total/(double)3;
						System.out.printf("%s 학생성적이 저장되었습니다.\n",name[count]);
						System.out.println();
						count++;
					}
					break;
				case 2:
					System.out.println("[ 성적출력 ]");
					System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
					System.out.println("-------------------------------------------------------------------");
					for(int i=0;i<count;i++) {
						System.out.printf("%d\t",no[i]);		//번호
						System.out.printf("%s\t",name[i]);		//이름
						for(int j=0;j<score[i].length;j++) {	//국,영,수
							System.out.printf("%d\t",score[i][j]);	//[0.0][0,1][0,2][0,3]
						}
						System.out.printf("%.2f\n",avg[i]);		//평균
					}
					break;
				case 3:
					System.out.println("[ 성적수정 ]");
					// 수정학생이름 검색
					System.out.printf("수정하려는 학생이름을 입력하세요.>> ");
					search = scanner.next();
					for(int i=0;i<=count;i++) {		//반복문으로 확인
						if(name[i].equals(search)) {	//학생이름 검색
							System.out.printf("[ %s 학생 성적수정 ]\n",search);
							for(int j=0;j<3;j++) {
								System.out.printf("%d. %s점수 수정 \n",j+1,title[j+2]);
							}
							System.out.println("-------------------------------------------------------------------");
							System.out.println("수정하려는 과목번호를 입력하세요.>> ");
							choice = scanner.nextInt();
							System.out.println();
							System.out.printf("[ %s점수 수정 ]\n",title[choice+1]);
							System.out.printf("현재%s점수 : %d \n",title[choice+1],score[i][choice-1]);
							System.out.printf("변경%s점수를 입력하세요.>> ",title[choice+1]);
							score[i][choice-1] = scanner.nextInt();
							score[i][3] = score[i][0] + score[i][1] + score[i][2];
							avg[i] = score[i][3]/(double)3;
							temp = 1;
							System.out.printf("%s학생 %s점수가 %d점으로 수정되었습니다.\n",search,title[choice+1],score[i][choice-1]);
						}
					}
					if(temp==0) {
						System.out.printf("수정하려는 %s학생을 찾지 못했습니다!",search);
						System.out.println();
					}
					break;
				case 4:
					System.out.println("[ 성적검색 ]");
					// 학생이름 검색
					System.out.printf("검색하려는 학생이름을 입력하세요.>> ");
					search = scanner.next();
					System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n",title[0],title[1],title[2],title[3],title[4],title[5],title[6]);
					System.out.println("-------------------------------------------------------------------");
					for(int i=0;i<=count;i++) {
						if(name[i].contains(search)) {
							temp = 1;
							System.out.printf("%d\t",no[i]);		//번호
							System.out.printf("%s\t",name[i]);		//이름
							for(int j=0;j<score[i].length;j++) {	//국,영,수
								System.out.printf("%d\t",score[i][j]);	//[0.0][0,1][0,2][0,3]
							}
							System.out.printf("%.2f\n",avg[i]);		//평균
						}
					}
					if(temp==0) {
						System.out.printf("%s 학생이 검색되지 않았습니다!",search);
						System.out.println();
					}
					break;
				default:
					System.out.println("[ 프로그램 종료 ]");
					scanner.close();
					break loop;
			}//switch
		}//while
	}//main

}//class
