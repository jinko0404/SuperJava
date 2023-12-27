package org.Super.day03;

import java.util.Scanner;

public class practice11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int salA = sc.nextInt();
		double bonusA = (double)salA * 1.4;
		System.out.print("B사원의 연봉 : ");
		int salB = sc.nextInt();
		double bonusB = (double)salB;
		System.out.print("C사원의 연봉 : ");
		int salC = sc.nextInt();
		double bonusC = (double)salC *1.15;
		System.out.println("A사원의 연봉/연봉+a : " + salA + "/" + bonusA);
		if(bonusA < 3000) System.out.println("3000 미만");
		else System.out.println("3000 이상");
		System.out.println("B사원의 연봉/연봉+a : " + salB + "/" + bonusB);
		if(bonusB < 3000) System.out.println("3000 미만");
		else System.out.println("3000 이상");
		System.out.println("C사원의 연봉/연봉+a : " + salC + "/" + bonusC);
		if(bonusC < 3000) System.out.println("3000 미만");
		else System.out.println("3000 이상");
		sc.close();
	}
}












