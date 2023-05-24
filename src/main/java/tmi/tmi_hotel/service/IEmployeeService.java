package tmi.tmi_hotel.service;

import org.springframework.stereotype.Service;
import tmi.tmi_hotel.entity.Employee;

import java.util.List;

@Service
public interface IEmployeeService {
    public List<Employee> findAllEmployees();

    void addNewEmployee(Employee employee);

    public Employee findByLastName(String lastName);

    Employee getEmployeeById(Long id);

    void updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}
