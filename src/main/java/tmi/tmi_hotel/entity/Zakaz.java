package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

import java.util.List;

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

    public Zakaz() {
    }

}
