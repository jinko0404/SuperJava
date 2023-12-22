package org.Super.day01;

public class Exam_Variable {
	
	public static void main(String[] args) {
		//변수는 프로그램 실행 중 데이터를 저장하기 위한 임시 저장 공간이다.
		//자료형(타입)에 맞지 않은 데이터를 변수에 할당 시 오류가 난다. - Type mismatch : cannot convert from A to B
		//자료형(타입)정하고 그에 알맞은 데이터를 할당해서 초기화 시켜야한다.
		//자료형(타입)의 크기와 형태에 따라 자료형의 종류가 나뉜다.
		//숫자(정수, 실수), 문자, 문자열
		int aInt = 1;
		double aDouble = 0.1;
		char b = 'B';
		String c = "Hello";
		
		//변수로 값을 할당하면 언제든지 변수를 통해 할당된 값을 쓸 수 있다.
		System.out.println(aInt);
		System.out.println(aDouble);
		System.out.println(b);
		System.out.println(c);
	}

}
