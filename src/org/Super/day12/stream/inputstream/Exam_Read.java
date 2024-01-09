package org.Super.day12.stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Exam_Read {
	public static void main(String[] args) {
		InputStream is = null;
		
		try {//예외처리를 해주는 메소드
			is = new FileInputStream("src/org/Super/day12/stream/inputstream/reading.txt");//예외처리를 강제하고 있다.
			int readByte;
			do {
				readByte = is.read();
				System.out.print((char)readByte);
			}while(readByte != -1);
			
//			while(true) {
//				readByte= is.read(); //read메소드도 예외처리를 강제하고 있다, 한 바이트씩 읽어서 출력하는 메소드 read()
//				if(readByte == -1) break;
//				System.out.print((char)readByte);	
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}


















