package tmi.tmi_hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tmi.tmi_hotel.entity.Booking;
import tmi.tmi_hotel.entity.Room;

@SpringBootApplication
public class TmiHotelApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmiHotelApplication.class, args);
    }

}
