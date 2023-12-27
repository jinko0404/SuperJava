package org.Super.day04;

public class Exam_DeepCopy {

	public static void main(String[] args) {
		int[] origin = {1, 2, 3, 4};
		int[] copy = new int[4];
		
		for(int i = 0; i < copy.length; i++) {
			copy[i] = origin[i];
			if(i == origin.length) {
				break;
			}
			copy[i] = origin[i];
		}
		origin[1] = 11;
		copy[1] = 13;
		System.out.println(origin[1]);
		System.out.println(copy[1]);

	}

}
