package org.Super.day03;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		if(num1 == num2 && num2 == num3) System.out.println(true);
		else System.out.println(false);
		sc.close();
	}

}
