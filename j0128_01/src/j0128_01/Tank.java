package j0128_01;

public class Tank extends GroundUnit implements Repairable {
	Tank() {
		super(150);
		hitPoint = MAX_UP;
	}
}
