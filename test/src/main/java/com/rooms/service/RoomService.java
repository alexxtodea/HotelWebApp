package com.rooms.service;

import com.rooms.model.Room;

import java.util.List;

public interface RoomService {
	 public Room saveRoom(Room room);
	 public List<Room> getAllRooms();
}
