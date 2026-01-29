package j0129_01;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class C06 {

	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("c:/down/aaa.txt");
			int data = 0;
			while((data = fr.read()) != -1) {	//readLine로 한줄씩 읽어오는것과 다르게 2byte씩 읽어옴.
				//2byte 1단어
				System.out.print((char)data);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
