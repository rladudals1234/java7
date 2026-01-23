package j0122_01;

import java.util.ArrayList;
import java.util.List;

public class C02 {

	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv aa = new Tv();
		Tv b = new Tv();
		
		Stuscore s1 = new Stuscore(1,"홍길동",100,100,99);
		Stuscore s2 = new Stuscore(2,"유관순",90,90,80);
//		System.out.println(s1.getNo());
//		System.out.println(s1.getName());
//		System.out.println(s1.getKor());
//		System.out.println(s1.getEng());
//		System.out.println(s1.getMath());
//		System.out.println(s1.getTotal());
//		System.out.println(s1.getAvg());
//		System.out.println(s2.getNo());
//		System.out.println(s2.getName());
//		System.out.println(s2.getKor());
//		System.out.println(s2.getEng());
//		System.out.println(s2.getMath());
//		System.out.println(s2.getTotal());
//		System.out.println(s2.getAvg());
		
		List<Stuscore> list = new ArrayList<Stuscore>();
		list.add(s1);
		list.add(s2);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getNo());
			System.out.println(list.get(i).getName());
			System.out.println(list.get(i).getKor());
			System.out.println(list.get(i).getEng());
			System.out.println(list.get(i).getMath());
			System.out.println(list.get(i).getTotal());
			System.out.println(list.get(i).getAvg());
		}
	}

}
