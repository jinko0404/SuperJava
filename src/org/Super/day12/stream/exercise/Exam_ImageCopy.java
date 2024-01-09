package org.Super.day12.stream.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam_ImageCopy {

	public static void main(String[] args) {
		//c:\Windows\Web\Wallpaper\Theme1\img1.jpg
		//D:tempworkspace\Fclass_icon.png
		InputStream is = null;
		OutputStream os = null;
		
		try {
			is = new FileInputStream("c:\\Windows\\Web\\Wallpaper\\Theme1\\img1.jpg");
			os = new FileOutputStream("D:tempworkspace\\copyimg.jpg");
			byte[] data = new byte[1024 * 10];
			int readByteCount;
			while((readByteCount = is.read(data)) != -1) {
				os.write(data, 0, readByteCount);
				os.flush();
			}
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}








