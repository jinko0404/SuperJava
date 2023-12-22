package org.Super.day01;

import java.util.Scanner;

public class ArithmeticOperator {//초 단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초인지 출력하는 프로그램

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		int minute = (num / 60) % 60;
		int hour = (num / 60) / 60;
		int second = num % 60;
		
		System.out.println(num + "초는 " +hour + "시간 " + minute + "분 " + second + "초 입니다.");
		
		sc.close();
	}
}
