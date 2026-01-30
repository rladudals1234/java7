package j0130_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class StuMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck2 s = new StuDeck2();
		/*System.out.print("파일을 불러오시겠습니까?(1.예,2.아니오)");
		int choice = scan.nextInt();
		if(choice==1) {
			s.fileOpen();	//파일 불러오기
			loop:while(true) {
				s.screen_print();
				choice = scan.nextInt();
				switch(choice) {
					case 1:
						//s.fileSave();		//파일 저장
						s.stuInput();		//입력(파일갱신도 됨)
						break;
					case 2:
						s.stuOutput();		//출력
						break;
					case 3:
						s.stuUpdate();		//수정(파일갱신도 됨)
						break;
					case 4:
						s.stuDelete();		//삭제(파일갱신도 됨)
						break;
					case 5:
						s.stuSearch();		//검색
						break;
					default:
						System.out.println("[ 프로그램을 종료 ]");
						scan.close();
						break loop;
				}
			}
		}*/
		
		//s.fileOpen();부분은 생성자에 추가
		loop:while(true) {
			s.screen_print();
			int choice = scan.nextInt();
			switch(choice) {
				case 1:
					//s.fileSave();		//파일 저장
					s.stuInput();		//입력(파일갱신도 됨)
					break;
				case 2:
					s.stuOutput();		//출력
					break;
				case 3:
					s.stuUpdate();		//수정(파일갱신도 됨)
					break;
				case 4:
					s.stuDelete();		//삭제(파일갱신도 됨)
					break;
				case 5:
					s.stuSearch();		//검색
					break;
				default:
					System.out.println("[ 프로그램을 종료 ]");
					scan.close();
					break loop;
			}
		}
	}

}
