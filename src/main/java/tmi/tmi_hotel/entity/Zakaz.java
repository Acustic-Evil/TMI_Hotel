package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Zakaz { // TODO: rename (order)

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long id_zakaz;

    @OneToMany(mappedBy = "orders")
    private List<Room> rooms;

    private Float total_price;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_guest")
    private Guest guest;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_employee")
    private Employee employee;

    public Zakaz() {
    }

    public Long getId_zakaz() {
        return id_zakaz;
    }

    public void setId_zakaz(Long id_zakaz) {
        this.id_zakaz = id_zakaz;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Float getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Float total_price) {
        this.total_price = total_price;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
