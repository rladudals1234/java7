package j0130_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StuDeck3 {
	Scanner scan = new Scanner(System.in);
	ArrayList<Stuscore> list = new ArrayList<Stuscore>();
	int no,kor,eng,math,total;
	int[] score = new int[3];
	String name;
	int temp = 0;
	int choice;
	double avg;
	final String[] title = {"번호","이름","국어","영어","수학","합계","평균"};
	String filePath = "C:/down/aaa/stu.txt";
	
	StuDeck3() {}
	
	//00.화면출력
	void screen() {
		System.out.println("[ 학생성적프로그램 ]");
		System.out.println("1. 성적입력");
		System.out.println("2. 성적출력");
		System.out.println("3. 성적수정");
		System.out.println("4. 성적삭제");
		System.out.println("5. 성적검색");
		System.out.println("6. 성적정렬");
		System.out.println("7. 파일저장");
		System.out.println("8. 파일불러오기");
		System.out.println("0. 프로그램종료");
		System.out.println("---------------------------------");
		System.out.print("원하는 번호를 입력하세요.>>");
	}
	
	//1. 성적입력
	void stuInput() {
		System.out.print((Stuscore.count+1)+"번 학생이름을 입력하세요.>> (0.이전페이지 이동) ");
		name = scan.next();
		if(name.equals("0"))return;
		for(int i=0;i<3;i++) {
			System.out.printf("%s점수를 입력하세요.>> ",title[i+2]);
			score[i] = scan.nextInt();
		}
		list.add(new Stuscore(name,score[0],score[1],score[2]));
		System.out.println("학생성적이 추가되었습니다.");
		System.out.println();
	}
	
	//2. 성적출력
	void stuOutput() {
		titlePrint();
		Iterator<Stuscore> it = list.iterator();
		while(it.hasNext()) {
			Stuscore s = it.next();
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
		}
		System.out.println();
	}
	
	//3. 성적수정
	void stuUpdate() {
		temp = 0;
		System.out.print("수정할 학생이름을 입력하세요.>> (0.이전페이지 이동) ");
		name = scan.next();
		if(name.equals("0"))return;
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {
				temp=1;
				for(int j=0;j<3;j++) {
					System.out.printf("%d. %s점수 수정\n",(j+1),title[j+2]);
				}
				System.out.print("수정할 번호를 입력하세요.>>");
				choice = scan.nextInt();
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
				break;
			}
		}
		if(temp==0) {
			System.out.println("찾고자 하는 학생이 없습니다. 다시 입력하세요.");
			System.out.println();
		}
	}
	
	//4. 성적삭제
	void stuDelete() {
		temp=0;
		System.out.print("삭제하려는 학생이름을 입력하세요.>> (0.이전페이지 이동) ");
		name = scan.next();
		if(name.equals("0"))return;
		for(int i=0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {
				temp = 1;
				System.out.printf("%s학생을 찾았습니다. 삭제하시겠습니까?(1.예,2.아니오)>>",name);
				choice = scan.nextInt();
				if(choice == 1) {
					list.remove(i);
					System.out.printf("%s 학생성적이 삭제되었습니다.",name);
					System.out.println();
				}
				break;
			}
		}
		if(temp==0) {
			System.out.println("찾고자 하는 학생이 없습니다. 다시 입력해주세요.");
			System.out.println();
		}
	}
	
	//5. 성적검색
	void stuSearch() {
		temp = 0;	//검색확인 변수
		System.out.print("검색할 학생이름을 입력하세요.>> (0.이전페이지 이동) ");
		name = scan.next();
		if(name.equals("0"))return;
		titlePrint();
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
	
	//6. 성적정렬(번호만 다시 순서대로 - 현재 정렬기준으로 보여주진 않음)
	void stuNoSort() {
		for(int i=0;i<list.size();i++) {
			list.get(i).setNo(i+1);
		}
		Stuscore.count = list.size();
		System.out.println("번호 정렬되었습니다.");
		System.out.println();
	}
	
	//7. 파일저장
	void fileSave() {
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
			Iterator<Stuscore> it = list.iterator();
			while(it.hasNext()) {
				Stuscore s = it.next();
				String txt = String.format("%d,%s,%d,%d,%d,%d,%.2f\r\n", s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
				bw.write(txt);
			}
			bw.close();
			fw.close();
		} catch (Exception e) {e.printStackTrace();}
	}
	
	//8. 파일불러오기
	void fileOpen() {
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line==null)break;
				String[] st = line.split(",");
				//System.out.println(st[0]+"\t"+st[1]+"\t"+st[2]+"\t"+st[3]+"\t"+st[4]+"\t"+st[5]+"\t"+st[6]);
				list.add(new Stuscore(st[1],Integer.parseInt(st[2]),Integer.parseInt(st[3]),Integer.parseInt(st[4])));
			}
			br.close();
			fr.close();
		} catch (Exception e) {e.printStackTrace();}
		System.out.println("파일 불러오기 완료!");
	}
	
	//타이틀 출력
	void titlePrint() {
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
	}
}
