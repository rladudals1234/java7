package j0127_01;

public class Stuscore {
	{
		count++;
		no = count;
	}
	
	static int count;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	//생성자 - 초기화메소드
	//생성자는 클래스명 같음,리턴X,voidX
	Stuscore() {}

	public Stuscore(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calTotal(kor,eng,math);
	}
	
	void calTotal(int kor, int eng, int math) {
		this.total = kor+eng+math;
		calAvg(kor,eng,math);
	}
	
	void calAvg(int kor, int eng, int math) {
		this.avg = (kor+eng+math)/(double)3.0;
	}
	
	void calAvg(int total) {
		this.avg = total/(double)3.0;
	}
}
