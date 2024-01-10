package org.Super.day13.file;

import java.io.File;
import java.io.IOException;

//import java.io.*;//java.io패키지에 있는 모든 클래스를 사용하겠다.
//SQL의 SELECT * FROM [테이블명] 문법과 비슷하다.

public class Exam_File {

	public static void main(String[] args) {
		File file = new File("D:\\tempworkspace\\copyimg.jpg");
		String fileName = file.getName();
		String path		= file.getPath();
		String parent	= file.getParent();
		System.out.printf("파일이름 : %s\n파일경로 : %s\n부모폴더 : %s\n"
				, fileName, path, parent);
		System.out.printf("파일이 존재하는가? : %b\n파일이 맞는가? : %b\n폴더가 맞는가? : %b\n"
				, file.exists(), file.isFile(), file.isDirectory());
		
		Exam_File exFile = new Exam_File();
		exFile.folderMake();
		exFile.fileMake();
	}
	
	public void folderMake() {
		File folderMake = new File("src/org/Super/day13/file/dday");
		if(!folderMake.exists()) {
			folderMake.mkdir();
			System.out.println("폴더가 만들어졌습니다.");
		}
		else {
			System.out.println("이미 폴더가 존재합니다.");
		}
	}
	
	public void fileMake() {
		
		try {
			File fileMake = new File("src/org/Super/day13/file/d-day.txt");
				
			if(!fileMake.exists()) {
			fileMake.createNewFile();//예외처리 강제 메소드
			System.out.println("파일이 만들어졌습니다.");
			}
			else {
				System.out.println("이미 파일이 존재합니다.");
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

