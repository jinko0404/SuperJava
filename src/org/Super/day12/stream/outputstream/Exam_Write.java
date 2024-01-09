package org.Super.day12.stream.outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Exam_Write {

	public static void main(String[] args) {
		OutputStream os = null;//OutputStream도 추상 클래스이기에 단독 객체 생성 불가
		
		try {
			os = new FileOutputStream("src/org/Super/day12/stream/outputstream/writing.txt");//예외처리 강제
			byte[] data = "헬로우 입출력".getBytes();
			for(int i = 0; i < data.length; i++) {
				os.write(data[i]);//예외처리 강제				
			}
			os.flush();//버퍼를 비워주는 메소드
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}













