package org.Super.day05.Motel;

import java.util.Scanner;

import org.Super.day05.Motel.MotelRoom;
@SuppressWarnings("unused")

public class MotelManagement {

	public static void main(String[] args) {
		MotelRoom rooms[] = new MotelRoom[10];
		Scanner sc = new Scanner(System.in);
		int choice;
		int roomChoice;
		
		for(int i = 0; i < rooms.length; i++) {
			rooms[i] = new MotelRoom('N', i + 1);
		}
		
		while(true) {
			System.out.println("모텔 관리 프로그램 v1.0");
			System.out.println("1.입실     2.퇴실     3.방보기      4.종료");
			System.out.print("선택 > ");
			choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("몇번방에 입실하시겠습니까?");
				roomChoice = sc.nextInt() - 1;
				if(rooms[roomChoice].roomStatus == 'Y')
					System.out.println(rooms[roomChoice].roomNumber + "번방은 현재 손님이 있습니다.");
				else if(rooms[roomChoice].roomStatus == 'N') {
					System.out.println(rooms[roomChoice].roomNumber + "번방에 입실하셨습니다");
					rooms[roomChoice].roomStatus = 'Y';
				}
			}
			else if(choice == 2) {
				System.out.println("몇번방에 퇴실하시겠습니까?");
				roomChoice = sc.nextInt() - 1;
				if(rooms[roomChoice].roomStatus == 'N')
					System.out.println(rooms[roomChoice].roomNumber + "번방은 현재 빈 방입니다.");
				else if(rooms[roomChoice].roomStatus == 'Y') {
					System.out.println(rooms[roomChoice].roomNumber + "번방에서 퇴실하셨습니다.");
					rooms[roomChoice].roomStatus = 'N';
				}
			}
			else if(choice == 3) {
				for(int i = 0; i < rooms.length; i++) {
					if(rooms[i].roomStatus == 'N') {
						System.out.println(rooms[i].roomNumber + "번방이 비어있습니다.");
					}
					else if(rooms[i].roomStatus == 'Y') {
						System.out.println(rooms[i].roomNumber + "번방에는 현재 손님이 있습니다.");
					}
					else {
						System.out.println("오류 ! ! !");
					}
				}
			}
			else if(choice == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		sc.close();
	}

}
