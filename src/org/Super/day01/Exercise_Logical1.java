package org.Super.day01;

import java.util.Scanner;

public class Exercise_Logical1 {

	public static void main(String[] args) {
		//입력한 정수가 1 ~ 100 사이의 숫자인지 확인하시오
		//1 ~ 100 사이의 숫자를 입력하세요 : 32
		//1 부터 100사이의 숫자인가?
		System.out.print("1 ~ 100 사이의 숫자를 입력하세요 : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		boolean result = (num >= 1) && (num <= 100);
		
		System.out.println("1부터 100사이의 숫자인가? " + result);

	}

}
