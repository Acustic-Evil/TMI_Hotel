package tmi.tmi_hotel.entity;

import jakarta.persistence.*;

@Entity
public class Employee {

    private @Id
    @GeneratedValue(strategy = GenerationType.AUTO) Long id_employee;


    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Zakaz zakaz;

    private String first_name;

    private String last_name;

    private String phone_number;

    private String email;

    private String password;

    private String job_title; // role

    private String department;

    public Employee() {
    }

    public Long getId_employee() {
        return id_employee;
    }

    public void setId_employee(Long id_employee) {
        this.id_employee = id_employee;
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

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
