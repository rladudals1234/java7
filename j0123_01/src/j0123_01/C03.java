package j0123_01;

public class C03 {

	int add(int a, int b) {	//인스턴스 메소드
		return a+b;
	}
	
	int sub(int a, int b) {	//인스턴스 메소드
		return a-b;
	}
	
	int multi(int a, int b) {	//인스턴스 메소드
		return a*b;
	}
	
	double devide(int a, int b) {	//인스턴스 메소드
		return a/(double)b;
	}
	
	public static void main(String[] args) {
		//객체선언후 사용
		C03 c = new C03();
		int a = 10;
		int b = 3;
		
		//int result = c.add(10, 3);
		int result1 = c.add(a, b);
		int result2 = c.sub(a, b);
		int result3 = c.multi(a, b);
		double result4 = c.devide(a, b);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}

}
