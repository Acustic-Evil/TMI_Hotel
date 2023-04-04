package tmi.tmi_hotel.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long id_employee;

    private String first_name;

    private String last_name;

    private String phone_number;

    private String email;

    private String password;

    private String job_title; // role

    private String department;

}
