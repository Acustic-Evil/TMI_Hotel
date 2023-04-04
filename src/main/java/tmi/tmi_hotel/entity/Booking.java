package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Booking {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long id_booking;

    @OneToMany (mappedBy = "id_booking")
    private List<Room> rooms;

    private LocalDateTime check_in_date;

    private LocalDateTime check_out_date;

    public Booking() {
    }
}
