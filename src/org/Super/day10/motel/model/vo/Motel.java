package org.Super.day10.motel.model.vo;

public class Motel {
	private char roomStatus;
	private int	roomNumber;
	
	public Motel() {}
	
	public Motel(char roomStatus, int roomNumber) {
		this.roomStatus = roomStatus;
		this.roomNumber = roomNumber;
	}
	
	public char getRoomStatus() {
		return roomStatus;
	}
	public void setRoomStatus(char roomStatus) {
		this.roomStatus = roomStatus;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
}
