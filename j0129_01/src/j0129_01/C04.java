package j0129_01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C04 {

	public static void main(String[] args) throws IOException {
//		Stuscore s = new Stuscore("홍길동",100,100,99);
//		System.out.println(s.toString());		//오버라이딩된 toString메소드 사용
		//s.aa[0] = "test";
		//System.out.println(s.aa[0].toString());
		
//		Integer aaa = 10;
//		String bbb = aaa.toString();
//		
//		String str = "aaa";
//		String str2 = "bbb";
		
//		Scanner scan = new Scanner(System.in);
//		//test		//오타 - 컴파일에러(코드작성 실수)
//		int[] a = new int[3];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		System.out.println("값을 입력하세요.>> ");
//		int b = scan.nextInt();
//		System.out.println(b);
//		a[3] = b;		//런타임에러(실행중에 에러발생)
//		scan.close();
		
//		System.out.println(1);
//		System.out.println(2);
//		try {
//			System.out.println(0/0);
//			System.out.println(3);
//			System.out.println(0/0);		//에러
//			System.out.println(4);
//			throw new Exception("고의로 발생");		//강제발생
//			//System.out.println(5);
//		} catch(Exception e) {
//			System.out.println(6);
//			System.out.println(e.getMessage());
//			e.printStackTrace();	//에러 정보 위치 메시지 출력
//		}
//		System.out.println(7);
		
//		System.out.println(1);
//		System.out.println(1);
//		try {
//			System.out.println(3);
//			System.out.println(0/0);
//			System.out.println(4);
//			System.out.println(5);
//		}catch (Exception e) {
//			System.out.println(6);
//		}finally {
//			System.out.println(7);	//마지막 무조건 실행
//		}
//		System.out.println(8);
		
//		TryClass t = new TryClass();
//		try {
//			t.method();		//에러처리 위임
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("프로그램을 종료합니다.");
		
		try {
			//외부에서 파일을 읽어오기 때문에 try~catch 선언이 되어야함.
			FileReader fr = new FileReader("C:/down/aaa.txt");
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();
				if(line==null) break;
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");
	}

}
