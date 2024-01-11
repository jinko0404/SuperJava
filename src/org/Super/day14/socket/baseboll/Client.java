package org.Super.day14.socket.baseboll;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String address = "127.0.0.1";
        int port = 8888;
        Scanner sc = new Scanner(System.in);
        OutputStream os = null;
        InputStream is = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;

        try {
            Socket socket = new Socket(address, port);
            System.out.println("클라이언트 소켓을 생성하였습니다.");

            os = socket.getOutputStream();
            is = socket.getInputStream();
            dis = new DataInputStream(is);
            dos = new DataOutputStream(os);

            int strike;
            int boll;
            String answer;

            System.out.println("게임 준비 완료");

            while (true) {
                // 서버로부터의 입력 받기
                String serverMessage = dis.readUTF();
                System.out.print(serverMessage);

                // 사용자 입력 받기
                answer = sc.nextLine();
                dos.writeUTF(answer);
                dos.flush();
                if(answer.split(" ").length != 3) {
                	String recvMsg = dis.readUTF();
                	if("error".equalsIgnoreCase(recvMsg)) {
                		System.out.println("다시 입력하세요.");
                		continue;
                	}
                }

                // 서버로부터 결과 받기
                strike = dis.readInt();
                boll = dis.readInt();
                System.out.println(strike + " 스트라이크 " + boll + " 볼");

                if (strike == 3) {
                    System.out.println("축하합니다 맞췄습니다.");
                    break;
                }
            }
            socket.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                os.close();
                dis.close();
                dos.close();
                sc.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}














