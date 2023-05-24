package tmi.tmi_hotel.service;

import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Room;

import java.util.List;

@Service
public interface IRoomService {
    List<Room> getAllRooms();
}
