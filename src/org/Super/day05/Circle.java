package org.Super.day05;

public class Circle {
	//생성자
	//1. 클래스 이름과 똑같은 메소드
	//2. 객체 생성시 최초 1번 실행된다.
	//3. 필드값을 초기화한다. => 객체 초기화
	public int radius;
	public String name;//필드(멤버 변수)
	
	public double getArea() {//메소드(멤버 함수)
		return 3.14 * radius * radius;
	}

}
