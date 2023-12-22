package org.Super.day01;

public class Exam_PrintSample {
	public static void main(String[] args) {
		System.out.println("println과");
		System.out.print("print의 차이");
		System.out.println(" ln붙으면 개행하고\n그냥 print는 개행안함");
		
		System.out.printf("정수발싸 히힛! %d\n", 11);
		System.out.printf("실수발싸 히힛! %.2f\n", 11.11);
		System.out.printf("문자발싸 히힛! %c\n", 'A');
		System.out.printf("문자열발싸 히힛! %s\n", "소수정예F클래스");

		char C1 = 'F';
		String str2 = "공공데이터";
		String str3 = "개발자과정";
		double num1 = 11.13;
		double num2 = 4.25;
		boolean T = true;
		System.out.printf("%c반 %s %s %.2f개강 %.2f종강 %b입니다."
				, C1, str2, str3, num1, num2, T);
	}
}
