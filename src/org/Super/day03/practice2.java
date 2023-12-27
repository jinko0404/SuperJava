package org.Super.day03;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
//		키보드로 입력 받은 하나의 정수가 양수이면 “양수다“,
//		양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
//
//		ex.
//		정수 : -9
//
//		음수다
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num > 0) System.out.println("양수다.");
		else if(num == 0) System.out.println("0이다.");
		else if(num < 0)System.out.println("음수다.");

		sc.close();

	}

}
