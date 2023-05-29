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
public class Guest {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long idGuest;

    @OneToMany(mappedBy = "guest", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Zakaz> zakaz;

    private String firstName;

    private String lastName;

    private String middleName;

    private String email;

    private String phoneNumber;

    private String aboutComment;


    private String password;


    public Guest(String lastName, String firstName, String middleName,String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
