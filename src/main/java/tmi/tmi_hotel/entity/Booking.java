package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Booking {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long id_booking;

    @ManyToOne
    @JoinColumn(name = "id_room")
    private Room id_room;


    private LocalDateTime check_in_date;

    private LocalDateTime check_out_date;

    public Booking() {
    }

    public Long getId_booking() {
        return id_booking;
    }

    public void setId_booking(Long id_booking) {
        this.id_booking = id_booking;
    }

    public Room getId_room() {
        return id_room;
    }

    public void setId_room(Room id_room) {
        this.id_room = id_room;
    }

    public LocalDateTime getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(LocalDateTime check_in_date) {
        this.check_in_date = check_in_date;
    }

    public LocalDateTime getCheck_out_date() {
        return check_out_date;
    }

    public void setCheck_out_date(LocalDateTime check_out_date) {
        this.check_out_date = check_out_date;
    }
}
