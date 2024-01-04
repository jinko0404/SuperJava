package org.Super.day08.abstractpkg;

public class Exam_Interface {

	public static void main(String[] args) {
		//PhoneInterface phone = new PhoneInterface(); 인터페이스도 객체를 생성할 수 없다.
		PhoneInterface phone = new SamsungPhone();//업캐스팅을 통해 인터페이스를 상속받은 자식 클래스를 참조해야한다.
		phone.printLogo();
		phone.sendCall();

	}

}
