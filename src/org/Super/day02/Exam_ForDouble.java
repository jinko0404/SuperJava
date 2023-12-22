package org.Super.day02;

public class Exam_ForDouble {

	public static void main(String[] args) {
		for(int i = 2 ; i <= 9 ; i++) {
			for (int j = 1 ; j <= 9 ; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.printf("\n");
		}
	}

}
