package org.Super.day01;

import java.util.Scanner;//입력을 받을 수 있게 해주는 클래스, 클래스를 사용하기 위해선 import을 통해 선언해야한다.
//import가 없이 다른 패키지 안의 클래스를 사용하기 위해서는 사용할 때 마다 매번 클래스 이름 앞에 패키지 이름을 붙여야 한다.

public class Exam_ScannerTest {

	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하시오.");
		Scanner sc = new Scanner(System.in); //클래스를 통해 객체(인스턴스)를 생성한다.
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean SingleYN = sc.nextBoolean();
		
		
		if(SingleYN == true) System.out.println("이름은 " + name + ", 도시는 " + city + ", 나이는 " + age + "세" + ", 체중은 " + weight + "kg" + "이며 독신입니다.");
		else System.out.println("이름은 " + name + ", 도시는 " + city + ", 나이는 " + age + "세" + ", 체중은 " + weight + "kg" + "이며 기혼입니다.");

		sc.close();
	}

}
