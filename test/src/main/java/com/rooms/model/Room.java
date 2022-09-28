package com.rooms.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Room")
public class Room {

	@Id
	private String id;
	private Integer roomNumber;
	private String roomType;
	
	
	
	public Room() {		
	}
	
	public Room( Integer roomNumber, String roomType) {
				
		this.roomNumber = roomNumber;
		this.roomType = roomType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Room [id=" + id + ", roomNumber=" + roomNumber + ", roomType=" + roomType + "]";
	}
	
	
	
}
