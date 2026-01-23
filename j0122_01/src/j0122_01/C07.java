package j0122_01;

public class C07 {

	static void change(int a) {
		a = 1000;
		System.out.println("change a : "+a);
	}
	
	static void change(int[] a) {
		a[0] = 1000;
		System.out.println("change a : "+a[0]);
	}
	
	static void change(AA aObj, int a, int b, int c) {
		aObj.result = a+b+c;
		aObj.result2 = a-b-c;
		aObj.result3 = a*b*c;
		aObj.result4 = a/(double)b/(double)c;
	}
	
	public static void main(String[] args) {
		//매개변수가 기본형 변수로 전달될때는 값이 변경되지 않음.(return없이는 값이 변경되지 않음, 지역변수는 소멸)
//		int a = 50;
//		System.out.println("1번째 : "+a);
//		//함수호출
//		change(a);
//		//함수호출후 결과값
//		System.out.println("함수호출후 값 : "+a);
		
		//매개변수가 참조형 변수로 전달될때는 값이 변경됨.(객체로 넘기면 얇은복사로 return없이 변경가능)
//		int[] a = {50};		//a는 참조형 변수(주소)	//a[0]는 기본형 변수
//		System.out.println("1번째 : "+a[0]);
//		//함수호출
//		change(a);
//		//함수호출후 결과값
//		System.out.println("함수호출후 값 : "+a[0]);
		
		AA aObj = new AA();
		int a = 10;
		int b = 3;
		int c = 2;
		
		//aObj -> result, result2, result3, result4
		//더하기값,빼기값,곱하기값,나누기값을 입력받아 출력하시오.
		System.out.print("초기값 : ");
		System.out.printf("%d,%d,%d,%.2f",aObj.result, aObj.result2, aObj.result3, aObj.result4);
		System.out.println();
		change(aObj,a,b,c);
		
		System.out.print("결과값 : ");
		System.out.printf("%d,%d,%d,%.2f",aObj.result, aObj.result2, aObj.result3, aObj.result4);
		System.out.println();
	}

}
