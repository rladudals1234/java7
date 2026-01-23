package j0122_01;

public class C04 {

	public static void main(String[] args) {
		//배열
		Stuscore[] sArr = new Stuscore[10];
		//객체선언
		sArr[0] = new Stuscore();
		sArr[0].setNo(sArr[0].count+1);
		sArr[1] = new Stuscore();
		
		//객체선언
		Stuscore s = new Stuscore();
		s.setNo(Stuscore.count+1);
		s.setName("홍길동");
		s.setKor(100);
		s.setEng(100);
		s.setMath(99);
		Stuscore.count++;
		
		Stuscore s2 = new Stuscore();
		s2.setNo(Stuscore.count+1);
		s2.setName("유관순");
		s2.setKor(90);
		s2.setEng(90);
		s2.setMath(91);
		
		System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n",s.getNo(),s.getName(),s.getKor(),s.getEng(),s.getMath(),s.getTotal(),s.getAvg());
		System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n",s2.getNo(),s2.getName(),s2.getKor(),s2.getEng(),s2.getMath(),s2.getTotal(),s2.getAvg());
	}

}
