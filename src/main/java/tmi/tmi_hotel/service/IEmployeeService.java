package tmi.tmi_hotel.service;

import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Employee;

import java.util.List;

@Service
public interface IEmployeeService {
    public List<Employee> findAllEmployees();
    public void deleteById(Long id);
    public Employee updateEmployee(Employee employee);
    public Employee addNewEmployee(Employee employee);
}
