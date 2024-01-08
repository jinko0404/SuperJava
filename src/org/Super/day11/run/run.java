package org.Super.day11.run;

import org.Super.day11.Exam_SortRecap;

public class run {

	public static void main(String[] args) {
		Exam_SortRecap sort = new Exam_SortRecap();
		
		int[] nums1 = sort.bubbleionSort();
		
		for(int i = 0; i < nums1.length; i++) {
			if(i == nums1.length - 1) {
				System.out.println(nums1[i]);
			}
			else {
				System.out.print(nums1[i] + " ");
			}
		}
		
		nums1 = sort.selectionSort();
		for(int i = 0; i < nums1.length; i++) {
			if(i == nums1.length - 1) {
				System.out.println(nums1[i]);
			}
			else {
				System.out.print(nums1[i] + " ");
			}
		}
		nums1 = sort.insertionSort();
		for(int i = 0; i < nums1.length; i++) {
			if(i == nums1.length - 1) {
				System.out.println(nums1[i]);
			}
			else {
				System.out.print(nums1[i] + " ");
			}
		}

	}

}
