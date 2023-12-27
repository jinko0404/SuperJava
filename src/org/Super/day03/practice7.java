package org.Super.day03;

import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double avg = (double)sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n",avg);
		if(korean >= 40 && english >= 40 && math >= 40 && avg >= 60) {
			System.out.println("합격");
		}
		else System.out.println("불합격");
		sc.close();
	}

}
