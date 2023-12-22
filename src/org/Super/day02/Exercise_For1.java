package org.Super.day02;

public class Exercise_For1 {

	public static void main(String[] args) {
		//1부터 10까지의 덧셈을 표시하고 합도 구하시오
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum += i;
			if(i == 10) {
				System.out.print(i);
				break;
			}
			System.out.print(i + " + ");
		}
		System.out.println(" = " + sum);
	}

}
