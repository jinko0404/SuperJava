package org.Super.day02;

import java.util.Scanner;

public class Exercise_Calculator {

	public static void main(String[] args) {
		int num1;
		int num2;
		int result;
		char oper;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 하나 입력 : ");
			num1 = sc.nextInt();
			System.out.print("정수 하나 더 입력 : ");
			num2 = sc.nextInt();
			System.out.print("연산자 입력(+, -, *, /, %) : ");
			oper = sc.next().charAt(0);
			switch(oper) {
			case '+': result = num1 + num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
			break;
			case '-': result = num1 - num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
			break;
			case '*': result = num1 * num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
			break;
			case '/': result = num1 / num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
			break;
			case '%': result = num1 % num2;
			System.out.println(num1 + " " + oper + " " + num2 + " = " + result);
			break;
			default : System.out.println("오류! 다시 입력해주세요.");
			break;
			}
		}
	}

}
