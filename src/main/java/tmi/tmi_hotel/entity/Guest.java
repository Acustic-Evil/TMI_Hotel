package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

@Entity
public class Guest {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long id_guest;

    @OneToOne(mappedBy = "guest", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Zakaz zakaz;

    private String first_name;

    private String last_name;

    private String email;

    private String phone_number;

    private String about_comment;

    private String role;

    private String password;

    public Guest() {
    }

    public Long getId_guest() {
        return id_guest;
    }

    public void setId_guest(Long id_guest) {
        this.id_guest = id_guest;
    }

    public Zakaz getZakaz() {
        return zakaz;
    }

    public void setZakaz(Zakaz zakaz) {
        this.zakaz = zakaz;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAbout_comment() {
        return about_comment;
    }

    public void setAbout_comment(String about_comment) {
        this.about_comment = about_comment;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
