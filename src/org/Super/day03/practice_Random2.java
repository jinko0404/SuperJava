package org.Super.day03;

import java.util.Random;
import java.util.Scanner;

public class practice_Random2 {

	static int win = 0;
	static int lose = 0;
	static int draw = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			Random random = new Random();
			System.out.print("Baskin Robbins 31 Game\n\n");
		
			System.out.println("1.Game Start");
			System.out.println("2.Game Score");
			System.out.println("3.End Game");

			int choice = sc.nextInt();
		
			if(choice == 1) {
				System.out.println("<< Game Start >>");
				int end = 0;
				int l = 0;
				while(end < 31) {
					System.out.print("Input Number(1 ~ 3) : ");
					int play = sc.nextInt();
					int count = 0;
					for(int i = 1; i <= play;i++) {
						end++;
						if(end == 31) {
							System.out.println(end + "! 나의 패배");
							lose++;
							count++;
							break;
						}
						System.out.println(end + "!");
					}
					if(count == 1) {
						break;
					}
					int computer = random.nextInt(3);
					for(int i = 0; i <= computer + 1;i++) {
						end++;
						if(end == 31) {
							System.out.println(end + "! 나의 승리");
							win++;
							break;
						}
						System.out.println(end + "!");
					}
				}
				
			}
			else if(choice == 2) {
				System.out.println("<< 당신의 전적 >>");
				System.out.println("W I N :" + win);
				System.out.println("L O S E : " + lose);
				System.out.println("D R A W :" + draw);
			}
			else if(choice == 3) {
				System.out.println("<< 게 임 종 료 >>");
				break;
			}
		}
		sc.close();
	}
}
