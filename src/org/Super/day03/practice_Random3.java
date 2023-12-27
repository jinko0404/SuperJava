package org.Super.day03;

import java.util.Random;
import java.util.Scanner;

public class practice_Random3 {

	static int score = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			Random random = new Random();
			System.out.print("UP & DOWN Game\n\n");
		
			System.out.println("1.Game Start");
			System.out.println("2.Game Score");
			System.out.println("3.End Game");

			int choice = sc.nextInt();
		
			if(choice == 1) {
				System.out.println("<< Game Start >>");
				int comNum = random.nextInt(99) + 1;
				while(true) {
					System.out.print("Input Number : ");
					int answer = sc.nextInt();
				
					if(comNum == answer) {
						System.out.println("<< 정답! >>");
						score++;
						break;
					}
					else if(comNum > answer) {
						System.out.println("<< U P >>");
					}
					else {
						System.out.println("<< D O W N >>");
					}
				}
			}
			else if(choice == 2) {
				System.out.println("<< 당신의 점수 >>");
				System.out.println(score + "점");
				
			}
			else if(choice == 3) {
				System.out.println("<< 게 임 종 료 >>");
				break;
			}
		}
		sc.close();

	}

}
