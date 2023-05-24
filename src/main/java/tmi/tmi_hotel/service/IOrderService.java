package tmi.tmi_hotel.service;

import org.springframework.stereotype.Service;

@Service
public interface IOrderService {

    boolean order(String room_type, String date_in, String date_out, String email);

    void cancelBooking(Long id);
}
