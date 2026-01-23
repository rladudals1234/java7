package j0123_01;

public class Student {
	int no;
	String id;
	String pw;
	String name;
	String phone;
	String gender;
	String hobby;
	
	public Student() {	//기본생성자
		
	}
	
	public Student(Student s) {
		this.no = s.no;
		this.id = s.id;
		this.pw = s.pw;
		this.name = s.name;
		this.phone = s.phone;
		this.gender = s.gender;
		this.hobby = s.hobby;
	}
	
	//매개변수가 있는 생성자
	public Student(int no, String id, String pw, String name, String phone, String gender, String hobby) {
		this.no = no;
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
		this.gender = gender;
		this.hobby = hobby;
	}
}
