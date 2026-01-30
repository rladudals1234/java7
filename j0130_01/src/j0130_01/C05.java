package j0130_01;

import java.util.Scanner;

public class C05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//특정한 값만 입력을 받고자 할때 enum 형태값을 입력받음.
		Day today = Day.월요일;
		System.out.println(today);
		
		Gender g = Gender.남성;
		System.out.println(g);
		
		Person p = new Person();
		p.g = Gender.남성;		//g = "남성";
		System.out.println(p.g);
//		while(true) {
//			System.out.println("요일을 입력하세요.>> ");
//			String day = scan.next();
//			System.out.println("요일 : "+day);
//		}
	}

}
