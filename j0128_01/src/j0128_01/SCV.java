package j0128_01;

public class SCV extends GroundUnit implements Repairable {
	SCV(){
		super(60);
		hitPoint = MAX_UP;
	}
	
	void repair(Repairable r) {	//GroundUnit이면 기계가 아닌것도 수리됨
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_UP) {
				u.hitPoint++;
			}
		}
	}
}
