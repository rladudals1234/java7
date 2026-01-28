package j0128_01;

import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
//		Stuscore s = new Stuscore("홍길동",100,100,99);
//		//s.name="홍길동"; //private 접근불가
//		s.setName("홍길동");
//		s.setKor(50);
//		s.setKor(500);
//		//s.kor = 500;
//		System.out.println(s.getKor());
		
		StuDeck s = new StuDeck();
		
		Scanner scan = new Scanner(System.in);
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
					System.out.println("프로그램을 종료합니다.");
					scan.close();
					break loop;
			}
		}
	}

}
