package org.Super.day12.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_WriteByteOff {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("src/org/Super/day12/stream/outputstream/writing3.txt");
			byte[] data = "마지막 입출력".getBytes();//자바에서 한글은 한 글자당 3바이트
			//공백은 1바이트
			os.write(data, 10, 9);//offset은 커스텀 마이징할때 쓰인다.
			//write(byte[] b, int offset, int len);
			os.flush();
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

















