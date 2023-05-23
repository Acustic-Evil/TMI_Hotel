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
    public List<Guest> getGuestsByLastName(String lastName) {
        return guestRepository.getAllByLastName(lastName);
    }

    @Override
    public Guest getGuestByEmail(String email) {
        return guestRepository.getGuestByEmail(email);
    }

    @Override
    public String addNewGuest(String fio, String phone_number, String email) {
        Guest guest = getGuestByEmail(email);
        if (guest != null) {
            System.out.println("guest is in database");
        } else {
            String[] temp = fio.split(" ");
            if (temp.length < 3) {
                System.out.println("bad FIO");
                return "FIO";
            }
            String last_name = temp[0];
            String first_name = temp[1];
            String middle_name = temp[2];
            Guest new_guest = new Guest(last_name, first_name, middle_name, phone_number, email);
            guestRepository.save(new_guest);
            System.out.println("guest is not in database, created guest: " + new_guest.getIdGuest() + new_guest.getEmail());
        }
        return "all good";
    }
}
