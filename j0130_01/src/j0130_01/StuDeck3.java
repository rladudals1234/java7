package j0130_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Comparator;
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
		System.out.println("7. 번호재정렬");
		System.out.println("8. 파일불러오기");
		System.out.println("9. 파일저장");
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
				Stuscore s = list.get(i);
				temp=1;
				for(int j=0;j<3;j++) {
					System.out.printf("%d. %s점수 수정\n",(j+1),title[j+2]);
				}
				System.out.printf("%d. 수정취소\n",0);
				System.out.print("수정할 번호를 입력하세요.>> (0.이전페이지 이동) ");
				choice = scan.nextInt();
				if(choice==0)return;
				System.out.printf("%s점수를 입력하세요.>> ",title[choice+1]);
				int score = scan.nextInt();
				switch (choice) {
					case 1:
						s.setKor(score);
						break;
					case 2:
						s.setEng(score);
						break;
					case 3:
						s.setMath(score);
						break;
				}
				System.out.printf("%s학생의 %s성적이 %d점으로 수정되었습니다.",name,title[choice+1],score);
				System.out.println();
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
		System.out.println("[ 학생검색 ]");
		System.out.println("1. 이름검색");
		System.out.println("2. 점수검색");
		System.out.println("----------------------------------------------");
		System.out.print("원하는 번호를 입력하세요.>> (0.이전페이지 이동) ");
		choice = scan.nextInt();
		switch(choice) {
			case 1:
				System.out.print("검색할 학생이름을 입력하세요.>> (0.이전페이지 이동) ");
				name = scan.next();
				if(name.equals("0"))return;
				titlePrint();
				//ArrayList<Stuscore> slist = new ArrayList<Stuscore>(list);		//매개변수로 넘기는 방식(오버로딩으로 추가)
				for(int i=0;i<list.size();i++) {
					Stuscore s = list.get(i);
					//equals:동일한 이름, contains:포함되어 있는 이름
					if(s.getName().contains(name)) {
					//if(s.getTotal() >= 70) {	//70점 이상인 학생
						temp=1;
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
						System.out.println();
						//slist.add(s);			//매개변수로 넘기는 방식(오버로딩으로 추가) 위에 소스는 주석처리
					}
				}
				if(temp==0) {
					System.out.println("검색하려는 학생이 없습니다.");
					System.out.println();
				}/*else {
					stuOutput(slist);			//매개변수로 넘기는 방식(오버로딩으로 추가)
				}*/
				break;
			case 2:
				/*System.out.print("검색할 학생점수를 입력하세요.>> (0.이전페이지 이동) ");
				choice = scan.nextInt();
				System.out.print("검색할 번호를 입력하세요.>>");
				for(int j=0;j<3;j++) {
					System.out.printf("%d. %s점수 검색\n",(j+1),title[j+2]);
				}
				choice = scan.nextInt();
				System.out.printf("%s점수를 입력하세요.>> ",title[choice+1]);
				switch (choice) {
					case 1:
						kor = scan.nextInt();
						break;
					case 2:
						eng = scan.nextInt();
						break;
					case 3:
						math = scan.nextInt();
						break;
					default:
						break;
				}*/
				break;
			case 0:
				return;
		}
	}
	
	//6. 성적정렬
	void stuSort() {
		System.out.println("[ 성적정렬 ]");
		System.out.println("1. 합계순 역순정렬");
		System.out.println("2. 이름순 순차정렬");
		System.out.println("----------------------------------------------");
		choice = scan.nextInt();
		switch (choice) {
			case 1:	//합계순 역순정렬
				list.sort(new Comparator<Stuscore>() {
					@Override
					public int compare(Stuscore o1, Stuscore o2) {
						return o2.getTotal()-o1.getTotal();
					}
				});
				break;
			case 2:		//이름순 순차정렬
				list.sort(new Comparator<Stuscore>() {
					@Override
					public int compare(Stuscore o1, Stuscore o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				break;
		}
		System.out.println("정렬되었습니다.");
		System.out.println();
	}
	
	//7. 번호재정렬
	void stuNoSort() {
		for(int i=0;i<list.size();i++) {
			list.get(i).setNo(i+1);
		}
		Stuscore.count = list.size();
		System.out.println("번호 재정렬되었습니다.");
		System.out.println();
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
	
	//9. 파일저장
	void fileSave() {
		try {
			FileWriter fw = new FileWriter(filePath);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<list.size();i++) {
				Stuscore s = list.get(i);
				String txt = String.format("%d,%s,%d,%d,%d,%d,%.2f\r\n", s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
				bw.write(txt);
			}
			/*Iterator<Stuscore> it = list.iterator();
			while(it.hasNext()) {
				Stuscore s = it.next();
				String txt = String.format("%d,%s,%d,%d,%d,%d,%.2f\r\n", s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
				bw.write(txt);
			}*/
			bw.close();
			fw.close();
			System.out.println("파일 저장하기 완료");
		} catch (Exception e) {e.printStackTrace();}
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
