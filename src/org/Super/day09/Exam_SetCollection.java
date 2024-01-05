package org.Super.day09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Exam_SetCollection {

	public static void main(String[] args) {
		//Collection의 List, Set, Map -> 저장소 역할
		//Set은 집합의 역할을 한다.
		//집합의 특성 : 순서가 없다, 중복이 안된다!
		Set<String> strSet = new HashSet<String>();
		
		strSet.add("홍길동");
		strSet.add("김유신");
		strSet.add("전우치");
		strSet.add("손오공");
		strSet.add("홍길동");
		
		Iterator<String> it = strSet.iterator();//순서가 없기 때문에 Iterator라는 것을 가져와서 출력한다.
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		System.out.println(strSet.size());
		System.out.println("값의 존재 체크 : " + strSet.isEmpty());
		strSet.clear();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		System.out.println(strSet.size());
		System.out.println("값의 존재 체크 : " + strSet.isEmpty());

	}

}
