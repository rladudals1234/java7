package j0127_01;	//패키지-없으면 에러, 없으면 자동으로 부여(컴파일시)

//Object상속 자동으로 부여(컴파일시)
public class C05 {

	//기본생성자 - 없으면 에러, 없으면 자동으로 부여(컴파일시)
	C05(){
		super();	//조상의 생성자 호출 - 없으면 에러, 없으면 자동으로 부여(컴파일시)
	}
	
	public static void main(String[] args) {
		Stuscore s1 = new Stuscore("홍길동",100,100,99);
	}

}
