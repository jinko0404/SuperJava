package org.Super.day09;

import java.util.ArrayList;
import java.util.List;

public class ListRun {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김유신");
		list.add("이순신");
		list.add("홍길동");
		list.add("임꺽정");
		list.add("전우치");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
	public void RListSample() {
		RList<Integer> list = new RList<Integer>();//특정 자료형을 정해 놓고 정해진 자료형의 값만 넣어줄 수 있다.
		list.add(1113);
		list.add(425);
		list.add(1600);
		
		int num = list.get(2);//이미 위에서 자료형을 정해줬기 때문에 형변환을 해서 값을 넣어줄 필요가 없다.
		System.out.println(num);
	}
	
	public void ObjListSample() {
		ObjectList objList = new ObjectList();
		//입력하려면 add 메소드 사용
		//컬렉션 중 리스트
		objList.add(11.13);
		objList.add(425);
		objList.add("종강");
		
		//출력
		System.out.println(objList.get(0));
		System.out.println(objList.get(1));
		System.out.println(objList.get(2));
		
		double start = (double)objList.get(0);//오브젝트 형을 타 자료형에 넣을시엔 아무리 맞는 자료형이라도 강제 형변환 필요
		int end = (int)objList.get(1);
		String msg = (String)objList.get(2);
		System.out.println(start);
		System.out.println(end);
		System.out.println(msg);
	}
	
	public void IntListSample() {
		IntList nums = new IntList();
		
		nums.add(1124142);
		nums.add(223141);
		nums.add(3124);
		
		System.out.println(nums.get(0));
		System.out.println("크기 : " + nums.size);
		
		nums.clear();
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(nums.get(2));
		System.out.println("크기 : " + nums.size);
	}
}
