package org.Super.day03;

import java.util.Scanner;

public class practice4 {

	public static void main(String[] args) {
//		모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입
//		력 받고 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하
//		세요.
//
//		ex.
//		인원 수 : 29
//		사탕 개수 : 100
//		1인당 사탕 개수 : 3
//		남는 사탕 개수 : 13
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int peopleNum = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		System.out.println("1인당 사탕 개수 : " + (candy / peopleNum));
		System.out.println("남는 사탕 개수 : " + (candy % peopleNum));

		sc.close();

	}

}
