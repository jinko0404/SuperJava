package org.Super.day01;

import java.util.Scanner;

public class Exercise_Logical2 {

	public static void main(String[] args) {
		//입력받은 문자가 대문자인지 소문자인지 확인하시오
		//문자를 입력해주세요 : a
		//문자출력 : a
		//영어 대문자 확인 : false
		//영어 소문자 확인 : true
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 입력해주세요 : ");
		String s = sc.next();
		char c = s.charAt(0);
		System.out.println("문자출력 : " + c);
		
		boolean result;
		result = (c >= 65) && (c <= 90);
		System.out.println("대문자 확인 : " + result);
		result = (c >= 97) && (c <= 122);
		System.out.println("소문자 확인 : " + result);
		
		sc.close();
	}

}
