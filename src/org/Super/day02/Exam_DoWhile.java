package org.Super.day02;

public class Exam_DoWhile {

	public static void main(String[] args) {
		int i = 0;
		
		do {
			System.out.println(i);
			i++;
		}while(i > 10);//조건이 거짓이여도 무조건 한번은 실행한다.
		//실행문을 먼저 실행시키고 조건을 따져 더 반복할지 안할지 판단한다.

	}

}
