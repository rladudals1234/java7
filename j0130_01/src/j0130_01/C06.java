package j0130_01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class C06 {

	public static void main(String[] args) {
		byte[] b = new byte[1024];
		String filePath = "C:/down/aaa.txt";
		
		//파일과 연결통로생성
//		FileInputStream fis = new FileInputStream(filePath);
//		int read = 0;
//		//파일을 읽어옴.
//		while((read=fis.read())!=-1) {
//			//파일을 출력
//			System.out.print((char)read);
//		}
//		fis.close();
		
		/*try {
			FileInputStream fis = new FileInputStream(filePath);
			fis.read(b);
			System.out.println(new String(b));
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		// 문서파일읽어오기 - BufferedReader 객체를 사용해서 진행함.
		//2byte씩 읽어와서 느림
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String line = br.readLine();	//1줄씩 읽어오기
				if(line==null) break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
