package org.Super.day13.soket.chatting;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class ChatServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		int port = 8888;
		InputStream is = null;
		OutputStream os = null;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("채팅서버를 구동 중 입니다...");
		System.out.println("채팅서버를 구동하였습니다..");
		try {
			serverSocket = new ServerSocket(port);
			System.out.println("클라이언트의 접속을 기다리고 있습니다...");
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트가 접속하였습니다.");
			
			os = socket.getOutputStream();
			is = socket.getInputStream();
			
			String serverChat;
			String clientChat;
			byte[] data;
			byte[] readBytes = new byte[1024];
			int readByteCount;
			
			System.out.println("채팅 시작 !");
			while(true) {
				//내 채팅 보내기
				System.out.print("서버(나) : ");
				serverChat = sc.nextLine();
				if(serverChat.equals("exit")) break;
				data = serverChat.getBytes();
				os.write(data);
				os.flush();
				
				
				//상대 채팅 받기
				readByteCount = is.read(readBytes);
				clientChat = new String(readBytes, 0, readByteCount);
				System.out.println("클라이언트(상대) : " + clientChat);
				if(clientChat.equals("exit")) break;
			}
			socket.close();
		} catch (IOException e) {
			
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


















