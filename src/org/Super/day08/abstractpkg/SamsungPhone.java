package org.Super.day08.abstractpkg;

public class SamsungPhone implements PhoneInterface {//인터페이스는 implements 키워드로 상속한다.
//인터페이스 속 추상 메소드는 강제 오버라이딩 된다.
	@Override
	public void printLogo() {
		System.out.println("====================SAMSUNG====================");
	}

	@Override
	public void sendCall() {
		System.out.println("삼성폰으로 전화를 겁니다.");
	}
}
