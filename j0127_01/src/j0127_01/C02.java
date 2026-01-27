package j0127_01;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
//		Stuscore s1 = new Stuscore();
//		s1.no = 1;
//		s1.name = "홍길동";
//		System.out.println(s1.no+","+s1.name);
		
//		Stuscore[] s = new Stuscore[10];
//		s[0] = new Stuscore("홍길동",100,100,99);
//		s[1] = new Stuscore("유관순",90,90,99);
//		s[2] = new Stuscore("이순신",90,80,70);
		
		Scanner scan = new Scanner(System.in);
		StuDeck s = new StuDeck();
		s.s[0] = new Stuscore("홍길동",100,100,99);
		s.s[1] = new Stuscore("유관순",90,90,99);
		s.s[2] = new Stuscore("이순신",90,80,70);
		loop:while(true) {
			s.stuPrint();
			int choice = scan.nextInt();
			switch(choice) {
				case 1:
					s.stuInput();	//학생성적입력부분
					break;
				case 2:
					s.stuOutput();
					break;
				case 3:
					s.stuUpdate();
					break;
				case 4:
					s.stuSearch();
					break;
				case 5:
					s.stuDelete();
					break;
				case 6:
					break;
				default:
					System.out.println("[ 프로그램 종료 ]");
					scan.close();
					break loop;
			}
		}
	}

}
