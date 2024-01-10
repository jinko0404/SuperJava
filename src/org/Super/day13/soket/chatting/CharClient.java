package org.Super.day13.soket.chatting;

import java.net.*;
import java.util.Scanner;
import java.io.*;

public class CharClient {
	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		OutputStream os = null;
		InputStream is = null;
		System.out.println("서버에 연결 중 입니다.");
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket(address, port);
			System.out.println("채팅서버에 접속하였습니다.");
			
			os = socket.getOutputStream();
			is = socket.getInputStream();
			
			int readByteCount;
			byte[] readBytes = new byte[1024];
			byte[] data;
			String serverChat;
			String clientChat;
			
			System.out.println("서버와의 채팅을 시작합니다.");
			while(true) {
				//상대 채팅 받기
				readByteCount = is.read(readBytes);
				serverChat = new String(readBytes, 0, readByteCount);
				System.out.println("서버(상대) : " + serverChat);
				if(serverChat.equals("exit")) break;
				
				//내 채팅 보내기
				System.out.print("클라이언트(나) : ");
				clientChat = sc.nextLine();
				if(clientChat.equals("exit")) break;
				data = clientChat.getBytes();
				os.write(data);
				os.flush();
			}
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				os.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}



















