package org.Super.day12.stream.exercise;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Exam_MemoPad {

	public static void main(String[] args) {
		Writer writer = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			String file = "";
			String input = "";
			int i = 1;
			System.out.print("저장할 파일 이름 입력 (확장자 제외) : ");
			input = sc.nextLine();
			writer = new FileWriter("src/org/Super/day12/stream/exercise/" + input + ".txt");
			System.out.println("=== ===파일 내용 작성(exit 입력 시 종료)=== ===");
			System.out.print(i + " : ");
			while(!(input = sc.nextLine()).equals("exit")) {
				i++;
				System.out.print(i + " : ");
				file += input + "\n";
			}
			writer.write(file);
			writer.flush();
			System.out.println("파일 작성 완료했습니다.F5를 눌러 파일을 확인해보세요~");
			writer.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
