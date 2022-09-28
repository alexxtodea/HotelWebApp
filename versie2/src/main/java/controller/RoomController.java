package controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.versie2.RoomRequest;

import model.Room;
import repository.RoomRepository;


@RestController
public class RoomController{
	
	private final RoomRepository roomRepository;
	
	public RoomController(RoomRepository roomRepository) {
		
		this.roomRepository = roomRepository;
	}
	
	@GetMapping("/room")
	public ResponseEntity<List<Room>> getAllRooms(){
		
		
		return ResponseEntity.ok(this.roomRepository.findAll());
	}
	
	@PostMapping("/room")
	public ResponseEntity<Room> createRoom(@RequestBody RoomRequest roomRequest){
		
		Room room = new Room();
		room.setRoomNumber(roomRequest.getRoomNumber());
		room.setRoomType(roomRequest.getRoomType());
		
		return ResponseEntity.status(201).body(this.roomRepository.save(room));
	}
}

