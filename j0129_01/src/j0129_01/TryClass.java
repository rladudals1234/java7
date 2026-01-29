package j0129_01;	//패키지-없으면에러, 없으면 자동생성

public class TryClass extends Object {	//없으면 자동생성(Object)-11개 메소드
	//기본생성자 - 없으면 에러, 없으면 자동생성
	TryClass() {
		super();	//자동생성 - 부모생성자 호출
	}
	
	// equals(),toString(),hashCode()...11개 메소드 존재함.
	
	/*void method() {
		System.out.println(1);
		System.out.println(1);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
			System.out.println(5);
		}catch (Exception e) {
			System.out.println(6);
			e.printStackTrace();
			return;
		}finally {
			System.out.println(7);	//마지막 무조건 실행(catch에 리턴있어도 실행 클라이언트에 메세지보낼때 일부러 catch 발생시 반드시 실행할 것만)
		}
		System.out.println(8);
	}*/
	
	void method() throws Exception {		//반드시 사용해야한다고 함수를 사용할때 try,catch나 throws적용 후 사용
		System.out.println(1);
		System.out.println(1);
		System.out.println(3);
		System.out.println(0/0);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
	}
}
