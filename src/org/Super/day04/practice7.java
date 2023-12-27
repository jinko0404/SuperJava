package org.Super.day04;

import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int size = sc.nextInt();
		
		int numArr[] = new int[size];
		int sum = 0;
		
		for(int i = 0; i < size; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			numArr[i] = sc.nextInt();
			sum += numArr[i];
		}
		for(int i = 0; i < size; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println("\n총합 : " + sum);
		sc.close();
	}

}
