package tmi.tmi_hotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Employee;
import tmi.tmi_hotel.repository.IEmployeeRepository;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    IEmployeeRepository employeeRepository;
    @Override
    public List<Employee> findAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee addNewEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee findByEmail(String email) {
        return employeeRepository.findEmployeeByEmail(email);
    }

    @Override
    public Employee findByLastName(String lastName) {
        return employeeRepository.findEmployeeByLastName(lastName);
    }
}
