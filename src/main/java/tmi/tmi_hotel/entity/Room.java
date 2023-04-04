package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Room {

    @ManyToOne
    @JoinColumn(name = "id_booking")
    private Booking id_booking;

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long id_room;

    private String room_type;

    private Integer room_number;

    private Integer price_per_night;

    private Boolean is_available;

    public Room() {
    }
}
