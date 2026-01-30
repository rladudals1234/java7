package j0130_01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CFileCopy {

	public static void main(String[] args) {
		//파일복사
		File f = new File("C:/down/aaa/nct1.jpg");
		try {
			//파일 읽어오기
			FileInputStream fis = new FileInputStream(f);	//이미지 파일 읽어오기
			//파일 저장하기
			FileOutputStream fos = new FileOutputStream("C:/down/aaa/nct1111.jpg");	//이미지 파일저장
			while(true) {
				int read = fis.read();
				if(read==-1)break;
				fos.write(read);
			}
			fis.close();
			fos.close();
			System.out.println("파일이 복사되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
