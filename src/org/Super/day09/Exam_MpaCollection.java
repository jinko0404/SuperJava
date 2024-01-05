package org.Super.day09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam_MpaCollection {

	public static void main(String[] args) {
		//Collection은 저장소 역할, 데이터를 다루는 방법에 따라 List, Set, Map을 선택해 사용한다.
		//맛집 대기자 리스트 -> List
		//순서는 상관 없고, 중복을 제거하고 싶은 경우 -> Set
		//지역번호 -> Map
		//02 : 서울, 031 : 경기도, 053 : 대구, 052 : 울산, 051 : 부산
		//062 : 광주, 063: 전라북도, 061 : 전라남도, 064 : 제주도
		Map<String,String> regionNum = new HashMap<String,String>();
		
		regionNum.put("02", "서울");
		regionNum.put("031", "경기도");
		regionNum.put("032", "인천");
		regionNum.put("033", "강원도");
		regionNum.put("041", "충천남도");
		regionNum.put("042", "대전");
		regionNum.put("043", "충천북도");
		regionNum.put("044", "세종");
		regionNum.put("053", "대구");
		regionNum.put("052", "울산");
		regionNum.put("051", "부산");
		regionNum.put("062", "광주");
		regionNum.put("061", "전라남도");
		regionNum.put("063", "전라북도");
		regionNum.put("064", "제주도");
		              
		Scanner sc = new Scanner(System.in);
		System.out.print("지역번호 입력 : ");
		String num = sc.next();
		
		System.out.println("입력한 지역번호에 대한 지역명 : " + regionNum.get(num));
		
		sc.close();
	}

}
