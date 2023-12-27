package org.Super.day04;

public class Exam_HallowCopy {

	public static void main(String[] args) {
		int[] arrs1 = new int[4];
		for(int i = 0; i < arrs1.length; i++) {
			arrs1[i] = i * i;
			System.out.print(arrs1[i] + " ");
		}
		System.out.println();
		
		int arrs2[] = arrs1;
		arrs1[1] = 11;
		arrs2[1] = 13; //얕은 복사, arrs1과 arrs2는 주소까지 똑같은 똑같은 배열이 되버린다. 
		//그렇기에 arrs2를 변경시 arrs1이 변경된것과 마찬가지다.
		System.out.println(arrs1[1]);

	}

}
