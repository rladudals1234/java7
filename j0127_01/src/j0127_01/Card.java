package j0127_01;

public class Card extends Object {
	static final int KIND_NUM = 4;
	String kind;	//SPADE, HEART, DIAMOND, CLOVER
	int number;		//1-13
	String[] num = {"0","A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	Card(){
		super();
	}
	
	Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	@Override		//Object클래스에 있는 11개 메소드 중에 1개임.(Object는 최상위로 무조건 붙어서 extends Object 생략가능)
	public String toString() {
		return String.format("[ %s,%s ]", kind, num[number]);
	}
}
