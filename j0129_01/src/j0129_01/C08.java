package j0129_01;

import java.math.BigInteger;
import java.util.Scanner;

public class C08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//indexof();
		String txt = "aaabbbcdeaaabcccceaeaeab";
//		System.out.println(txt.indexOf("e"));	//번지	//txt.indexOf("e") = 8
//		System.out.println(txt.indexOf("e",8+1));
//		System.out.println(txt.indexOf("e",17+1));
//		System.out.println(txt.indexOf("e",19+1));
//		System.out.println(txt.indexOf("e",21+1));
		
//		int count = 0;
//		for(int i=0;i<txt.length();i++) {
//			if(txt.indexOf("e",i)!=-1) {
//				System.out.println("위치값 : "+txt.indexOf("e",i));
//				i=txt.indexOf("e",i);	//8
//				count++;
//			}else break;
//		}
//		System.out.println("-----------------------------");
//		System.out.println("e개수 : "+count);
		
		//replace 활용한 a의 개수 알아내기
//		String txt2 = txt.replace("a","A");
//		System.out.println(txt2);
//		System.out.println(txt.length()-txt.replace("a","").length());		//replace 활용한 a의 개수 알아내기
		
		//trim-빈공백제거, replace-문자대체
//		String txt1 = "    a    b   c     ";
//		String txt2 = "    abc     ";
//		System.out.println("원본1:"+txt1);
//		System.out.println("원본2:"+txt2);
//		System.out.println("trim으로 원본1 공백제거 :"+txt1.trim());	//사이공백은 제거 안됨
//		System.out.println("trim으로 원본2 공백제거 :"+txt2.trim());	//앞뒤공백제거
//		System.out.println("replace로 사이공백제거 : "+txt1.replace(" ",""));	//사이공백제거
		
		//split-문자열 분리,valueOf-문자열을 숫자로 변환, parseDouble-문자열을 소수점숫자로 변환
//		String txt3 = "1,홍길동,100,100,100,300,100.0";
//		String[] arr = txt3.split(",");	//split()를 사용한 문자열 분리
//		int no = Integer.parseInt(arr[0]);
//		String name = arr[1];
//		int kor = Integer.valueOf(arr[2]);		//parseInt 또는 valueOf로 사용가능
//		int eng = Integer.valueOf(arr[3]);
//		int math = Integer.valueOf(arr[4]);
//		int total = Integer.valueOf(arr[5]);
//		double avg = Double.parseDouble(arr[6]);	//parseDouble 또는 valueOf로 사용가능
//		double avg2 = Double.valueOf(arr[6]);
//		System.out.println(Arrays.toString(arr));
		
		//subString(0,5) - 문자열 잘라내기
		//10조12345번
		//12345
		String txt4 = "10조12345번";
		System.out.println(txt4.substring(3,8));
		System.out.println(txt4.substring(3));
		//System.out.println(txt4.substring(0,-1));	//파이썬과 다르게 -1은 에러발생
		
		//charAt(); - 문자1개 잘라내기
		System.out.println(txt4.charAt(2));
		
		//String, StringBuffer
		StringBuffer sb = new StringBuffer("0");	//메모리 1개
		String str = "1";
		int a = 0;
		for(int i=0;i<=10;i++) {
			a += i;
			str += i;
			sb.append(i);
		}
		System.out.println(a);
		System.out.println(str);
		System.out.println(sb);
		sb.insert(2, 645);
		System.out.println(sb);
		
		int aaa = 10;
		Integer bbb = new Integer(10);	//wrapper클래스
		System.out.println(aaa);
		System.out.println(bbb);
		
		BigInteger ccc = new BigInteger("15235252993252959239529359212345678910");		//무한대로 숫자 사용가능 int는 제한있음
		System.out.println(ccc);
		
		
		
//		Scanner scan = new Scanner(System.in);
//		//contains()
//		String[] name = {
//				"홍길동","유관순","이순신","강감찬","김구",
//				"김유신","홍길자","홍길순","유관자","이순자",
//		};
//		
//		// 홍이 들어가 있는 사랑을 모두 출력하시오.
//		int temp = 0;
//		System.out.println("[ 검색 출력 ]");
//		for(int i=0;i<name.length;i++) {
//			if(name[i].contains("순")) {
//				System.out.println((i+1)+","+name[i]);
//				temp = 1;
//			}
//		}
//		System.out.println("-------------------------------------");
//		System.out.println("변경하려는 사람 번호를 입력하세요.>> ");
//		int no = scan.nextInt();
//		System.out.println(name[no-1]+" : 변경하려는 이름을 입력하세요.>> ");
//		String updateName = scan.next();
//		name[no-1] = updateName;
//		System.out.println("변경된 이름은 "+name[no-1]+"입니다.");
//		if(temp==0) {
//			System.out.println("검색된 사람이 없습니다.");
//		} else {
//			name[no-1] = updateName;
//		}
//		for(int i=0;i<name.length;i++) {
//			System.out.println((i+1)+","+name[i]);
//		}
//		scan.close();
	}

}
