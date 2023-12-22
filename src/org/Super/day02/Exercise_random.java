package org.Super.day02;

import java.util.Random;
import java.util.Scanner;

public class Exercise_random {

	public static void main(String[] args) {
		// 동전 앞뒤 맞추기
		//==============================동전 앞/뒤 맞추기================================
		//숫자를 입력해주세요(1. 앞면/2. 뒷면) : 1
		//맞췄습니다 !
		
		Random rand = new Random();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			int coin = rand.nextInt(2) + 1;
			
			System.out.println("==============================동전 앞/뒤 맞추기==============================");
			System.out.print("숫자를 입력해주세요(1. 앞면/2. 뒷면/3. 게임종료) : ");
			int answer = sc.nextInt();
			
			if(answer == 1 || answer == 2) {
				if(answer == coin) {
					System.out.println("맞췄습니다 !");
				}
				else System.out.println("틀렸습니다...");
			}
			else if(answer == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			else {
				System.out.println("오류 시스템을 종료합니다.");
				break;
			}
		}
		
		sc.close();
	}

}
