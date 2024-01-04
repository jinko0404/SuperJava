package org.Super.day05;

class StaticSample{
	public int num;
	public static int input;
	
	public void sampleMethod() {
		
	}
	public void googMethod() {
		
	}
	public static void originMethod() {
		input = 2024;
	}
}

public class Exam_Static {

	public static void main(String[] args) {
		StaticSample.input = 120;
		StaticSample.originMethod();
		System.out.println(StaticSample.input);
		//		StaticSample sam = new StaticSample();
//		sam.num = 120;
//		sam.sampleMethod();
//		sam.googMethod();

	}

}
