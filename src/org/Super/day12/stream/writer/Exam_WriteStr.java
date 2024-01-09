package org.Super.day12.stream.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam_WriteStr {

	public static void main(String[] args) {
		Writer writer = null;
		
		try {
			writer = new FileWriter("src/org/Super/day12/stream/writer/writing3.txt");
			String data = "JDBC/JSP/Servlet";
			writer.write(data);//char형 배열 쓸 필요 없이 String으로 간단히 구현 가능
			writer.flush();
			System.out.println("파일 쓰기 완료");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
