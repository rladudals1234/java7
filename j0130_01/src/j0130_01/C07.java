package j0130_01;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class C07 {

	public static void main(String[] args) {
		String filePath = "C:/down/aaa1.txt";
		try {
			//FileWriter에서 true 설정안되면 덮어쓰기, true:이어쓰기
			//FileWriter fw = new FileWriter(filePath);
			FileWriter fw = new FileWriter(filePath,true);
			BufferedWriter bw = new BufferedWriter(fw);
			String txt = "hello world!!\r\n";	//\r:줄에 제일 끝으로 이동, \n:줄바꿈
			bw.write(txt);
			bw.close();
			fw.close();
			System.out.println("파일저장완료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
