package org.Super.day04;

import java.util.Random;

public class practice11 {

	public static void main(String[] args) {
		int[] rotto = new int[6];
		Random random = new Random();
		int temp;
		
		for(int i = 0; i < rotto.length;i++) {
			rotto[i] = random.nextInt(99) + 1;
			for(int j = 0; j < i;j++) {
				if(rotto[i] == rotto[j]) i--;
			}
		}
		
		for(int i = 0; i < rotto.length;i++) {
			for(int j = 0; j < i;j++) {
				if(rotto[i] < rotto[j]) {
					temp = rotto[i];
					rotto[i] = rotto[j];
					rotto[j] = temp;
				}
			}
		}
		for(int i = 0; i < rotto.length;i++) {
			System.out.print(rotto[i] + " ");
		}

	}

}
