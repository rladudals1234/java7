package j0123_01;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stuscore[] s = new Stuscore[10];
		int kor = 0,eng=0,math=0;
		String name="";
		int choice=0;
		//String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
		int temp=0;
		//int scount = 0;
		loop:while(true) {
			System.out.println("[ 학생성적프로그램 ]");
			System.out.println("1.학생성적입력");		
			System.out.println("2.학생성적출력");
			System.out.println("3.학생성적수정");
			System.out.println("4.학생검색");
			System.out.println("0.종료");
			System.out.println("----------------------------------------");		
			System.out.println("원하는 번호를 입력하세요.>> ");
			choice = scanner.nextInt();
			switch(choice) {
				case 1:
					while(true) {
						System.out.print("이름을 입력하세요.(0.이전페이지 이동)>> ");
						name = scanner.next();
						if(name.equals("0")) {
							break;		//반복문 종료
						}
						System.out.print("국어점수를 입력하세요.>> ");
						kor = scanner.nextInt();
						System.out.print("영어점수를 입력하세요.>> ");
						eng = scanner.nextInt();
						System.out.print("수학점수를 입력하세요.>> ");
						math = scanner.nextInt();
						s[Stuscore.count] = new Stuscore(name,kor,eng,math);
					}
					break;
				case 2:
					System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n","번호","이름","국어","영어","수학","합계","평균");
					for(int i=0;i<Stuscore.count;i++) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",s[i].no,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
					}
					break;
				case 3:
					temp=0;
					System.out.print("점수를 수정할 학생의 이름을 입력하세요.(0.이전페이지 이동)>> ");
					name = scanner.next();
					if(name.equals("0")) {
						break;		//반복문 종료
					}
					for(int i=0;i<Stuscore.count;i++) {
						if(name.equals(s[i].name)) {
							temp = 1;
							System.out.println("1.국어점수 수정");
							System.out.println("2.영어점수 수정");
							System.out.println("3.수학점수 수정");
							choice = scanner.nextInt();
							
							//System.out.printf("%s점수를 입력하세요.>> ",title[choice+2]);
							switch(choice) {
								case 1:
									System.out.print("국어점수를 입력하세요.>> ");
									kor = scanner.nextInt();
									s[i].kor = kor;
									break;
								case 2:
									System.out.print("영어점수를 입력하세요.>> ");
									eng = scanner.nextInt();
									s[i].eng = eng;
									break;
								case 3:
									System.out.print("수학점수를 입력하세요.>> ");
									math = scanner.nextInt();
									s[i].math = math;
									break;
							}
							s[i].total = s[i].kor+s[i].eng+s[i].math;
							s[i].avg = s[i].total/(double)3.0;
						}
					}
					if(temp==0) {
						System.out.print("점수를 수정할 학생이 없습니다.\n");
					}
					break;
				case 4:
					temp=0;
					System.out.print("검색할 학생의 이름을 입력하세요.>> ");
					name = scanner.next();
					System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n","번호","이름","국어","영어","수학","합계","평균");
					for(int i=0;i<Stuscore.count;i++) {
						if(s[i].name.contains(name)) {
							temp = 1;
							System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",s[i].no,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
						}
					}
					if(temp==0) {
						System.out.print("검색결과가 없습니다.\n");
					}
					break;
				default:
					scanner.close();
					break loop;
			}
		}
		System.out.println("[ 프로그램을 종료합니다. ]");
	}

}
