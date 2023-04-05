package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Room {

    @OneToMany(mappedBy = "id_room")
    private List<Booking> bookings;

    @ManyToOne
    @JoinColumn(name = "id_order")
    private Zakaz orders;


    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long id_room;

    private String room_type;

    private Integer room_number;

    private Float price_per_night;

    public Room() {
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Zakaz getOrders() {
        return orders;
    }

    public void setOrders(Zakaz orders) {
        this.orders = orders;
    }

    public Long getId_room() {
        return id_room;
    }

    public void setId_room(Long id_room) {
        this.id_room = id_room;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public Integer getRoom_number() {
        return room_number;
    }

    public void setRoom_number(Integer room_number) {
        this.room_number = room_number;
    }

    public Float getPrice_per_night() {
        return price_per_night;
    }

    public void setPrice_per_night(Float price_per_night) {
        this.price_per_night = price_per_night;
    }

}
