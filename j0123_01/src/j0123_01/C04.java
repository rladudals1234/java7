package j0123_01;

public class C04 {

	static void add(int a, int b) {	//클래스메소드 - 객체선언없이 클래스명.메소드명
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 9;
		int c = 5;
		C04.add(a, b);
		
		//a,b를 보내서 평균값을 리턴해서 받아, 출력
		Method m = new Method();
		System.out.println(m.avg(a, b));
		
		//a,b,c를 보내서 합계를 리턴해서 출력
		System.out.println(m.total(a, b, c));
		
		// input() 리턴없이 2개의 값을 입력받아, 합을 출력하는 메소드
		//m.input();
		
		//input2() 합의 값을 리턴해줌.
		int result3 = m.input2();
		System.out.println(result3);
		
		//함수호출
		// 1. 2개 숫자를 입력받아, 더하기,빼기,곱하기 값을 출력하는 메소드 구현
		int[] result1 = m.addSubMulti1();
		/*System.out.println("더하기:"+result1[0]);
		System.out.println("빼기:"+result1[1]);
		System.out.println("곱하기:"+result1[2]);*/
		for(int i=0;i<result1.length;i++) {
			System.out.println(result1[i]);
		}
		
		// 2. 리턴없이 2개숫자를 입력받아 더하기,빼기,곱하기 값을 리턴 1개만 리턴 가능
		m.addSubMulti();
		
		// 3. 매개변수로 받아서 진행 (얇은 복사)
		int[] result2 = new int[3];
		int[] score1 = m.addSubMulti1(result2);
		result2[0]=100;
		for(int i=0;i<score1.length;i++) {
			System.out.println(score1[i]);
		}
		
		// 3. 매개변수로 받아서 진행
		int[] score = m.addSubMulti1(new int[3]);
		for(int i=0;i<score.length;i++) {
			System.out.println(score[i]);
		}
	}

}
