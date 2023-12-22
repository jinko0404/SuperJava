package org.Super.day02;

import java.util.Scanner;

public class Exercise_For2 {

	public static void main(String[] args) {
		//  정수하나 입력받고 그 수가 1 ~ 9일 때만 그 수의 구구단을 출력해라
		//단, 조건이 맞지 않으면 "1 ~ 9 사이의 양수를 입력해야 합니다"라고 출력해라

		Scanner sc = new Scanner(System.in);
		
		System.out.print("1 ~ 9 사이의 수를 입력하시오 : ");
		int col = sc.nextInt();
		int answer;
		
		if(col >= 1 && col <= 9) {
			for(int i = 1; i <= 9; i++) {
				answer = col * i;
				System.out.println(col + " X " + i + " = " + answer);
			}
		}
		else System.out.println("1 ~ 9 사이의 양수를 입력해야 합니다.");
		
		sc.close();
	}

}
