package org.Super.day02;

import java.util.Scanner;

public class Exercise_If1 {

	public static void main(String[] args) {
		//점수와 학년을 입력받아 60점 이상이면 합격
		//미만 이면 불합격
		//단, 4학년의 경우 70점 이상 합격
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오.(0 ~ 100)");
		int score = sc.nextInt();
		
		System.out.print("학년을 입력하시오.(1 ~ 4)");
		int grade = sc.nextInt();
		
		if(grade < 4 && score >= 60) {
				System.out.println("합격");
		}
		else if(grade == 4 && score >= 70){
				System.out.println("합격");
		}
		else System.out.println("불합격");
			
		sc.close();
	}

}
