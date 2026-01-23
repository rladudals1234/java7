package j0122_01;

import java.util.Scanner;

public class C09 {
	
	static Scanner scanner = new Scanner(System.in);	//인스턴스 변수 - 객체선언후 참조변수명. 변수명
	static int[] stuInput() {
		int[] score = new int[3];		//대신에 매개변수로 Stuscore 객체받아서 진행가능
		System.out.print("국어점수를 입력하세요.>> ");
		score[0] = scanner.nextInt();
		System.out.print("영어점수를 입력하세요.>> ");
		score[1] = scanner.nextInt();
		System.out.print("수학점수를 입력하세요.>> ");
		score[2] = scanner.nextInt();
		return score;
	}
	public static void main(String[] args) {
		//객체선언
		//MainMethod m = new MainMethod();
		
		//Stuscore[] stuArr = new Stuscore[3];
		//m.stuInput(stuArr);
		//m.stuOutput(stuArr);
		
		int[] score = stuInput();
		System.out.printf("국어점수:%d,영어점수:%d,수학점수:%d\n",score[0],score[1],score[2]);
	}

}
