package j0126_02;

public class Stuscore {
	{	//초기화 블럭
		count++;
		no = count;
	}
	
	Stuscore(){}
	
	Stuscore(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calTotal(kor,eng,math);
	}
	
	void calTotal(int kor,int eng, int math) {
		this.total = kor+eng+math;
		calAvg(kor,eng,math);
	}
	
	void calAvg(int kor,int eng, int math) {
		this.avg = kor+eng+avg/(double)3.0;
	}
	
	static int count = 0;
	int no;
	String name;
	int kor,eng,math,total;
	double avg;
}
