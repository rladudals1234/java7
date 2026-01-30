package j0130_01;

import java.util.ArrayList;
import java.util.Scanner;

import j0130_01.StuDeck;

public class StuMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		loop:while(true) {
			s.screen_print();
			int choice = scan.nextInt();
			switch(choice) {
				case 1:
					s.stuInput();		//입력
					break;
				case 2:
					s.stuOutput();		//출력
					break;
				case 3:
					s.stuUpdate();		//수정
					break;
				case 4:
					s.stuDelete();		//삭제
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
