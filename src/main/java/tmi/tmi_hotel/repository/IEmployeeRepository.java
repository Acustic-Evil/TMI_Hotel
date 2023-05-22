package tmi.tmi_hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tmi.tmi_hotel.entity.Employee;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> getAllByJobTitle(String role);
    public Employee findEmployeeByEmail(String email);

    public Employee findEmployeeByLastName(String lastName);


}
