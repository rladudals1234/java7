package j0122_01;

import java.util.Arrays;
import java.util.Scanner;

public class C03 {

	public static void main(String[] args) {
		// 다른 클래스 사용하는 방법 - 객체선언 후 사용가능
		int a;
		a = 10;
		
		Tv t1 = new Tv();
		t1.color = "white";
		System.out.println(t1.color);

		t1.channelUp();
		System.out.println(t1.channel);
		t1.channelUp();
		System.out.println(t1.channel);
		
		System.out.println(t1.power);
		t1.power();
		System.out.println(t1.power);
		t1.power();
		System.out.println(t1.power);
		
		Tv t2 = new Tv();
		t2 = t1;		//앏은복사
		System.out.println(t2.color);
		
		t1.channelUp();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		t2.channelUp();
		System.out.println(t1.channel);
		System.out.println(t2.channel);
		
		Tv t3 = new Tv(t1);	//얇은 복사 안되게 생성자에서
		t1.channelUp();
		System.out.println(t1.channel);
		System.out.println(t3.channel);

		int[] aa = {1,2,3};
		int[] bb = {4,5,6};
		System.out.println(Arrays.toString(aa));
		System.out.println(Arrays.toString(bb));
		
		bb=aa;
		System.out.println(Arrays.toString(aa));
		System.out.println(Arrays.toString(bb));
		
		aa[0] = 10;
		System.out.println(Arrays.toString(aa));
		System.out.println(Arrays.toString(bb));
		
		//홍길동 정보 입력
		Stuscore s1 = new Stuscore(1,"홍길동",100,100,99);
		//유관순 정보 입력
		Stuscore s2 = new Stuscore(2,"유관순",90,90,91);
		
		//홍길동 정보 복사 비교
		Stuscore s3 = new Stuscore(s1);
		System.out.println(s1.equals(s3));
		System.out.println(s1.getName().equals(s3.getName()));
		
		//얇은 복사 비교
		Stuscore s4 = s3;
		System.out.println(s3.equals(s4));
		
		//객체 배열
		Stuscore[] s = new Stuscore[3];
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			s[count] = new Stuscore();
			s[count].setNo(count+1);
			System.out.printf("%d번째 이름을 입력하세요.(0. 모두출력)>> ",count+1);
			s[count].setName(scanner.next());
			if(s[count].getName().equals("0")) {
				break;
			}
			System.out.print("국어점수를 입력하세요.>> ");
			s[count].setKor(scanner.nextInt());
			System.out.print("영어점수를 입력해줘.>> ");
			s[count].setEng(scanner.nextInt());
			System.out.print("수학점수를 입력해줘.>> ");
			s[count].setMath(scanner.nextInt());
			count++;
		}
		scanner.close();
		
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n","번호","이름","국어","영어","수학","합계","평균");
		for(int i=0;i<count;i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",s[i].getNo(),s[i].getName(),s[i].getKor(),s[i].getEng(),s[i].getMath(),s[i].getTotal(),s[i].getAvg());
		}
	}

}
