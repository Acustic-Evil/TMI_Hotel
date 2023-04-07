package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

@Entity
public class Guest {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long idGuest;

    @OneToOne(mappedBy = "guest", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Zakaz zakaz;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    private String aboutComment;

    private String role;

    private String password;

    public Guest() {
    }
}
