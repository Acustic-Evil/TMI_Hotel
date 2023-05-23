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
public class Zakaz { // TODO: rename (order)

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long idZakaz;

    @OneToMany(mappedBy = "orders")
    private List<Room> rooms;

    private Float totalPrice;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idGuest")
    private Guest guest;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idEmployee")
    private Employee employee;

    public Zakaz(List<Room> rooms, Float totalPrice, Guest guest) {
        this.rooms = rooms;
        this.totalPrice = totalPrice;
        this.guest = guest;
    }


}
