package datareader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class StreamTestYs {

	public static void main(String[] args) throws IOException {
		// 메모장 데이터 읽어오기 실험용으로다가
		FileInputStream fis = new FileInputStream(new File("C:\\dev\\HomeWork\\war.txt"));
		int Korean = fis.available(); 
		byte[] kor = new byte[Korean];
		
		fis.read(kor);
		
		System.out.println(new String(kor));
		System.out.println(new String(kor.toString()));
		System.out.println(kor.toString());
		
		
		fis.close();

	}

}
