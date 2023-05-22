package tmi.tmi_hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Guest;
import tmi.tmi_hotel.repository.IGuestRepository;

import java.util.List;

@Service
public class GuestService implements IGuestService {

    @Autowired
    IGuestRepository guestRepository;

    @Override
    public List<Guest> getAllGuests() {
        return guestRepository.findAll();
    }

    @Override
    public Guest getGuest(String lastName) {
        return guestRepository.getGuestByLastName(lastName);
    }
}
