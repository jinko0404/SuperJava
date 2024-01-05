package org.Super.day09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise_List1 {

	public static void main(String[] args) {
		//이름을 4개 입력받아 ArrayList에 저장하고 모두 출력한 후 제일 긴 이름을 출력하라
		
		//1. 문자열만 삽입 가능한 ArrayList 컬렉션 생성
		//2. 키보드로부터 4개의 이름을 입력받아 ArrayList에 삽입
		//3. ArrayList에 들어있는 모든 이름 출력
		//4. 가장 긴 이름 출력
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<String>();
		String longName;
		
		for(int i = 0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >> ");
			longName = sc.next();
			list.add(longName);
		}
		longName = list.get(0);
		for(int i = 0; i < list.size() - 1;i++) {
			if(longName.length() < list.get(i + 1).length()) {
				longName = list.get(i + 1);
			}
		}
		System.out.println(longName);
		sc.close();
		

	}

}
