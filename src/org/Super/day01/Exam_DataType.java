package org.Super.day01;

public class Exam_DataType {

	public static void main(String[] args) {
		//1. 기본형(기본 타입)
		//정수, 실수, 문자, 문자열, 불린형
		//정수형 4가지(byte, short, int, long) - 각각 1, 2, 4, 8 바이트
		//실수형 2가지(float, double) - 각각 4, 8 바이트
		//문자형 char - 2바이트
		//불린형 boolean - 1바이트
		//2. 참조형(레퍼런스 타입)
		//문자열 String
		
		boolean result = true;
		char fChar = 'a';
		
		System.out.println(result);
		System.out.println(fChar);
		
		//실수part
		float fNum = 23.026f;
		double dNum = 23.026; //float는 값 할당시 끝에 f or F를 붙여야해서 불편하기에 double을 더 자주 쓴다.
		System.out.println(fNum);
		System.out.println(dNum);
		
		//정수part
		byte bNum = 127;//1바이트
		short sNum = 32767;//2바이트
		int iNum = 2147483647;//4바이트
		long lNum = 2147483648L;//8바이트,long도 값 할당시 끝에 l or L을 써야하기에 불편해서 크기는 더 커도 int형이
		//더 자주 쓰인다.
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
	}
}











