package org.Super.day08.oop;

class Weapon {
	public Weapon() {}
	public Weapon(int value) {}
	public Weapon(String name) {}
	public Weapon(int value, String name) {}
}

public class Exam_Overloading {
	
	public Exam_Overloading() {}
	public Exam_Overloading(String name) {}
	public Exam_Overloading(int score) {}

	public static void main(String[] args) {
		//같은 이름이지만 전달 값을 다양하게 넣어줄 수 있는 것을 오버로딩이라고 한다.
		//메소드 오버로딩 - 다형성 사례1
		//오버로딩이 없다면 전달 값 마다 다른 이름의 메소드가 필요하다.
		//즉 클래스의 이름이 같더라도 매개변수의 갯수나 타입종류를 다르게 하여 추가로 선언 할 수 있게해주는 것이 오버로딩이다.
		System.out.println("Hello, World");
		System.out.println('A');
		System.out.println(3);
		System.out.println(4.25);
	}

}
