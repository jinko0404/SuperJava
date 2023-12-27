package org.Super.day04;

import java.util.Scanner;

public class practice8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			System.out.print("정수 : ");
			int size = sc.nextInt();
		
			if(size % 2 == 0) {
				System.out.println("다시 입력하세요.");
			}
			else {
				int numArr[] = new int[size];
				for(int i = 0 ; i < numArr.length ; i++) {
					if(numArr.length / 2 >= i) {
						count++;
						numArr[i] = count;
					}
					else {
						count--;
						numArr[i] = count;
					}
					if(i != numArr.length - 1) System.out.print(numArr[i] + ", ");
					else System.out.println(numArr[i]);
				}
				break;
			}
		}
		sc.close();
	}

}
