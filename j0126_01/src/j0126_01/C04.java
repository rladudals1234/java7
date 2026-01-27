package j0126_01;

public class C04 {

	public static void main(String[] args) {
		//객체선언 : 다른클래스를 다른클래스내에 사용하려면 객체선언
//		Circle c = new Circle();
//		c.x = 0;
//		c.y = 0;
//		c.r = 10;
//		
//		Circle2 cc = new Circle2(0,0,10);
//		System.out.println(cc.x);
//		System.out.println(cc.y);
//		System.out.println(cc.r);
//		
//		Circle3 ccc = new Circle3();
//		ccc.p.x = 0;
//		ccc.p.y = 0;
//		ccc.r = 10;
		
		// 삼각형을 그리려면 점이 몇개 필요할까요? 3개
		// 점 3개 -> Point 몇개 필요할까요? 3개
		
		
		//Triangle t1 = new Triangle(new Point[3]);
//		Point p1 = new Point(0,0);
//		Point p2 = new Point(10,0);
//		Point p3 = new Point(0,10);
//		Triangle t1 = new Triangle(p1,p2,p3);
//		t1.draw();
//		Point[] p = {p1,p2,p3};
//		Triangle t2 = new Triangle(p);
//		t2.draw();
//		Triangle t3 = new Triangle(new Point(0,0), new Point(10,0), new Point(0,10));
//		t3.draw();
		
		//원 그림 점과 반지름이 있으면 그림이 생성
		Ci c1 = new Ci();
		c1.draw();		//상속받은 변수, 메소드는 바로 사용가능
		
		//Point p = new Point(5,5);
		//Ci c2 = new Ci(p,50);
		Ci c2 = new Ci(new Point(5,5),50);
		c2.draw();
	}

}
