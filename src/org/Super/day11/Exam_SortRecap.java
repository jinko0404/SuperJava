package org.Super.day11;

public class Exam_SortRecap {
	public int[] insertionSort() {
		int	[]	nums = {25, 4, 23, 24, 11, 13};
		int temp = 0;
		
		for(int i = 1 ; i < nums.length; i++) {//배열 길이 만큼 반복
			temp = nums[i];//현재 턴 인덱스 요소 따로 보관
			int j = i - 1;//현재 인덱스 이전 요소부터 시작
			while (j >= 0 && temp < nums[j]) {//현재 인덱스 이전 요소부터 시작요소 까지 모두 비교 + 현재 인덱스가 비교 인덱스 보다 작을때 까지
	            nums[j + 1] = nums[j];//현재 요소보다 큰 값을 오른쪽으로 이동
	            j--;//비교 포인트를 이전 요소로 이동
	        }
			nums[j + 1] = temp;//현재 요소를 찾은 위치에 삽입
		}
		return nums;
	}
	public int[] selectionSort() {
		int	[]	nums = {23, 11, 13, 25, 24, 4};
		int temp = 0;
		
		for(int i = 0; i < nums.length - 1; i++) {//배열의 길이 - 1 만큼 반복
			for(int j = i + 1; j < nums.length;j++) {//배열 길이만큼 반복
				if(nums[j] < nums[i]) {//현재 i인덱스 요소를 i이후 모든 요소들과 비교
					//현재 i인덱스보다 작은 요소 발견 시 교환
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		return nums;
	}
	public int[] bubbleionSort() {
		int	[]	nums = {23, 11, 13, 24, 4, 25};
		int temp = 0;
		
		for(int i = 0; i < nums.length ; i++) {//배열의 길이 만큼 반복
			for(int j = 0; j < nums.length - 1 ; j++) {//배열의 길이 - 1 만큼 반복
				if(nums[j] > nums[j+1]) {//만약 현재 배열 요소가 다음 배열요소보다 크면
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;//현재 배열요소를 다음 배열요소와 바꾼다.
				}
			}
		}
		return nums;
	}
}
