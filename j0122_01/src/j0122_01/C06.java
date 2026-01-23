package j0122_01;

public class C06 {

	// 함수선언
	static int add(int a, int b, int c) {
		int result = a+b+c;
		return result;
	}
	static int sub(int a, int b, int c) {
		int result = a-b-c;
		return result;
	}
	static int multi(int a, int b, int c) {
		int result = a*b*c;
		return result;
	}
	static double divide(int a, int b, int c) {
		double result = a/(double)b/(double)c;
		return result;
	}
	static int[] cal(int a, int b, int c) {
		int[] re = new int[2];
		re[0] = a+b+c;
		re[1] = a-b-c;
		return re;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		int c = 2;
		int result = 0,result2 = 0,result3 = 0;
		double result4 = 0;
		//매개변수 3개를 보내서 add,sub,multi,divide 함수를 만들어서
		//결과값을 리턴 받아, 출력하시오.
		result = add(a,b,c);
		result2 = sub(a,b,c);
		result3 = multi(a,b,c);
		result4 = divide(a,b,c);
		int[] re = cal(a,b,c);
		
		System.out.printf("%d, %d, %d, %.2f\n",result,result2,result3,result4);
		System.out.printf("%d, %d\n",re[0],re[1]);
	}

}
