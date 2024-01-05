package org.Super.day08.abstractpkg;

public class CalcRun {

	public static void main(String[] args) {
		CerryCalc c = new CerryCalc();
		//Calculator c = new Calculator(); <= 추상클래스는 객체로 생성할 수 없다.
		
		int[] i = {23,11,13,4,25};
		System.out.println(c.add(11, 13));
		System.out.printf("%.2f\n",c.average(i));
		System.out.println(c.substract(4, 25));
		System.out.println(c.substract(25, 11));

	}

}
