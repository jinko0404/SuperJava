package org.Super.day08.oop;

class Super{
	protected int money;
	
	public Super(){
		money = 10000000;
	}
	
	public void manageStroe() {
		System.out.println("매장운영 스타일 : 고객만족");
	}
}

class Sub extends Super{//상속시 부모 메소드의 메소드나 변수들을 그대로 쓸 수 있으며 새롭게 메소드를 덮어 쓸 수 있다.
	//메소드 오버라이딩 - 다형성 사례2
	//접근지정자, 반환형, 메소드명 모두 일치해 작성하고,
	//실행문만 달라지는 것이다. 오직, 상속관계에서만 볼 수 있다.
	//오버 라이딩 된 메서드는 오버라이딩 되기 전 메서드를 사용 할 수 없다.
	
	public void manageStroe() {
		System.out.println("매장운영 스타일 : 매출상승");
	}
}

public class Exam_Overriding {
//	Sub s = new Sub();
//	s.manageStroe();
//	1. 오버 라이딩은 상속관계에서만 사용할 수 있다.
//	2. 오버라이딩은 메소드명과 매개변수, 반환형, 접근지정이 같은 함수를 실행문만 재정의 하는 것이다.
//	3. 오버라이딩이 되면 동적바인딩이 되어 다형성을 이용할 수 있다.
//		*동적바인딩이란 자식개체에서 재정의된 즉, 오버라이딩된 매서드를 우선 사용 하는 것이다.
	static void paint (Shape shape) {
		shape.draw();
	}
	public static void main(String[] args) {

		
		Circle o = new Circle();
		Shape s = new Shape();
		paint(s);
		paint(o);
		paint(new Line());

	}

}
