package tmi.tmi_hotel.entity;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

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

    @ManyToOne
    @JoinColumn(name = "idRoom")
    private Room idRoom;


    private LocalDateTime checkInDate;

    private LocalDateTime checkOutDate;
}
