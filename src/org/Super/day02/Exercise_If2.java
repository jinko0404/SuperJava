package org.Super.day02;

import java.util.Scanner;

public class Exercise_If2 {

	public static void main(String[] args) {
		//커피 메뉴를 입력받고 가격을 알려주는 프로그램 작성
		//주문하시겠어요? 가격을 알려드립니다.
		//에스프레소, 카푸치노, 카페라떼, 아메리카노
		//메뉴를 입력해주세요 : 에스프레소
		//2500원 입니다.
		
		//메뉴를 입력해주세요 : 큐브라떼
		//없는 메뉴 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문하시겠어요? 가격을 알려드립니다.");
		System.out.println("(에스프레소, 카푸치노, 카페라데, 아메리카노)");
		System.out.print("메뉴를 입력해주세요 : ");
		String manu = sc.next();
		
		int price;
		//문자열 비교는 ==등의 비교식이 아닌 [문자열 변수].equals([비교할 문자열])와 같은 함수로 비교한다.
		switch(manu) {
			case "에스프레소" : price = 2500;
			break;
			case "카푸치노" : price = 3000;
			break;
			case "카페라데" : price = 3500;
			break;
			case "아메리카노" : price = 1500;
			break;
			default : price = 0;
			break;
		}
		
		if(price != 0)
			System.out.println(price + "원 입니다.");
		else System.out.println("없는 메뉴 입니다.");
		
		sc.close();
	}
}
