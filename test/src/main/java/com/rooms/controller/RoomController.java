package com.rooms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.rooms.model.Room;
import com.rooms.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {

	@Autowired
	private RoomService roomService;

	@GetMapping("/getAll")
	public List<Room> getRooms() {
		return roomService.getAllRooms();
	}

	@PostMapping("/add")
	public String add(@RequestBody Room room) {
		roomService.saveRoom(room);
		return "New student is added";
	}

//private final RoomRepository roomRepository;

	/*
	 * public RoomController(RoomRepository roomRepository) {
	 * 
	 * this.roomRepository = roomRepository; }
	 */

	/*
	 * @GetMapping public ResponseEntity<List<Room>> getAllRooms(){
	 * 
	 * 
	 * return ResponseEntity.ok(this.roomRepository.findAll()); }
	 */

}
