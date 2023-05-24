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
public class Employee {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long idEmployee;


    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Zakaz> zakaz;

    private String firstName;

    private String lastName;

    private String middleName;

    private String phoneNumber;

    private String email;

    private String password;

    private String jobTitle; // role

    private String department;

}
