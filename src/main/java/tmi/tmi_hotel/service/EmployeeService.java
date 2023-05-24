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
    public void addNewEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    @Override
    public Employee findByLastName(String lastName) {
        return employeeRepository.getEmployeeByLastName(lastName);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.getEmployeeByIdEmployee(id);
    }
    @Override
    public void updateEmployee(Employee employee) {
        Employee employee1 = getEmployeeById(employee.getIdEmployee());
        employee1.setEmail(employee.getEmail());
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        employee1.setMiddleName(employee.getMiddleName());
        employee1.setPhoneNumber(employee.getPhoneNumber());
        employee1.setJobTitle(employee.getJobTitle());
        employee1.setDepartment(employee.getDepartment());
        employeeRepository.save(employee1);
    }
}
