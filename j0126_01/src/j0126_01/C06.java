package j0126_01;

import java.util.Scanner;
// 이점 : 선언할 때 패키지명 생략가능

public class C06 {	//public에 C06 이름만 파일이름으로 사용가능

	public static void main(String[] args) {
		//오버라이딩(상속일 때) -> 메소드재정의
		//부모생성자에 웬만하면 기본생성자 만들기 super적용시 에러발생 안되게
		
		Scanner scanner = new Scanner(System.in);
		String aa = scanner.next();
		scanner.close();
	}

}

class C07{	//한 파일안에 한 클래스만 C07은 파일로 빼기
	int x;
	int y;
}
