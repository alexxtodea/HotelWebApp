package com.example.versie2;

public class RoomRequest {
	private Integer roomNumber;
	private String roomType;
	
	public RoomRequest() {
		
	}
	
	public RoomRequest(Integer roomNumber, String roomType) {
		super();
		this.roomNumber = roomNumber;
		this.roomType = roomType;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	
}
