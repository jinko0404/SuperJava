package org.Super.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_ReadByte {

	public static void main(String[] args) {
		InputStream is = null;//inputStream은 추상 클래스이기 때문에 객체를 단독으로 생성할 수 없다.
		
		try {
			is = new FileInputStream("src/org/Super/day12/stream/inputstream/reading.txt");
			int readByteCount;
			byte[] readBytes = new byte[3];
			String result = "";
			while(true) {
				readByteCount = is.read(readBytes);
				if(readByteCount == -1) break;
				//바이트 배열과 갯수를 넘겨주면 문자열로 만들어주는 String 생성자를 통해 문자열을 만든다.
				//String(byte[] bytes, int offset, int length)
				//읽는 데이터가 누적될 수 있도록 +=로 만들어준다.
				//복합 대입연산자 사용
				result += new String(readBytes, 0, readByteCount);
			}
			System.out.println(result);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}




