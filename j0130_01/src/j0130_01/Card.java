package j0130_01;

public class Card {
	int number;
	String kind;
	
	Card(){}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	@Override	//주석(어노테이션) 원래는 아무기능 없음 (스프링에서는 함수처럼 기능 추가되어있음)
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
