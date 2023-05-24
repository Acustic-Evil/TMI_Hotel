package tmi.tmi_hotel.entity;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Booking {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long idBooking;

    @OneToOne
    private Room idRoom;


    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    public Booking(Room idRoom, LocalDate checkInDate, LocalDate checkOutDate) {
        this.idRoom = idRoom;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }
}
