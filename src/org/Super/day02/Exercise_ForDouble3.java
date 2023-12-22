package org.Super.day02;

public class Exercise_ForDouble3 {

	public static void main(String[] args) {
		for(int i = 0;i <= 5; i++) {
			for(int j = 5 ;j >= i; j--) {
				System.out.print(" ");
			}
			for(int j = 1;j <= 1 + (2*i); j++) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}

	}

}
