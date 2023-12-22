package org.Super.day01;

public class Exam_constant {

	public static void main(String[] args) {
		//변수는 소문자로 시작하고 새로운 단어가 시작할때 마다 대문자로 시작해야한다.(낙타 표기법)
		//상수는 모두 대문자로 써야한다.
		//c는 const지만 java는 final이다.
		//변수는 한번 값을 초기화 했어도 그 뒤에 다시 값을 재할당하여 값을 변경할 수 있다.
		//반면에, 상수는 한번 값을 초기화 시켰으면 그 뒤에 값이 고정되어 값을 변경(재할당) 할 수 없다.
		
		final double PI = 3.14;
		System.out.println(PI);
		
		double r = 10.2;
		double circleArea = PI * r * r;
		System.out.println("원의 면적 : " + circleArea);
	}

}
