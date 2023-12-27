package org.Super.day04;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		char day[] = {'월', '화', '수', '목', '금', '토', '일'};
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int i = sc.nextInt();

		if(i >= 0 && i <= 6) {
			System.out.println(day[i] + "요일");
		}
		else System.out.println("잘못 입력하셨습니다.");
		sc.close();
	}
}
