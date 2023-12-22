package org.Super.day02;

import java.util.Scanner;

public class Exercise_While1 {

	public static void main(String[] args) {
		// WHILE문 이용해 -1이 입력될 때 까지 정수 입력 받고 -1 입력받으면 입력한 수의 함 구하라
		
		int sum = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		while(num != -1) {
			num = sc.nextInt();
			if(num > 0) {
				sum += num;
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
