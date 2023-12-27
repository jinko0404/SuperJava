package org.Super.day03;

import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		if(num3 > num2 || num3 <= num1) System.out.println(true);
		else System.out.println(false);

		sc.close();
	}

}
