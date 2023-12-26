package org.Super.day03;

import java.util.Scanner;

public class Exercise_Array {

	public static void main(String[] args) {
		int intArr[] = new int[4];
		int sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력해주세요 : ");
			intArr[i] = sc.nextInt();
		}
		
		sum = 0;
		for(int i = 0; i < intArr.length; i++) {
				sum += intArr[i];
		}
		avg = (double)sum / (double)intArr.length;
		System.out.println("배열의 평균은 " + avg);
		
		sc.close();
	}
}
