package j0127_02;

public class Stuscore {
	{
		count++;
		no = count;
	}
	static int count;
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	Stuscore() {}
	
	Stuscore(String name, int kor, int eng, int math) {
		this.no = ++count;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setTotal(kor,eng,math);
		setAvg(kor,eng,math);
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
		setTotal(this.kor,this.eng,this.math);
		setAvg(this.kor,this.eng,this.math);
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		setTotal(this.kor,this.eng,this.math);
		setAvg(this.kor,this.eng,this.math);
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		setTotal(this.kor,this.eng,this.math);
		setAvg(this.kor,this.eng,this.math);
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	public void setTotal(int kor, int eng, int math) {
		this.total = kor+eng+math;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public void setAvg(int kor, int eng, int math) {
		this.avg = (kor+eng+math)/(double)3.0;
	}
}
