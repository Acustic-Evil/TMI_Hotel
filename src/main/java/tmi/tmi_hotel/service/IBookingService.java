package tmi.tmi_hotel.service;

import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Booking;

import java.util.List;

@Service
public interface IBookingService {
    List<Booking> findAllBookings();
}
