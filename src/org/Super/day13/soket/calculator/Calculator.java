package org.Super.day13.soket.calculator;

public class Calculator {

	public int Cal(int num1, int num2,char oper){
		int result;
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
			result = 0;
			break;
			}
			return result;
	}
}
