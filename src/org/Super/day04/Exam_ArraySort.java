package org.Super.day04;

import java.util.Arrays;

public class Exam_ArraySort {
	public static void main(String[] args) {
		//정렬
		//11 13 4 6 2
		//오름차순 => 2 4 6 11 13
		//내림차순 => 13 11 6 4 2
		//머릿속으로 했었던 비교에 순서와 방법을 정리해놓은 것
		//알고리즘 : 문제해결을 하기 위한 절차(순서)나 방법
		//정렬 알고리즘 종류
		//1. 삽입정렬
		//2. 선택정렬
		//3. 버블정렬
		//4. 퀵정렬
		//5. 병합정렬
		//...
		//* temp 알고리즘
		int num1 = 11;
		int num2 = 13;
		int temp;
		
		System.out.println(num1 + " " +num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println(num1 + " " +num2);
		//삽입정렬
		//정렬 알고리즘중에 하나, 가장 간단하고 기본이 되는 알고리즘
		//배열의 N번 인덱스 값을 0번에서 n-1번까지 비교한다.
		//N은 1부터 시작
		//오름차순,작은것 부터 찾는다.
		System.out.println("====================");
		System.out.println("삽입정렬");
		int nums2[] = {2, 5, 4, 1, 3, 2, 3, 4, 6, 5, 1, 1};
		for(int i = 1; i < nums2.length; i++) {
			for(int j = i; j >= 1; j--) {
				if(nums2[j - 1] > nums2[j]) {
					temp = nums2[j - 1];
					nums2[j - 1] = nums2[j];
					nums2[j] = temp;
				}
			}
		}
		for(int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + " ");
		}
		System.out.println();
		
		//버블정렬
		//인접한 두개의 원소를 검사하여 정렬하는 방법
		//구현이 쉽다는 장점이 있다. 이미 정렬된 데이터를 정렬할 때 가장 빠르다.
		//기본적으로 다른 정렬에 비해 속도가 느린편이며 역순으로 정렬할 때 가장 느리다.
		//1. 배열을 처음부터 끝까지 순회하며 인접한 두 원소를 비교합니다.
		//2. 만약 앞의 원소가 뒤의 원소보다 크다면 두 원소를 교환합니다.
		//3. 한 번의 순회가 끝나면 가장 큰 원소가 배열의 마지막으로 이동합니다.
		//4. 위의 과정을 배열의 길이만큼 반복합니다.
		
		System.out.println("====================");
		System.out.println("버블정렬");
		int nums1[] = {2, 5, 4, 1, 3, 2, 3, 4, 6, 5, 1, 1, 1, 1};
		for(int i = 0; i < nums1.length; i++) {
			for(int j = 1; j < nums1.length - i; j++) {
				if(nums1[j - 1] > nums1[j]) {
					temp = nums1[j - 1];
					nums1[j - 1] = nums1[j];
					nums1[j] = temp;
				}
			}
		}
		for(int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}
		System.out.println();
		//선택정렬
		//배열을 전부 검색하여 최솟값을 고르고 왼쪽부터 채워나가는 정렬
		//알고리즘
		//특징 : 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬이지만 데이터의 양이 많을 땐 급격한 성능저하를 보인다.
		//배열의 n번 인덱스 값을 n+1번 ~ 마지막 인덱스 까지 비교한다.
		//즉, 현재 위치(i번째)부터 배열의 끝까지 순회하면서 최솟값을 찾습니다.
		//최솟값을 현재 위치(i번째)의 값과 교환합니다.
		//다음 위치(i + 1)로 이동하여 위의 두 단계를 반복합니다.를 반복한다.
		
		System.out.println("====================");
		System.out.println("선택정렬");
		int min = 0;
		int nums3[] = {2, 5, 4, 1, 3, 2, 3, 4, 6, 5, 5, 5, 2, 2, 4, 1, 3, 2};
		for(int i = 0; i < nums3.length - 1; i++) {
			min = i;//최솟값을 찾은 정렬 초기화
			for(int j = i + 1; j < nums3.length;j++) {
				if(nums3[min] > nums3[j]) {
					min = j;
				}//최솟값을 구하는 제어문, 현재값보다 더 작은 값을 발견했을 시 그 인덱스 값을 min값에 삽입한다.
			}
			temp = nums3[i];
			nums3[i] = nums3[min];
			nums3[min] = temp;
		}//배열을 모두 돌리는 반복문
		for(int i = 0; i < nums3.length; i++) {
			System.out.print(nums3[i] + " ");
		}
		System.out.println();
		System.out.println("====================");
		System.out.println("정렬 메소드 Arrays.sort, Arrays는 배열 관련 클래스");
		int nums4[] = {2, 5, 4, 1, 3, 2, 3, 4, 6, 5, 5, 5, 2, 2, 4, 1, 3, 2};
		Arrays.sort(nums4);
		for(int i : nums4) {
			System.out.print(i + " ");
		}//for each문, 배열이나 나열의 요소들을 순차적으로 모두 접근할 때 유용한 제어문이다.for(변수 : 배열)
	}
}
















