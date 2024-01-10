package org.Super.day13.file;

import java.io.*;

public class Exam_ShowFileList {

	public static void main(String[] args) {
		File file = new File("C:\\windows");
		System.out.println("--------" + file.getPath() + "의 서브 리스트입니다. --------");
		File[] subList = file.listFiles();
		
		for(int i = 0; i < subList.length; i++) {
			File fOne = subList[i];
			long time = fOne.lastModified();
			String fileName = fOne.getName();
			long fileSize = fOne.length();
			
			System.out.printf("%-35s",fileName);
			System.out.print("파일 크기 : " + fileSize + "\t");
			System.out.printf("\t수정한 시간 : %3tb %-2td일 %ta %tT\n", time, time, time, time);
			//%tb : 현재 날짜를 영문 약자(월) 형식으로 출력(숫자 + 월)
			//%td : 현재 날짜를 01 ~ 31(일) 형식으로 출력
			//%ta : 현재 날짜를 요일 영문 약자 형식으로 출력(월/화/수/목/금/토/일)
			//%tT : 현재 시간을 시:분:초 형식으로 출력
		}
	}

}
