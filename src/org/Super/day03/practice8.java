package org.Super.day03;

import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String socialNum = sc.next();
		
		if(socialNum.charAt(7) == '2' || socialNum.charAt(7) == '4') {
			System.out.println("여자");
		}
		else if(socialNum.charAt(7) == '1' || socialNum.charAt(7) == '3') {
			System.out.println("남자");
		}
		else System.out.println("오류");
		sc.close();
	}
}
