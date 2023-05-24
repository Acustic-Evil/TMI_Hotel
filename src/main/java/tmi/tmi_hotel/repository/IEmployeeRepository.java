package tmi.tmi_hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tmi.tmi_hotel.entity.Employee;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    List<Employee> getAllByJobTitle(String role);
    public Employee getEmployeeByEmail(String email);

    public Employee getEmployeeByLastName(String lastName);

    public Employee getEmployeeByIdEmployee(Long id);

    public void deleteEmployeeByIdEmployee(long id);


}
