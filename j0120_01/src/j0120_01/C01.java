package j0120_01;

import java.util.Scanner;

public class C01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("[ 학생성적프로그램 ]");
//		System.out.println("1. 학생성적입력");
//		System.out.println("2. 학생성적출력");
//		System.out.println("3. 학생성적수정");
//		Scanner scanner = new Scanner(System.in);
//		int choice = scanner.nextInt();
		
//		switch(choice) {
//			case 1:
//				System.out.println("[학생성적입력]");
//				break;
//			case 2:
//				System.out.println("[학생성적출력]");
//				break;
//			case 3:
//				System.out.println("[학생성적수정]");
//				break;
//			default:
//				break;
//		}
		
//		if(choice == 1) {
//			System.out.println("[학생성적입력]");
//		}else if(choice == 2) {
//			System.out.println("[학생성적출력]");
//		}else if(choice == 3) {
//			System.out.println("[학생성적수정]");
//		}
//		scanner.close();
		
		// 문자숫자타입을 숫자타입으로 변경
//		int no = '2'-'0';
//		System.out.println(no);	//int 숫자로 취환
//		
//		// 숫자를 문자로 취환
//		char ch = (char)(2+'0');
//		System.out.println(ch);
//		
//		String str = "123";
//		char str2 = str.charAt(0);	//문자1개 가져옴.
//		System.out.println(str2);
//		
//		// 숫자타입 -> 문자열타입 변경
//		String str3 = 234+"";
//		System.out.println(str3);
//		
//		// 문자열타입 -> int타입
//		String str4 = "20";
//		String str5 = "10";
//		int num1 = Integer.parseInt(str4);
//		int num2 = Integer.parseInt(str5);
//		System.out.println(num1+num2);
		
		// Math.random() 	0<=랜덤숫자<1
		// Math.random() 	0*10=0+1<=(int)(Math.random()*10)+1<1*10+1
		// 1~5번까지 랜덤숫자를 입력하는데, 중복이 없도록 숫자를 입력하시오.
//		int no1 = (int)(Math.random()*5)+1;
//		int no2 = (int)(Math.random()*5)+1;
//		int no3 = (int)(Math.random()*5)+1;
		
//		for(;;) {			
//			if(no1 == no2) {
//				no2 = (int)(Math.random()*5)+1;
//			}else if(no1 == no3 || no2 == no3) {
//				no3 = (int)(Math.random()*5)+1;
//			}else {
//				break;
//			}
//		}
		
		//다른방식(속도가 위에보다 더 빠름 > 반복문2개로 조건비교가 적음)
//		for(;;) {
//			no2 = (int)(Math.random()*5)+1;
//			if(no1 != no2) {
//				break;
//			}
//		}
//		for(;;) {
//			no3 = (int)(Math.random()*5)+1;
//			if(no3 != no2 && no3 != no1) {
//				break;
//			}
//		}
		
		//다른방식(속도는 더 느릴 수 있음)
//		for(;;) {
//			no2 = (int)(Math.random()*5)+1;
//			no3 = (int)(Math.random()*5)+1;
//			if(no1 != no2 && no1 != no3 && no2 != no3) break;
//		}
		
//		System.out.println(no1);
//		System.out.println(no2);
//		System.out.println(no3);
		
		
		//소수점 반올림:round, 올림:ceil, 버림:floor
//		System.out.println(Math.round(34.95));
//		System.out.println(Math.ceil(34.95));
//		System.out.println(Math.floor(34.95));
		
		//34.1592
//		double num = 34.1592;
//		double num2 = (Math.round(num*100))/100.0;
//		System.out.println(num2);
		
		//1459 - 입력받은 숫자들의 합을 구하시오.
//		String str = "1459";
//		int no1 = str.charAt(0)-'0';	//'1'
//		int no2 = str.charAt(1)-'0';	//'4'
//		int no3 = str.charAt(2)-'0';	//'5'
//		int no4 = str.charAt(3)-'0';	//'9'
//		System.out.printf("%d,%d,%d,%d\n",no1,no2,no3,no4);
//		System.out.println("결과값 : "+(no1+no2+no3+no4));
//		
//		int sum=0;
//		String s_print = "";
//		for(int i=0;i<str.length();i++) {
//			int no = str.charAt(i)-'0';
//			sum+=no;
//			if(i==0) s_print = no+"";
//			else s_print+=(","+no);
//		}
//		System.out.println(s_print);
//		System.out.println("결과값 : "+sum);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.>> ");
//		String str = scanner.next();
//		int sum=0;
//		String s_print = "";
//		for(int i=0;i<str.length();i++) {
//			int no = str.charAt(i)-'0';
//			sum+=no;
//			if(i==0) s_print = no+"";
//			else s_print+=(","+no);
//		}
//		System.out.println(s_print);
//		System.out.println("결과값 : "+sum);
//		scanner.close();
		
		//7이 몇번 입력되었는지 개수를 출력하시오.
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.>> ");
//		String str = scanner.nextLine();
//		int cnt=0;
//		String s_print = "";
//		for(int i=0;i<str.length();i++) {
//			int no = str.charAt(i)-'0';
//			if(no==7) {
//				++cnt;
//				s_print += i+",";
//			}
//		}
//		System.out.println("입력된 숫자길이 : "+str.length());
//		System.out.println("7번 위치 : "+s_print);
//		System.out.println("7번 개수 : "+cnt);
//		scanner.close();
		
		// contains:포함되어 있는지 확인, indexOf:포함되어 있는지 확인, 위치값
//		String str = "12345";
//		if(str.contains("3")==true) {
//			System.out.println("3이 포함되어 있습니다.");
//		}else {
//			System.out.println("3이 포함되어 있지 않습니다.");
//		}
		
//		System.out.println(str.indexOf("3"));
		
//		String str = "123451234512345";
//		int pos = str.indexOf("3");	//이전위치 현재위치 비교
//		String pos_str = "";		//위치str
//		int cnt = 0;				//개수
//		for(int i=0; i<str.length();i++) {
//			if(pos!=str.indexOf("3",i)) {
//				cnt++;
//				pos_str += pos+",";
//			}
//			pos = str.indexOf("3",i);
//		}
//		System.out.println("3의 위치 : "+pos_str);
//		System.out.println("3의 개수 : "+cnt);
		
		//위에 있는 방식으로 해도 됨.
//		String str = "123451234512345";
//		int startNo = 0;
//		int count = 0;
//		String s_print = "";
//		for(;;) {
//			int temp = str.indexOf("3",startNo);
//			if(temp==-1) {
//				break;
//			}
//			//3을 찾았을 경우
//			count++;
//			s_print += temp+" ";
//			startNo = temp+1;
//		}
//		System.out.println("3의 위치 : "+s_print);
//		System.out.println("3의 개수 : "+count);
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.>> ");
//		String str = scanner.nextLine();
//		System.out.print("찾고자 하는 번호를 입력하세요.>> ");
//		String input = scanner.nextLine();
//		int startNo = 0;
//		int count = 0;
//		String s_print = "";
//		for(;;) {
//			int temp = str.indexOf(input,startNo);
//			if(temp==-1) {
//				break;
//			}
//			//3을 찾았을 경우
//			count++;
//			s_print += temp+" ";
//			startNo = temp+1;
//		}
//		System.out.println(input+"의 위치 : "+s_print);
//		System.out.println(input+"의 개수 : "+count);
//		scanner.close();
		
//		String str1 = "['게임','골프','수영','조깅','독서']";
//		String str2 = "['수영','조깅','독서']";
//		String str3 = "['게임','골프','독서']";
//		String str4 = "['게임','수영','조깅','독서']";
//		String str5 = "['게임','골프','독서']";
//		
//		//수영이 포함되어 있는 문자열을 출력하시오.(수영있습니다./수영없습니다.)
//		if(str1.contains("수영")==true) {
//			System.out.println("수영있습니다.");
//		}else {
//			System.out.println("수영없습니다.");
//		}
//		if(str2.contains("수영")==true) {
//			System.out.println("수영있습니다.");
//		}else {
//			System.out.println("수영없습니다.");
//		}
//		if(str3.contains("수영")==true) {
//			System.out.println("수영있습니다.");
//		}else {
//			System.out.println("수영없습니다.");
//		}
//		if(str4.contains("수영")==true) {
//			System.out.println("수영있습니다.");
//		}else {
//			System.out.println("수영없습니다.");
//		}
//		if(str5.contains("수영")==true) {
//			System.out.println("수영있습니다.");
//		}else {
//			System.out.println("수영없습니다.");
//		}
		
		// boolean,char,byte,short,int,long,float,double
		// 등가비교 == 비교가능
		int a = 10;
		if(a==10) {
			System.out.println("맞습니다.");
		}else {
			System.out.println("틀립니다.");
		}
		// String타입 등가비교가 안됨. == (X)
		// 객체타입 .equals()
		String str1 = "10";
		String str2 = "100";
		String str3 = new String("10");
		String str4 = "10";
		
		System.out.printf("%s,%s,%s\n",str1,str2,str3);
		if(str1==str2) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		if(str1==str3) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		if(str1.equals(str3)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
		if(str1==str4) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다.");
		}
	}

}
