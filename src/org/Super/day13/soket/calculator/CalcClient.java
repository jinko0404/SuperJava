package org.Super.day13.soket.calculator;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class CalcClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		InputStream is = null;
		
		try {
			//계산식(빈칸으로 띄어 입력, 예시 : 24 + 42) >> 24 + 42
			//계산결과 : 66
			@SuppressWarnings("resource")
			Socket socket = new Socket(address, port);
			System.out.println("서버와의 연결이 완료되었습니다.");
			//클라이언트 소켓이 만들어졌다.
			
			//네트워크 프로그래밍에서 출력스트림을 쓸 때
			//직접 객체 생성하는게 아니라
			//소켓의 출력스트림을 이용해야한다.
			os = socket.getOutputStream();
			is = socket.getInputStream();
			
			System.out.print("계산식(빈칸으로 띄어 입력, 예시 : 24 + 42) >>");
			String sendMsg = sc.nextLine();
			byte[] data = sendMsg.getBytes();
			os.write(data);
			os.flush();
			
			int readByteCount;
			data = new byte[1024];
			readByteCount = is.read(data);
			String recvMsg = new String(data, 0, readByteCount);
			System.out.println("계산결과 : " + recvMsg);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				os.close();
		        is.close();
			} catch (Exception e2) {
				
			}
		}

	}

}













