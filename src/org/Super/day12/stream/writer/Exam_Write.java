package org.Super.day12.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_Write {

	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/org/Super/day12/stream/writer/writing.txt");
			char[] data = "Java/Oracle/JDB".toCharArray();//문자 기반 스트림이기 때문에 byte배열이 아니라 char배열을 쓴다.
			for(int i = 0; i < data.length; i++) {
				writer.write(data[i]);//예외처리가 강제되지않는다.				
			}
			writer.flush();//버퍼를 비워줘야 파일이 써진다.
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
