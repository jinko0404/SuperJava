package org.Super.day03;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
//		나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지,
//		성인(19세 초과)인지 출력하세요.
//
//		ex.
//		나이 : 19
//
//		청소년
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		String status;
		
		if (age <= 13) status = "어린이";
		else if(13 < age && 19 >= age) status = "청소년";
		else if(19 < age) status = "성인";
		else status = "오류";
		System.out.println(status);
		
		sc.close();
	}
}
