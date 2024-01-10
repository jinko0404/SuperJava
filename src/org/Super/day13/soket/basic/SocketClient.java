package org.Super.day13.soket.basic;

import java.io.*;
import java.net.*;

public class SocketClient {

	public static void main(String[] args) {
		String address = "127.0.0.1";
		int port = 8888;
		try {
			@SuppressWarnings({ "unused", "resource" })
			Socket socket = new Socket(address, port);
			System.out.println("서버와 연결되었습니다.");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
