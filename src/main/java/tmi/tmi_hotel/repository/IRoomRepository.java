package tmi.tmi_hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tmi.tmi_hotel.entity.Room;

@Repository
public interface IRoomRepository extends JpaRepository<Room, Integer> {
    Room getTopByRoomTypeAndOrdersIsNull(String room_type);

    Room getRoomByIdRoom(Long id_room);

}
