package j0128_01;

public class C06 {

	public static void main(String[] args) {
		Tank t = new Tank();	//탱크도 기계
		System.out.println("탱크현재체력 : "+t.hitPoint);
		
		//폭탄 -30 줄어듬.
		System.out.println("폭탄 맞음.");
		t.hitPoint -= 30;
		System.out.println("탱크현재체력 : "+t.hitPoint);
		
		SCV s = new SCV();	//SCV도 기계
		System.out.println("탱크 충전중");
		s.repair(t);		//기계만 수리를 해야함.
		System.out.println("탱크현재체력 : "+t.hitPoint);
		
		Marine m = new Marine();	//기계가 아닌 사람
		System.out.println("마린현재체력 : "+m.hitPoint);
		
		//총을 맞음 -10줄어듬.
		System.out.println("총을 맞음.");
		m.hitPoint -= 10;
		System.out.println("마린현재체력 : "+m.hitPoint);
		
		//s.repair(m);		//마린은 기계가 아니어서 수리불가
		//System.out.println("마린현재체력 : "+m.hitPoint);
	}

}
