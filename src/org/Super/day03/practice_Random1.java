package org.Super.day03;
import java.util.Random;
import java.util.Scanner;

public class practice_Random1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 선택하세요(1.가위 / 2.바위 / 3.보) : ");
		int play = sc.nextInt();
		String player = "오류";
		if(play == 1) player = "가위";
		else if(play == 2) player = "바위";
		else if(play == 3) player = "보";
		Random random = new Random();
		int rand = random.nextInt(3);
		String computer = "오류";
		if(rand == 0) computer = "가위";
		else if(rand == 1) computer = "바위";
		else if(rand == 2) computer = "보";
		System.out.println("당신은 " + player + "를 냈습니다.");
		System.out.println("컴퓨터는 " + computer + "를 냈습니다.");
		if((player == "가위" && computer == "보") || (player == "바위" && computer == "가위") || (player == "보" && computer == "바위"))
			System.out.println("당신이 이겼습니다.");
		else if((player == "가위" && computer == "바위") || (player == "바위" && computer == "보") || (player == "보" && computer == "가위"))
			System.out.println("당신이 졌습니다.");
		else if(player == computer && player != "오류") System.out.println("서로 비겼습니다.");
		else System.out.println("오류!");
		sc.close();
	}
}
