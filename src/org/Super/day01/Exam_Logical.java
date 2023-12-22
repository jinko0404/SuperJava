package org.Super.day01;

public class Exam_Logical {

	public static void main(String[] args) {
		//논리 연산자 예제
		//남자이면서 평균평점 4.3이상인 사람
		// 컴퓨터 공학과 또는 경영학과인 사람
		
		boolean result1, result2, result3, result4;
		int num1 = 50;
		int num2 = 30;
		
		result1 = (num1 == num2) && (num1 < num2); //AND
		result2 = (num1 < num2) || (num1 == num2); //OR
		result3 = (num1 > num2) && (num1 != num2);
		result4 = (num1 > num2) || (num1 == num2);
		//result 1 = false
		//result 2 = false(num2 이 num1보다 크거나 같을 때 true)
		//result 3 = true
		//result 4 = true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

		//a는 70, b는 55
		//result1 = (a == b) ||(a++ < 100); a = 71 b = 55
		//result2 = (a < b) && (--b < 55); a = 71 b = 54
		//result3 = (a != b) && (b-- < a++); a = 72 b = 53
		//result4 = (a++ != b) || (b++ >= 85); a = 73 b = 54
		//a : 73, b : 54
		//result1 = true
		//result2 = false
		//result3 = true
		//result4 = true
		int a = 70;
		int b = 55;
		
		result1 = (a == b) ||(a++ < 100);
		result2 = (a < b) && (--b < 55);
		result3 = (a != b) && (b-- < a++);
		result4 = (a++ != b) || (b++ >= 85);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(a);
		System.out.println(b);
	}

}
