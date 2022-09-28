package com.rooms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.rooms.model.Room;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<Room, Integer> {
  
}
 
