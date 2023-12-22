package org.Super.day01;

import java.util.Scanner;

public class Exam_Triple {

	public static void main(String[] args) {
		//삼항연산자
		//(조건식)? 참 : 거짓
		//-조건식은 반드시 true/false로 반환
		//-비교/논리 연산자 주로 사용
		
		//정수를 입력받아 홀수인지 짝수인지 판별하는 프로그램을 작성하시오
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한개 입력 : ");
		int num = sc.nextInt();
		
		boolean result = ((num % 2) == 0)? true : false;
		
		if(result)
			System.out.print("짝수");
		else
			System.out.print("홀수");
		
	}

}
