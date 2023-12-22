package org.Super.day01;

public class Exam_Unary {

	public static void main(String[] args) {
		//단항 연산자
		//a++, ++a -> a = a + 1;
		//후위연산, 전위연산
		int a1 = 1;
		System.out.println(++a1);//전위 연산 시 실행 전에 바로 연산 되었기 때문에 바로 바로 출력문에 반영되어 출력된다.
		System.out.println(a1++);//실행 후에 연산
		System.out.println(a1);//후위연산 시 결과는 실행 하고 나서 연산했기 때문에
		//이전 출력에서 반영이 안되고 다음 출력 때 반영이 되었다.
		
		//문제1. a가 10, b가 20, c가 30일 때
		//a++; 11
		//b = (--a) + b; 10 + 20 = 30
		// c = (a++) + (--b) 10 + 29 = 39, 10 -> 11
		//각각의 수를 구하라
		//a = 11, b = 29 ,c= 39

		int a = 10;
		int b = 20;
		int c = 30;
		
		a++;
		b = (--a) + b;
		c = (a++) + (--b);
		System.out.print(a + " ");
		System.out.print(b + " ");
		System.out.println(c + " ");
		
		//문제 2. x는 100, y 는 33, z는 0 일때,
		//x--; 99
		//z = (x--) + (--y); 131 = 99 + 32, x = 98, y = 32
		//x = 99 + (x++) + x;  296 = 99 + 98 + 99
		// y = y-- + y + ++y; 97= 32 + 31 + 32, 97 -> 95
		// x : ?, y : ?, z : ?
		//x = 296, y = 95, z = 67
		//후위 연산은 식이 끝난 뒤에 반영되는게 아니라
		//사용 되고 나서 반영되기에 한 연산에 여러번 사용 될 시
		//식이 모두 끝난 뒤에 반영되지 않고 사용이 끝나자 마자 반영된다.
		int x = 100;
		int y = 33;
		int z = 0;
		
		x--;
		z = (x--) + (--y);
		x = 99 + (x++) + x;
		y = y-- + y + ++y;
		
		System.out.println(x + " " + y + " " + z + " ");
	}

}








