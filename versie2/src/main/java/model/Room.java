package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document("rooms")
public class Room {
	
	@Id
	private String id;
	private Integer roomNumber;
	private String roomType;
	
	
	public Room() {
		
	}
	
	public Room(String id, Integer roomNumber, String roomType) {
		super();
		this.id = id;
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
		
	
}

