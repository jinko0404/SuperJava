package org.Super.day02;

import java.util.Scanner;

public class Excise_If3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("점수를 입력해주세요 : ");
		int score = sc.nextInt();
		
		char rank;
		
		if(score <= 100 && score >= 0)
		{
			if(score >= 90)
				rank = 'A';
			else if(score >= 80)
				rank = 'B';
			else if(score >= 70)
				rank = 'C';
			else if(score >= 60)
				rank = 'D';
			else
				rank = 'F';
			
			System.out.println("학점은 "+ rank +"입니다.");
		}
		else
			System.out.println("에러");
		
		sc.close();
	}

}
