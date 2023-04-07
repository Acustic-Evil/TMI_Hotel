package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Room {

    @OneToMany(mappedBy = "idRoom")
    private List<Booking> bookings;

    @ManyToOne
    @JoinColumn(name = "idOrder")
    private Zakaz orders;


    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long idRoom;

    private String roomType;

    private Integer roomNumber;

    private Float pricePerNight;

    public Room() {
    }
}
