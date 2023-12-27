package org.Super.day04;

import java.util.Scanner;

public class practice5 {

	public static void main(String[] args) {
		String str;
		char c;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		str = sc.next();
		System.out.print("문자 : ");
		c = sc.next().charAt(0);
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, c);
		for(int i = 0 ; i < str.length(); i++) {
			if(str.charAt(i) == c) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n" + c + "의 개수 : " + count);
		sc.close();
	}
}
