package org.Super.day03;

import java.util.Random;
import java.util.Scanner;

public class practice_Random4 {

	static int win = 0;
	static int lose = 0;
	static int draw = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			Random random = new Random();
			System.out.print("Dice Game\n\n");
		
			System.out.println("1.Game Start");
			System.out.println("2.Game Score");
			System.out.println("3.End Game");

			int choice = sc.nextInt();
		
			if(choice == 1) {
				System.out.print("지불할 판돈 금액을 입력하시오(단위 : 원) : ");
				int money = sc.nextInt();
				System.out.println("<< Game Start >>");
				while(money > 0) {
					int player = 0;
					int computer = 0;
					int dice;
					char bChoice;
					int betting;
					for(int i = 0; i < 3 ;i++) {
						dice = random.nextInt(6) + 1;
						player += dice;
					}
					for(int i = 0; i < 3 ;i++) {
						dice = random.nextInt(6) + 1;
						computer += dice;
					}
					System.out.println("당신의 주사위의 합 : " + player);
					System.out.print("배팅하시겠습니까?(y/n) : ");
					bChoice = sc.next().charAt(0);
					if(bChoice == 'y') {
						System.out.print("배팅금액을 설정해주세요 : ");
						betting = sc.nextInt();
						if(computer > player) {
							System.out.println("패배! 배팅금을 잃습니다.");
							lose++;
							money -= betting;
						}
						else if(computer < player) {
							System.out.println("승리!");
							win++;
						}
						else {
							System.out.println("무승부!");
							draw++;
						}
					}
					else if(bChoice == 'n') {
						System.out.println("배팅하지 않습니다. 다음 게임으로 넘어갑니다.");
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
