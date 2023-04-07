package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Booking {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long idBooking;

    @ManyToOne
    @JoinColumn(name = "idRoom")
    private Room idRoom;


    private LocalDateTime checkInDate;

    private LocalDateTime checkOutDate;

    public Booking() {
    }
}
