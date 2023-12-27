package org.Super.day03;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
//		키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를
//		출력하세요.
//
//		ex.
//		정수 : 5
//
//		홀수다
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) System.out.println("짝수다.");
		else if(num % 2 == 1) System.out.println("홀수다.");

		sc.close();

	}

}
