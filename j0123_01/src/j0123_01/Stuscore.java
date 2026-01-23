package j0123_01;

public class Stuscore {
	{	//초기화블럭
		this.no=count+1;
		count++;
	}	//많이 안쓰지만 이런게 있다는 것만 알아두기
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	Stuscore() {}
	
	Stuscore(String name) {
		this.name=name;
	}
	
	Stuscore(String name, int kor){
		this.name = name;
		this.kor = kor;
	}
	
	Stuscore(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/(double)3.0;
	}
	
	Stuscore(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total/(double)3.0;
	}
	
	void cal(int kor, int eng, int math) {
		this.total = kor+eng+math;
		this.avg = this.total/(double)3.0;
	}
	
	static int count=0;	//클래스변수 - 객체선언없이 클래스명.변수명.
	
	
}
