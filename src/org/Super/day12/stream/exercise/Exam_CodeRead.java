package org.Super.day12.stream.exercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam_CodeRead {

	public static void main(String[] args) {
		//Exam_FileCopy.java 파일을 읽어서 콘솔에 출력해보세요!
		Reader reader = null;
		
		try {
			reader = new FileReader("src/org/Super/day12/stream/exercise/Exam_FileCopy.java");
			char[] cBuf = new char[3];
			String result = "";
			int readCharCount;
			while((readCharCount = reader.read(cBuf)) != -1) {
				result += new String(cBuf, 0, readCharCount);
			}
			System.out.println(result);
			System.out.println("코드출력 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
