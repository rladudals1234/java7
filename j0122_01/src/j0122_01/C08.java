package j0122_01;

public class C08 {

	static void cal(int kor, int eng, int math, double[] cValue) {
		//합계, 평균
		cValue[0] = kor+eng+math;
		cValue[1] = cValue[0]/(double)3.0;
	}
	public static void main(String[] args) {
		double[] cValue = new double[2];
		int kor = 100;
		int eng = 100;
		int math = 99;
		
		//함수호출 후 합계, 평균을 구해서 출력하시오.
		cal(kor,eng,math,cValue);
		System.out.printf("합계 : %.0f, 평균 : %.2f\n",cValue[0],cValue[1]);
	}

}
