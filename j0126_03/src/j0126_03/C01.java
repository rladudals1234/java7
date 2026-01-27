package j0126_03;

public class C01 {

	public static void main(String[] args) {
		//카드 클래스 정의
		//Deck클래스 정의
		//메인에서 Deck객체 선언후
		//5개 카드 출력
		//섞기 한 후
		//5개 카드 출력
		Deck d = new Deck();
		d.shuffle();
		Student[] s = {
				new Student(1,"aaa","1234","홍길동","010-1234-1234",d.pick()),
				new Student(2,"bbb","1234","유관순","010-1234-1234",d.pick(5)),
				new Student(3,"ccc","1234","이순신","010-1234-1234",d.pick(10))
		};
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i].name+"학생의 카드는 ");
			for(int j=0;j<s[i].card.length;j++) {
				System.out.print(s[i].card[j].kind+"/"+s[i].card[j].number+", ");
			}
			System.out.println();
		}
	}

}
