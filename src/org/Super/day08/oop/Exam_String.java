package org.Super.day08.oop;

public class Exam_String {

	public static void main(String[] args) {
		String msg = "Hello Java";
		msg = new String("Hello Java");
		
		String data1 = new String(" C#");
		String data2 = new String(",C++ ");
		
		System.out.println(data1 + "의 길이는 " + data1.length());
		System.out.println(data2 + "의 길이는 " + data2.length());
		
		//문자열 포함되어있는지 체크
		System.out.println("#이 있는가? : " + data1.contains("#"));
		
		//문자열 연결
		data1 = data1.concat(data2);
		System.out.println("연결된 문자열 : " + data1);
		System.out.println("연결된 문자열길이 : " + data1.length());
		
		//문자열 공백 제거
		data1 = data1.trim();
		System.out.println("공백제거 확인 : " + data1);
		System.out.println("제거된 문자열길이 : " + data1.length());
		
		//문자열의 문자 교체 C# -> JAVA
		data1 = data1.replace("C#", "JAVA");
		System.out.println("문자열 교체 확인 : " +  data1);
		
		//문자열 자르기1
		String words[] = data1.split(",");
		for(int i = 0; i < words.length; i++)
			System.out.print(words[i] + "/");
		//문자열 자르기2
		data1 = data1.substring(5);//"JAVA,C++"에서 1번째에서 5번째 인덱스까지 잘리고 "C++"만 남는다.
		System.out.println("\n" + data1);
		data1 = data1.substring(0,1);//범위자르기(시작위치, 남겨놓을 크기)
		System.out.println(data1);
	}

}
