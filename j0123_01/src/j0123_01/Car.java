package j0123_01;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",5);	//this:생성자에서 다른 생성자를 호출(this)
//		this.color = "white";
//		this.gearType = "auto";
//		this.door = 5;
	}	//기본생성자
	
	Car(String color) {
		this.color = color;
	}
	
	Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
