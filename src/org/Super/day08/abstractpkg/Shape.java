package org.Super.day08.abstractpkg;

class Line extends Shape{
	//추상 메소드는 오버라이딩을 강제한다.
	@Override
	public void draw() {
		
	}
}

//추상 메소드가 있는 클래스는 반드시 추상 클래스가 되야한다.
//그러나 추상 클래스가 꼭 추상 메소드를 가지고 있는 것은 아니다.
public abstract class Shape {
	private String name;
	public Shape() {}
	
	//몸체 없는 메소드인 추상 메소드로 작성
	abstract public void draw();
	public void paint() {}

}
