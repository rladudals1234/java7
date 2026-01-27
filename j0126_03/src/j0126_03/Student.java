package j0126_03;

public class Student {
	int no;
	String id;
	String pw;
	String name;
	String phone;
	Card[] card = new Card[Deck.CARD_NUM];
	
	public Student() {	//기본생성자
		
	}
	
	public Student(Student s) {
		this.no = s.no;
		this.id = s.id;
		this.pw = s.pw;
		this.name = s.name;
		this.phone = s.phone;
	}
	
	//매개변수가 있는 생성자
	public Student(int no, String id, String pw, String name, String phone, Card[] card) {
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.card = card;
	}
}
