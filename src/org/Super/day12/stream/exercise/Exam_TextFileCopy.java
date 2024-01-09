package org.Super.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Exam_TextFileCopy {

	public static void main(String[] args) {
		//c:\windows\system.ini을 복사해서
		//D:tempworkspace\system.txt로 만들어라 단, 문자기반스트림 이용
		
		Reader reader = null;
		Writer writer = null;
		String src = "c:\\windows\\system.ini";
		String dest = "D:tempworkspace\\system.txt";
		//파일 경로와 같은 것들은 변수 안에 넣어서 사용하면
		//코드의 가독성이 좋아진다.
		//flush() 메소드는 출력 스트림을 비우고, 아직 버퍼에 있는 모든 데이터를 목적지로 전송하는 역할을 합니다.
		try {
			reader = new FileReader(src);
			writer = new FileWriter(dest);
			char[] cBuf = new char[3];
			int readCharCount;
			String result = "";
			while((readCharCount = reader.read(cBuf)) != -1) {
				result += new String(cBuf, 0, readCharCount);
			}
			writer.write(result);
			writer.flush();
			System.out.println("파일 작성 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



















