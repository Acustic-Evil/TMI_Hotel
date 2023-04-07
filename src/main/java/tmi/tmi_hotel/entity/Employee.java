package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

@Entity
public class Employee {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long idEmployee;


    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Zakaz zakaz;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String email;

    private String password;

    private String jobTitle; // role

    private String department;

    public Employee() {
    }


}
