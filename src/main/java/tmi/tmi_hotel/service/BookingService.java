package tmi.tmi_hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Booking;
import tmi.tmi_hotel.repository.IBookingRepository;

import java.util.List;

@Service
public class BookingService implements  IBookingService{

    @Autowired
    IBookingRepository bookingRepository;

    @Override
    public List<Booking> findAllBookings() {
        return bookingRepository.findAll();
    }
}
