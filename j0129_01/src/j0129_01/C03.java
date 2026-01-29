package j0129_01;

import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		loop:while(true) {
			s.screen_print();
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
				default:
					System.out.println("[ 프로그램을 종료 ]");
					scan.close();
					break loop;
			}
		}
	}

}
