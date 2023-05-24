package tmi.tmi_hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Room;
import tmi.tmi_hotel.repository.IRoomRepository;

import java.util.List;

@Service
public class RoomService implements IRoomService{
    @Autowired
    IRoomRepository roomRepository;

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }
}
