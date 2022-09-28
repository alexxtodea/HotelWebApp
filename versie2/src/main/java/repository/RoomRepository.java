package repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import model.Room;


public interface RoomRepository extends MongoRepository<Room, String>{

}
