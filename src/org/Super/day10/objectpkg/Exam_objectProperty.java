package org.Super.day10.objectpkg;

public class Exam_objectProperty {

	public static void print(Object obj) {
		System.out.println("클래스 이름 : " + obj.getClass().getName());
		System.out.println("해시코드 값 : " + obj.hashCode());
		System.out.println("객체를 문자열로 만들어 출력 : " + obj.toString());
		//문자열로 출력하고 싶다면 오버라이딩이 필수다.
		System.out.println("객체 출력 : " + obj);
		//toString()은 생략 가능하다.
		//객체를 출력하면 toString()결과로 출력이 된다.
	}
	
	public static void main(String[] args) {
		print(new Exam_objectProperty());
		
		String javaStr = "Java";
		String javaStr2 = "Java";
		String javaStr3 = new String("Java");
		//if(javaStr == "Java") {//같습니다(주소같음)
		//if(javaStr == javaStr2) {//같습니다(주소같음)
		//if(javaStr == javaStr3) {//다릅니다(new를 써서 주소가 달라졌기 때문)
		if(javaStr.equals(javaStr3)) {//문자열 비교는 ==가 아니라 equals를 쓴다.
										//equals는 Object클래스의 메소드다.
			System.out.println("같습니다.");
		}
		else {
			System.out.println("다릅니다.");
		}
	}

}
