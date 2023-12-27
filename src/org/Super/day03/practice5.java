package org.Super.day03;

import java.util.Scanner;

public class practice5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("이름 : " + name);
		int grade = sc.nextInt();
		System.out.println("학년(숫자만) : " + grade);
		int classNum = sc.nextInt();
		System.out.println("반(숫자만) : " + classNum);
		int num = sc.nextInt();
		System.out.println("번호(숫자만) : " + num);
		char gender1 = sc.next().charAt(0);
		String gender2;
		if (gender1 == 'M') gender2 = "남학생";
		else gender2 = "여학생";
		System.out.println("성별(M/F) : " + gender2);
		double score = sc.nextDouble();
		System.out.println("성적(소수점 아래 둘째자리까지) : " + score);
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, classNum, num, name, gender2, score);
		sc.close();
	}

}
