package j0123_01;

public class C07 {

	public static void main(String[] args) {
		Stuscore[] s = new Stuscore[10];
		s[0] = new Stuscore("홍길동",100,100,99);
		s[1] = new Stuscore("유관순",90,90,91);
		s[2] = new Stuscore("이순신",80,80,85);
		s[3] = new Stuscore();	//기본생성자에 count추가필요로 추가(초기화블럭)
		s[3].name="강감찬";
		s[3].kor=100;
		s[3].eng=100;
		s[3].math=100;
		s[3].total=s[3].kor+s[3].eng+s[3].math;
		s[3].avg=s[3].total/3;
		for(int i=0;i<Stuscore.count-1;i++) {
			System.out.printf("%d,%s,%d,%d,%d,%d,%.2f\n",s[i].no,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
		}
	}

}
