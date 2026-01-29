package j0129_01;

public class C07 {

	public static void main(String[] args) {
//		Stuscore s = new Stuscore("홍길동",100,100,99);
//		Stuscore s2 = new Stuscore("홍길동",100,100,99);
//		Stuscore s3 = new Stuscore("홍길동",100,100,99);
//		if(s.equals(s2)) {
//			System.out.println("같은객체");	//오버라이딩 하면 같다고 나옴
//		}else {
//			System.out.println("다른객체");	//주소값이 다름
//		}
//		
//		//Stuscore에서 .toString 오버라이딩 주석처리
//		System.out.println(s);		//toString으로 주소값 변환할때 오버라이딩 함
//		System.out.println(s2);
//		System.out.println(s3);
		
//		Person p1 = new Person();
//		p1.id = 20010101_11111111L;
//		p1.name = "홍길동";
//		
//		Person p2 = new Person();
//		p2.id = 20010101_11111111L;
//		p2.name = "홍길동";
//		
//		if(p1.equals(p2)) {
//			System.out.println("같음");
//		}else {
//			System.out.println("다름");
//		}
//		System.out.println(p1);
//		System.out.println(p2);
		
//		String txt = "지난 10일, 2026년 새해가 밝은지 열흘만에 남북관계를 꽁꽁 얼어붙게 만든 사건이 일어났습니다. 바로 최근 군·경 합동수사TF가 수사하고 있는 ‘개성 무인기 침투 사건’입니다.\r\n"
//				+ "이 사건은 지난 10일 북한 측에서 “남한 측 무인기가 개성에 침투했다” 라고 주장하면서 시작됐습니다. 북한 측은 해당 무인기의 사진을 공개하면서, 무인기 침투가 대한민국 국군의 소행으로 의심된다고 주장했어요. \r\n"
//				+ "하지만 우리 국방부는 “(해당 무인기는)우리 군이 보유한 기종이 아니다” 라며 북한 측 주장을 전면 부인했습니다. 그러자 자연스레 군이 아닌 민간인이 무인기를 날려보냈을 가능성이 제기됐는데요.";
//		
//		System.out.println(txt.hashCode());
//		String txt2 = "aaabbbccc";
//		System.out.println(txt2.hashCode());
//		
//		txt = "지난 10일, 2026년 새해가 밝은지, 열흘만에 남북관계를 꽁꽁 얼어붙게 만든 사건이 일어났습니다. 바로 최근 군·경 합동수사TF가 수사하고 있는 ‘개성 무인기 침투 사건’입니다.\r\n"
//				+ "이 사건은 지난 10일 북한 측에서 “남한 측 무인기가 개성에 침투했다” 라고 주장하면서 시작됐습니다. 북한 측은 해당 무인기의 사진을 공개하면서, 무인기 침투가 대한민국 국군의 소행으로 의심된다고 주장했어요. \r\n"
//				+ "하지만 우리 국방부는 “(해당 무인기는)우리 군이 보유한 기종이 아니다” 라며 북한 측 주장을 전면 부인했습니다. 그러자 자연스레 군이 아닌 민간인이 무인기를 날려보냈을 가능성이 제기됐는데요.";
//		
//		System.out.println("쉼표변경 : "+txt.hashCode());
		
		Person p1 = new Person(20010101_1111111L,"홍길동");
		Person p2 = new Person(20010101_2111111L,"유관순");
		System.out.println(p1);
		System.out.println(p2);
		Person p3 = new Person(p1);
		p3.name = "이순신";
		System.out.println(p3);
		
		Class cObj = Person.class;
		String className = cObj.getName();
		System.out.println(className);
	}

}
