package j0127_01;

public class Singleton {
	//생성자 생성막고 하나로 사용
	private static Singleton s = new Singleton();
	private int num;
	
	private Singleton() {}
	
	// 클래스메소드 : 객체선언없이 클래스명.메소드명
	public static Singleton getInstance() {
		return s;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}
