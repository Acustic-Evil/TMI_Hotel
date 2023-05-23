package tmi.tmi_hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Booking;
import tmi.tmi_hotel.entity.Guest;
import tmi.tmi_hotel.entity.Room;
import tmi.tmi_hotel.entity.Zakaz;
import tmi.tmi_hotel.repository.IBookingRepository;
import tmi.tmi_hotel.repository.IGuestRepository;
import tmi.tmi_hotel.repository.IRoomRepository;
import tmi.tmi_hotel.repository.IZakazRepository;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService implements IOrderService {

    @Autowired
    IRoomRepository roomRepository;
    @Autowired
    IBookingRepository bookingRepository;
    @Autowired
    IGuestRepository guestRepository;
    @Autowired
    IZakazRepository zakazRepository;


    private void book(LocalDate date_in, LocalDate date_out, Room room) {
        Booking new_book = new Booking(room, date_in, date_out);
        bookingRepository.save(new_book);
        room.setBookings(new_book);
        roomRepository.save(room);
        System.out.println("New booking" + new_book.getIdBooking() + " " + new_book.getIdRoom().getRoomNumber());

    }


    private void zakaz(LocalDate date_in, LocalDate date_out, String email, Room room) {
        Period period = Period.between(date_in, date_out);
        float total_price = room.getPricePerNight() * period.getDays();
        Guest guest = guestRepository.getGuestByEmail(email);
        List<Room> rooms = new ArrayList<>();
        rooms.add(room);
        Zakaz zakaz = new Zakaz(rooms, total_price, guest);
        zakazRepository.save(zakaz);
        room.setOrders(zakaz);
        roomRepository.save(room);
        System.out.println("New ORDER: " + zakaz.getRooms() + " " + zakaz.getTotalPrice() + " " + zakaz.getGuest().getEmail());
    }


    @Override
    public boolean order(String room_type, String date_in, String date_out, String email) {
        LocalDate check_in_date = LocalDate.parse(date_in);
        LocalDate check_out_date = LocalDate.parse(date_out);
        Room room = roomRepository.getTopByRoomTypeAndOrdersIsNull(room_type);
        if (room == null) {
            System.out.println("No rooms");
            return false;
        }
        book(check_in_date, check_out_date, room);
        zakaz(check_in_date, check_out_date, email, room);
        System.out.println("Order is good");
        return true;
    }
}
