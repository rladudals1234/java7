package j0126_01;

public class Stuscore {
	static int count = 0;
	{
		count++;
		no = count;
	}
	int no;		//인스턴스 변수 - 객체선언후 참조변수명.변수명
	String name;
	int kor,eng,math,total;
	double avg;
	Stuscore(){}	//기본생성자 - 클래스명 같다, 리턴값이 없다, void 안 붙임.
	
	public Stuscore(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calTotal(kor,eng,math);
	}
	
	public Stuscore(int no, String name, int kor, int eng, int math) {
		this.no = no;			//this : 인스턴스변수를 말함.
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calTotal(kor,eng,math);
	}
	
	public void calTotal(int kor,int eng, int math) {
		this.total = kor+eng+math;
		calAvg(kor,eng,math);
	}
	
	public void calAvg(int kor,int eng, int math) {
		int total = kor+eng+math;
		this.avg = total/(double)3.0;
	}
	
	
}
