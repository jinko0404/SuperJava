package org.Super.day05;

import java.util.Scanner;

import org.Super.day05.Circle;
import org.Super.day05.Rectangle;
import org.Super.day05.Book;
@SuppressWarnings("unused")

public class Run {
	
	public static void main(String[] args) {
		Book book1 = new Book("난중일기", "이순신");
		System.out.println( book1.title + "의 저자는 " + book1.author +" 이다.");
		
		Book book2 = new Book();
		book2.title = "춘향전";
		book2.author = "작가 미상";
		System.out.println( book2.title + "의 저자는 " + book2.author +" 이다.");
		Book book3 = new Book("홍길동전");
		book3.author = "작가 미상";
		System.out.println( book3.title + "의 저자는 " + book3.author +" 이다.");
		
		
		Scanner sc = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		System.out.print("너비 입력 : ");
		rect.height = sc.nextInt();
		System.out.print("높이 입력 : ");
		rect.width = sc.nextInt();
		int result = rect.getArea();
		System.out.println("사각형의 넓이은 " + result + "입니다.");
		
		
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "빅스타 피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area);
		
		sc.close();
	}

}
