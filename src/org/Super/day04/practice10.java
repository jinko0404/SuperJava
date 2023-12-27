package org.Super.day04;

import java.util.Scanner;

public class practice10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String socailNum = sc.next();
		char[] socaiNum_pw = new char[14];
		
		for(int i = 0; i < socaiNum_pw.length; i++) {
			if(i <= 7) {
				socaiNum_pw[i] = socailNum.charAt(i);
			}
			else socaiNum_pw[i] = '*';
		}
		System.out.println(socaiNum_pw);
		
		sc.close();
	}

}
