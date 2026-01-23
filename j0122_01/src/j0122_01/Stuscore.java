package j0122_01;

public class Stuscore {
	static int count = 0;	//클래스변수
	private int no = 0;		//인스턴스변수
	private String name;
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int total = 0;
	private double avg = 0;
	
	public Stuscore() {
		super();
	}
	
	public Stuscore(Stuscore other) {
		this.no = other.no;
		this.name = other.name;
		this.kor = other.kor;
		this.eng = other.eng;
		this.math = other.math;
		this.total = other.total;
		this.avg = other.avg;
    }

	public Stuscore(int no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.avg = this.total / (double)3.0;
	}
	
	public void calTotal() {
		this.total = this.kor + this.eng + this.math;
		calAvg();
	}
	
	public void calAvg() {
		this.avg = this.total/(double)3.0;
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
