package org.Super.day04;

public class Exam_DimArray {

	public static void main(String[] args) {
		int num = 0;
		int dimnumArr[][] = new int[5][5];
		System.out.println("앞의 크기 : " + dimnumArr.length);
		System.out.println("뒤의 크기 : " + dimnumArr[0].length);
		for(int i = 0; i < dimnumArr.length;i++) {
			for(int j = 0; j < dimnumArr[i].length; j++) {
				dimnumArr[i][j] = ++num;
			}
		}
		for(int i = dimnumArr[0].length - 1; i >= 0; i--) {
			for(int j = 0; j < dimnumArr[i].length; j++) {
				System.out.print(dimnumArr[j][i] + " ");				
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < dimnumArr.length;i++) {
			for(int j = 0; j < dimnumArr[i].length; j++) {
				System.out.print(dimnumArr[j][i] + " ");				
			}
			System.out.println();
		}
		System.out.println();
		for(int i = 0; i < dimnumArr.length;i++) {
			if(i % 2 == 0) {
				for(int j = 0; j < dimnumArr[i].length; j++) {
					System.out.print(dimnumArr[i][j] + " ");				
				}
			}
			else {
				for(int j = dimnumArr[i].length - 1; j >= 0; j--) {
					System.out.print(dimnumArr[i][j] + " ");				
				}
			}
			System.out.println();
		}
	}

}
