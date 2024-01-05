package org.Super.day10.motel.controller;

import java.util.ArrayList;
import java.util.List;

import org.Super.day10.motel.model.vo.Motel;

public class MotelController {
	public List<Motel> roomCreate() {//방 목록 생성
		List<Motel>rooms = new ArrayList<Motel>(10);
		for(int i = 0; i < 10; i++) {
			rooms.add(new Motel('N', i + 1));
		}
		return rooms;
	}
	
	public void checkIn(Motel room) {//입실
		if(room.getRoomStatus() == 'N') {
			room.setRoomStatus('Y');
		}
	}
	public void checkOut(Motel rooms) {//퇴실
		if(rooms.getRoomStatus() == 'Y') {
			rooms.setRoomStatus('N');
		}
	}
}
