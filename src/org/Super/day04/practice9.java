package org.Super.day04;

import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Chicken[] = {"양념", "뿌링클", "고추바사삭", "스노윙", "불닭", "파닭"};
		Boolean Check = false;
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String Chicken_name = sc.next();
		
		for(int i = 0; i < Chicken.length; i++) {
			if(Chicken[i].equals(Chicken_name)) {
				Check = true;
				System.out.println(Chicken_name + "치킨 배달 가능");
			}
		}
		if(Check == false) {
			System.out.println(Chicken_name + "치킨은 없는 메뉴입니다.");
		}
		sc.close();

	}

}
