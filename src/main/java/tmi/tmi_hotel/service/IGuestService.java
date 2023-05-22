package tmi.tmi_hotel.service;

import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Guest;

import java.util.List;

@Service
public interface IGuestService {

    List<Guest> getAllGuests();

    Guest getGuest(String email);
}
