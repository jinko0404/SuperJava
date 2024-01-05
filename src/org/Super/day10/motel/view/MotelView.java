package org.Super.day10.motel.view;

import java.util.List;
import java.util.Scanner;

import org.Super.day10.motel.controller.MotelController;
import org.Super.day10.motel.model.vo.Motel;

public class MotelView {
	MotelController MotelManager;
	public MotelView() {
		MotelManager = new MotelController();
	}
	
	public void launchProgram() {
		List<Motel> rooms = MotelManager.roomCreate();
		int choice;
		end:
		while(true) {
			choice = printMenu();
			switch(choice) {
			case 1 :
				checkIn(rooms);
				break;
			case 2 :
				checkOut(rooms);
				break;
			case 3 :
				roomCheck(rooms);
				break;
			case 4 :
				System.out.println("프로그램을 종료합니다.");
				break end;
			default:
				System.out.println("1 ~ 4 사이 숫자를 입력해주세요.");
				break;
			}
		}
	}
	
	public int printMenu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("모텔 관리 프로그램 v2.0");
		System.out.println("1.입실");
		System.out.println("2.퇴실");
		System.out.println("3.방보기");
		System.out.println("4.종료");
		System.out.print("선택>");
		choice = sc.nextInt();
		return choice;
	}
	public void checkIn(List<Motel> rooms) {//입실
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번방에 입실하시겠습니까?");
		int roomChoice = sc.nextInt();
		if(rooms.get(roomChoice - 1).getRoomStatus() == 'Y') {
			System.out.println((roomChoice) + "번방은 현재 손님이 있습니다.");
		}
		else {
			MotelManager.checkIn(rooms.get(roomChoice - 1));
			System.out.println((roomChoice) + "번 방에 입실하셨습니다.");
		}
	}
	
	public void checkOut(List<Motel> rooms) {//퇴실
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("몇번방에 퇴실하시겠습니까?");
		int roomChoice = sc.nextInt();
		if(rooms.get(roomChoice - 1).getRoomStatus() == 'N') {
			System.out.println((roomChoice) + "번방은 현재 빈 방 입니다.");
		}
		else {
			MotelManager.checkOut(rooms.get(roomChoice - 1));
			System.out.println((roomChoice) + "번 방에 퇴실하셨습니다.");
		}
	}
	public void roomCheck(List<Motel> room) {//방조회
		for(int i = 0; i < room.size(); i++) {
			if(room.get(i).getRoomStatus() == 'Y') {
				System.out.println(room.get(i).getRoomNumber() + "번방에는 현재 손님이 있습니다.");
			}
			else {
				System.out.println(room.get(i).getRoomNumber() + "번방이 비어있습니다.");
			}
		}
	}
	
	
}
