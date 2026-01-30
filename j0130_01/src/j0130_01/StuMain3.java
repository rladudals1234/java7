package j0130_01;

import java.util.Scanner;

public class StuMain3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck3 s = new StuDeck3();
		loop:while(true) {
			s.screen();
			int choice = scan.nextInt();
			switch(choice) {
				case 1:
					s.stuInput();
					break;
				case 2:
					s.stuOutput();
					break;
				case 3:
					s.stuUpdate();
					break;
				case 4:
					s.stuDelete();
					break;
				case 5:
					s.stuSearch();
					break;
				case 6:
					s.stuNoSort();
					break;
				case 7:
					s.fileSave();
					break;
				case 8:
					s.fileOpen();
					break;
				case 0:
					System.out.println("[ 프로그램 종료 ]");
					scan.close();
					break loop;
			}
		}
	}

}
