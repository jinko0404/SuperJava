package org.Super.day02;

import java.util.Random;

public class Exam_random {

	public static void main(String[] args) {
		Random rand = new Random();
		
		//rand.nextInt(n) + m : m ~ n - 1 까지의 랜덤한 수 리턴 
		System.out.println(rand.nextInt(11) + 25);
	}
}
