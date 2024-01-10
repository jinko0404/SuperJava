package org.Super.day13.soket.calculator;

import java.net.*;
import java.io.*;

public class CalcServer {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 연결을 기다리고 있습니다...");
			Socket socket = serverSocket.accept();
			System.out.println("연결이 완료되었습니다.");
			//서버에 소켓이 만들어졌다.
			
			//네트워크 프로그래밍에서 입력스트림을 쓸 때
			//출력 스트림과 마찬가지로
			//소켓의 입력스트림을 이용해야한다.
			is = socket.getInputStream();
			os = socket.getOutputStream();
			int readByteCount;
			byte[] readBytes = new byte[1024];
			readByteCount = is.read(readBytes);
			String result = new String(readBytes, 0, readByteCount);
			String recognize = "";
			int num1;
			int num2;
			char oper;
			int index = 0;
			int resultNum;
			
			while(index < result.length() && result.charAt(index) >= '0' && result.charAt(index) <= '9') {
				recognize += result.charAt(index);
				index++;
			}
			
			num1 = Integer.parseInt(recognize);
			System.out.println(num1);
			
			index++;
			oper = result.charAt(index);
			index += 2;
			
			recognize = "";
			while(index < result.length() && result.charAt(index) >= '0' && result.charAt(index) <= '9') {
				recognize += result.charAt(index);
				index++;
			}
			
			num2 = Integer.parseInt(recognize);
			System.out.println(num2);
			
			Calculator cal = new Calculator();
			resultNum = cal.Cal(num1, num2, oper);
			
			System.out.println(resultNum);
			result =  String.valueOf(resultNum);
			System.out.println(result);
			
			byte[] data = result.getBytes();
			os.write(data);
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
		    try {
		        if (serverSocket != null) serverSocket.close();
		        if (is != null) is.close();
		        if (os != null) os.close();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}

	}
}

















