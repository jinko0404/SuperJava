package org.Super.day08.abstractpkg;

public interface PhoneInterface {
	public static final int Time_OUT = 10000;//상수는 사용 할 수 있다.
	//public String name; 일반 필드도 사용 할 수 없다.
	//public void sendCall() {}; 인터페이스는 일반 메소드가 사용불가능이다.
	
	abstract public void printLogo(); //인터페이스는 추상 메소드가 필수다.
	
	void sendCall();//abstract public은 생략할 수 있다.
	
	//public defalut void showLogo() {
		//디폴트 메소드(기능추가)
		//하위 호환성을 위해서 작성한다.
		//인터페이스의 보완을 위해 사용한다.
	//}
}
