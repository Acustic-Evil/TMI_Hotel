package tmi.tmi_hotel.service;

import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Guest;

import java.util.List;

@Service
public interface IGuestService {

    List<Guest> getAllGuests();

    List<Guest> getGuestsByLastName(String email);

    Guest getGuestByEmail(String email);

    String addNewGuest(String fio, String phone_number, String email);

    Guest getGuestById(Long id);

    void updateGuest(Guest guest);

    void deleteGuest(Long id);
}
