package j0129_01;

public class Stuscore {
	{
		count++;
		no = count;
	}

	static int count;
	private int no;		//private 클래스안에만 사용가능
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	//String[] aa = new String[5];
	
	@Override
	public boolean equals(Object obj) {		//C07테스트
		Stuscore s = (Stuscore)obj;
		if(this.name==s.getName()) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {	//C04 테스트
		return String.format("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n", no,name,kor,eng,math,total,avg);
	}
	
	Stuscore(){}
	
	Stuscore(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		calTotal(kor, eng, math);
		calAvg(kor, eng, math);
	}
	
	void calTotal() {
		this.total = this.kor + this.eng + this.math;
		calAvg();
	}
	
	void calTotal(int kor, int eng, int math) {
		this.total = kor + eng + math;
	}
	
	void calAvg() {
		this.avg = this.total / (double)3.0;
	}
	
	void calAvg(int total) {
		this.avg = total / (double)3.0;
	}
	
	void calAvg(int kor, int eng, int math) {
		this.avg = (kor + eng + math) / (double)3.0;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		calTotal();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		calTotal();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		calTotal();
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
}
