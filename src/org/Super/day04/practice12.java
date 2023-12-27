package org.Super.day04;

import java.util.Scanner;

public class practice12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		int count = 0;
		char[] cStr1 = new char[127];
		
		
		for(int i = 0 ; i <= 127 ; i++) {
			for(int j = 0 ; j < str.length();j++) {
				if((i == str.charAt(j)) && (cStr1[i] == 0)) {
					count++;
					cStr1[i] = 1;
				}
			}
		}
		char[] cStr2 = new char[count];
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0 ; i < 127 ; i++) {
			for(int j = 0; j < count; j++) {
				if(cStr1[i] == 1 && cStr2[j] == 0) {
					cStr2[j] = (char)i;
					cStr1[i] = 0;
				}
			}
		}
		for(int j = 0; j < count; j++) {
			if(j != count -1) System.out.print(cStr2[j] + ", ");
			else System.out.println(cStr2[j]);
		}
		System.out.println("문자 개수 : " + count);
		
		sc.close();
	}

}
