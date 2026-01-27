package j0127_01;

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class C03 {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1.getNum());
		s2.setNum(100);
		System.out.println(s2.getNum());
		System.out.println(s1.getNum());
		//싱글톤 패턴 - 메모리 절약
//		Singleton s1 = Singleton();
		
//		Date d = new Date();
//		System.out.println(d);
//		Date d2 = new Date();
//		System.out.println(d2);
//		
//		Calendar c = new Calendar.getInstance();
//		Calendar c2 = new Calendar.getInstance();
//		System.out.println(c);
//		System.out.println(c2);
	}

}
