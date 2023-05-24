package tmi.tmi_hotel.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table
public class Room {

    @OneToOne(mappedBy = "idRoom")
    private Booking bookings;

    @ManyToOne
    private Zakaz orders;


    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long idRoom;

    private String roomType;

    private Integer roomNumber;

    private Float pricePerNight;

}
