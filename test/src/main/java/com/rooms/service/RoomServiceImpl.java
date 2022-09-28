package com.rooms.service;

import java.util.List;

import com.rooms.model.Room;
import com.rooms.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
	 @Autowired
	 private RoomRepository roomRepository;
	 
	@Override
	public Room saveRoom(Room room) {
		 return roomRepository.save(room);
	}

	@Override
	public List<Room> getAllRooms() {
		 return roomRepository.findAll();
	}

}
