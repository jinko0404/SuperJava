package org.Super.day08.oop;

class Person{
	String name = "홍길동";
	String id = "001";
	
	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
}
class Student extends Person{
	String grade = "3학년";
	String department = "컴퓨터전자공학과";
	public Student() {}
	public Student(String name) {
		super(name);
	}
}


public class Exam_Upcasting {

	public static void main(String[] args) {
		Student student = new Student();
		Person p = new Person();
		//업캐스팅이란,
		//상속관계인 경우 부모타입의 참조변수로 자식객체를 이용하는 것이다.
		Person parent = new Student();
		//생성된 객체는 자식객체인데 어떻게 부모객체를 만든 것 처럼 사용할 수 있을까?
		//부모의 객체가 먼저 생성된 후 자식 객체가 생성되니 부모의 필드 또는 메소드를 사용할 수 있게 된다.
		System.out.println(parent.name);
		System.out.println(parent.id);
		//다운캐스팅
		//부모클래스 객체를 자식클래스타입으로 바꾸는 것이다.
		//명시적으로 지정해줘야한다. 즉, 수동 형변환을 해야한다.
		System.out.println(((Student)parent).grade);
		System.out.println(((Student)parent).department);

	}

}









