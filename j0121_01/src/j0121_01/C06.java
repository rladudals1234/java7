package j0121_01;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class C06 {

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요.");
//		int num = scanner.nextInt();
//		System.out.println("입력 : "+num);
//		scanner.close();
		
		//scanner없이 실행해야 됨.
		String num2 = JOptionPane.showInputDialog("숫자를 입력하세요.");
		System.out.println("입력2 : "+num2);
	}

}
