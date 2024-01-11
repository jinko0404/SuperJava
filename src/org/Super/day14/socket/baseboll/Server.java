package org.Super.day14.socket.baseboll;

import java.net.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        int port = 8888;
        InputStream is = null;
        OutputStream os = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("서버 소켓을 생성하였습니다.");
            System.out.println("클라이언트의 접속을 기다립니다...");
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트가 접속하였습니다.");

            os = socket.getOutputStream();
            is = socket.getInputStream();
            dis = new DataInputStream(is);
            dos = new DataOutputStream(os);
            
            int[] randNum = new int[3];
            for(int i = 0; i < randNum.length; i++) {
            	randNum[i] = rand.nextInt(9) + 1;
            	for(int j = 0; j < i; j++) {
            		if (randNum[j] == randNum[j + 1]) {
            			i--;
            			break;
            		}
            	}
            }
            String[] nums = new String[3];
            String answer;
            String[] answers;
            int boll;
            int strike;

            // 서버의 숫자 입력
            System.out.printf("%d %d %d\n"
            		, randNum[0], randNum[1], randNum[2]);
            System.out.println("서버 준비 완료");
            for(int i = 0; i < randNum.length; i++) {
            	nums[i] = randNum[i] + "";
            }
            answers = new String[nums.length];

            while (true) {
            	boll = 0;
                strike = 0;
                // 클라이언트에게 입력 요청
                dos.writeUTF("-->");
                dos.flush();

                // 클라이언트로부터의 입력 받기
                answer = dis.readUTF();
                answers = answer.split(" ");
                if(answers.length != 3) {
                	String errMsg = "error";
                	dos.writeUTF(errMsg);
                	dos.flush();
                	continue;
                }

                System.out.println("숫자 입력 -->" + answer);

                for (int i = 0; i < answers.length; i++) {
                    if (answers[i].equals(nums[i]))
                        strike++;
                    else if (answers[i].equals(nums[0])
                    		|| answers[i].equals(nums[1])
                    		|| answers[i].equals(nums[2]))
                        boll++;
                }

                // 결과 전송
                dos.writeInt(strike);
                dos.flush();
                dos.writeInt(boll);
                dos.flush();

                if (strike == 3) {
                    System.out.println("아웃! 게임종료");
                    break;
                }
            }
            socket.close();
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











