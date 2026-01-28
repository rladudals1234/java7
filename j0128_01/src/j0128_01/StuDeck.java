package j0128_01;

import java.util.ArrayList;
import java.util.Scanner;

public class StuDeck {
	Scanner scan = new Scanner(System.in);
	ArrayList<Stuscore> list = new ArrayList<Stuscore>();
	int no,kor,eng,math,total;
	int[] score = new int[3];
	String name;
	double avg;
	
	StuDeck() {
		list.add(new Stuscore("홍길동",100,100,99));
		list.add(new Stuscore("유관순",90,90,95));
		list.add(new Stuscore("이순신",80,80,81));
	}
	
	final String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	
	// 상단메뉴출력
	void screen_print() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 성적검색");
		System.out.println("0. 프로그램종료");
		System.out.println("---------------------------------");
		System.out.print("원하는 번호를 입력하세요.>>");
	}
	
	//학생성적입력
	void stuInput() {
		System.out.printf("%d번 학생이름을 입력하세요.(0.이전페이지 이동)>> ",(Stuscore.count+1));
		name = scan.next();
		if(name.equals("0")) {
			return;
		}
		/*System.out.printf("국어점수를 입력하세요.>> ",title[2]);
		kor = scan.nextInt();
		System.out.printf("영어점수를 입력하세요.>> ",title[2]);
		eng = scan.nextInt();
		System.out.printf("수학점수를 입력하세요.>> ",title[2]);
		math = scan.nextInt();
		list.add(new Stuscore(name,kor,eng,math));*/
		
		for(int i=0;i<3;i++) {
			System.out.printf("%s점수를 입력하세요.>> ",title[i+2]);
			score[i] = scan.nextInt();
		}
		list.add(new Stuscore(name,score[0],score[1],score[2]));
		System.out.println("학생성적이 추가되었습니다.");
		System.out.println();
	}
	
	void stuOutput() {
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		for(int i=0;i<list.size();i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg());
		}
		System.out.println();
	}
	
	void stuUpdate() {
		int temp = 0;	//검색확인 변수
		System.out.print("수정할 학생이름을 입력하세요.>> ");
		name = scan.next();
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {
				temp=1;
				for(int j=0;j<3;j++) {
					System.out.printf("%d. %s점수 수정\n",(j+1),title[j+2]);
				}
				System.out.print("수정할 번호를 입력하세요.>>");
				int choice = scan.nextInt();
				System.out.printf("%s점수를 입력하세요.>> ",title[choice+1]);
				switch (choice) {
					case 1:
						kor = scan.nextInt();
						list.get(i).setKor(kor);
						break;
					case 2:
						eng = scan.nextInt();
						list.get(i).setEng(eng);
						break;
					case 3:
						math = scan.nextInt();
						list.get(i).setMath(math);
						break;
					default:
						break;
				}
				System.out.printf("%s학생의 %s성적이 수정되었습니다.",name,title[choice+1]);
			}
		}
		if(temp==0) {
			System.out.println("수정하려는 학생이 없습니다. 다시 입력하세요.!");
			System.out.println();
		}
	}
	
	void stuDelete() {
		int temp = 0;	//검색확인 변수
		System.out.print("삭제할 학생이름을 입력하세요.>> ");
		name = scan.next();
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {
				System.out.printf("%s학생을 찾았습니다. 삭제하시겠습니까?(1.삭제,0.취소)>>",name);
				temp=1;
				int choice = scan.nextInt();
				if(choice == 1) {
					list.remove(i);
					System.out.printf("%s학생이 삭제되었습니다.",name);
				}else {
					System.out.println("삭제를 취소하셨습니다.");
					System.out.println();
				}
			}
		}
		if(temp==0) {
			System.out.println("삭제하려는 학생이 없습니다. 다시 입력하세요.!");
			System.out.println();
		}
	}
	
	void stuSearch() {
		int temp = 0;	//검색확인 변수
		System.out.print("수정할 학생이름을 입력하세요.>> ");
		name = scan.next();
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().contains(name)) {
				temp=1;
				System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",list.get(i).getNo(),list.get(i).getName(),list.get(i).getKor(),list.get(i).getEng(),list.get(i).getMath(),list.get(i).getTotal(),list.get(i).getAvg());
				System.out.println();
			}
		}
		if(temp==0) {
			System.out.println("검색하려는 학생이 없습니다.");
			System.out.println();
		}
	}
}
