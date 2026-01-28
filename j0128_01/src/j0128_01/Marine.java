package j0128_01;

public class Marine extends GroundUnit {
	Marine() {
		super(40);
		//MAX_UP = 40;	//final이라서 안됨
		hitPoint = MAX_UP;
	}
}
