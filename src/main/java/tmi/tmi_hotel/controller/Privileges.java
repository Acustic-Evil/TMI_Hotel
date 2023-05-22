package tmi.tmi_hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tmi.tmi_hotel.entity.Employee;
import tmi.tmi_hotel.entity.Guest;
import tmi.tmi_hotel.service.EmployeeService;
import tmi.tmi_hotel.service.GuestService;

import java.util.List;

@RequestMapping("/admin")
@Controller
public class Privileges {

    @Autowired
    GuestService guestService;

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/guest_list")
    public String getGuestPage(Model model) {
        List<Guest> guests = guestService.getAllGuests();
        model.addAttribute("guests", guests);
        return "guest_list";
    }

    @GetMapping("/staff_list")
    public String getStaffPage(Model model) {
        List<Employee> staff = employeeService.findAllEmployees();
        model.addAttribute("staff", staff);
        return "staff_list";
    }

    @PostMapping("/search_employee")
    public String findEmployee(@RequestParam String last_name, Model model){
        Employee employee = employeeService.findByLastName(last_name);
        model.addAttribute("employee", employee);
        return "staff_list";
    }


    @PostMapping("/search_guest")
    public String findGuest(@RequestParam String lastName, Model model){
        Guest guest = guestService.getGuest(lastName);
        model.addAttribute("guests", guest);
        return "guest_list";
    }


}
