package j0123_01;

public class C06 {

	static int ii;	//클래스 변수, 인스턴스변수는 자동초기화가 됨.
	public static void main(String[] args) {
//		Student s1 = new Student(1, "hong", "1234", "홍길동", "010-0000-0000", "male", "game");
//		Student s2 = new Student(2, "u", "1234", "유관순", "010-1234-5678", "female", "music");
//		
//		System.out.println(s1.name);
//		System.out.println(s1.phone);
//		System.out.println(s1.gender);
//		System.out.println(s1.hobby);
//		
//		System.out.println(s2.name);
//		System.out.println(s2.phone);
//		System.out.println(s2.gender);
//		System.out.println(s2.hobby);
//		System.out.println();
		
		//Car -> white,auto,5
		//출력하시오.
//		Car c1 = new Car("white", "auto", 5);
//		Car c2 = new Car("red", "stick", 4);
//		Car c3 = new Car("green", "auto", 5);
//		Car c4 = new Car("gray", "stick", 3);
//		Car c5 = new Car("blue", "auto", 6);
//		
//		System.out.printf("%s,%s,%d\n",c1.color,c1.gearType,c1.door);
//		System.out.printf("%s,%s,%d\n",c2.color,c2.gearType,c2.door);
//		System.out.printf("%s,%s,%d\n",c3.color,c3.gearType,c3.door);
//		System.out.printf("%s,%s,%d\n",c4.color,c4.gearType,c4.door);
//		System.out.printf("%s,%s,%d\n",c5.color,c5.gearType,c5.door);
		
		//Stuscore
//		Stuscore sc1 = new Stuscore(1,"홍길동",100,100,99);
//		Stuscore sc2 = new Stuscore(2,"유관순",90,90,90);
//		Stuscore sc3 = new Stuscore(3,"이순신",80,80,81);
//		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",sc1.no,sc1.name,sc1.kor,sc1.eng,sc1.math,sc1.total,sc1.avg);
//		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",sc2.no,sc2.name,sc2.kor,sc2.eng,sc2.math,sc2.total,sc2.avg);
//		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",sc3.no,sc3.name,sc3.kor,sc3.eng,sc3.math,sc3.total,sc3.avg);
		
//		Stuscore[] s = new Stuscore[10];
//		s[0] = new Stuscore(1,"홍길동",100,100,99);
//		s[1] = new Stuscore(2,"유관순",90,90,90);
//		s[2] = new Stuscore(3,"이순신",80,80,81);
//		for(int i=0; i<3; i++) {
//			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",s[i].no,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
//		}
		
//		Student s = new Student(1,"aaa","1111","홍길동","010-0000-0000","남자","골프,수영");
//		Student s2 = new Student(s);
//		Student s3 = s;	//주소값 복사
//		s2.name = "유관순";
//		System.out.println(s.name);
//		System.out.println(s2.name);
//		s3.name = "이순신";
//		System.out.println(s.name);
//		System.out.println(s3.name);
		
		int i=0;	//지역변수는 자동 초기화가 안됨.
		System.out.println(i);
		System.out.println(ii);
	}

}
