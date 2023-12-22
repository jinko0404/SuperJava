package org.Super.day02;

public class Exercise_ForDouble2 {

	public static void main(String[] args) {
		for(int hour = 0; hour <= 23; hour++) {
			for(int minute = 0; minute <= 59; minute++) {
				System.out.printf("%d시 %d분\n", hour, minute);
			}
		}

	}

}
