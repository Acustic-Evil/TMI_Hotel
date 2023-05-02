package tmi.tmi_hotel.service;

import tmi.tmi_hotel.entity.Employee;

import java.util.List;

public interface IAdminService {

    boolean addNewEmployee(String jobTitle, String firstName, String lastName, String phoneNumber, String email, String password, String department);

    List<Employee> getAllEmployees();

    Employee findById(Long id);

    void deleteEmployeeById(Long id);

    void setZakazInactive(Long id);

    void deleteBookingById(Long id);
}
