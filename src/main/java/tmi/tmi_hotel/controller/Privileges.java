package tmi.tmi_hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import tmi.tmi_hotel.entity.Booking;
import tmi.tmi_hotel.entity.Employee;
import tmi.tmi_hotel.entity.Guest;
import tmi.tmi_hotel.entity.Room;
import tmi.tmi_hotel.service.*;

import java.util.List;

import static java.lang.Long.parseLong;

@RequestMapping("/admin")
@Controller
public class Privileges {

    @Autowired
    GuestService guestService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    BookingService bookingService;

    @Autowired
    RoomService roomService;

    @Autowired
    OrderService orderService;

    @GetMapping("/all_lists")
    public String getAllLists() {
        return "/privileges/all_lists";
    }


    // ------------GUEST------------
    @GetMapping("/guest_list")
    public String getGuestPage(Model model) {
        List<Guest> guests = guestService.getAllGuests();
        model.addAttribute("guests", guests);
        return "/privileges/guest/guest_list";
    }

    @GetMapping("/guest_edit/{id}")
    public String getGuestEditPage(@PathVariable String id, Model model) {
        Guest guest = guestService.getGuestById(parseLong(id));
        model.addAttribute("guest", guest);
        return "/privileges/guest/guest_list_edit";
    }

    @PostMapping("/guest_edit")
    public String editGuest(@ModelAttribute Guest guest) {
        guestService.updateGuest(guest);
        return "redirect:/admin/guest_list";
    }

    @PostMapping("/search_guest")
    public String findGuest(@RequestParam String lastName, Model model){
        List<Guest> guests = guestService.getGuestsByLastName(lastName);
        model.addAttribute("guests", guests);
        return "/privileges/guest/guest_list";
    }

    @PostMapping("/delete_guest/{id}")
    public String deleteGuest(@PathVariable String id) {
        guestService.deleteGuest(parseLong(id));
        return "redirect:/admin/guest_list";
    }

    // ------------EMPLOYEE/STAFF------------
    @GetMapping("/staff_list")
    public String getStaffPage(Model model) {
        List<Employee> staff = employeeService.findAllEmployees();
        model.addAttribute("staff", staff);
        return "/privileges/staff/staff_list";
    }

    @GetMapping("/staff_add")
    public String getStaffAdd() {
        return "/privileges/staff/staff_list_add";
    }

    @PostMapping("/staff_add")
    public String addStaff(@ModelAttribute Employee employee){
        employeeService.addNewEmployee(employee);
        return "redirect:/admin/staff_list";
    }

    @GetMapping("/staff_edit/{id}")
    public String getStaffEdit(Model model, @PathVariable String id) {
        Employee employee = employeeService.getEmployeeById(parseLong(id));
        model.addAttribute("staff", employee);
        return "/privileges/staff/staff_list_edit";
    }

    @PostMapping("/staff_edit")
    public String editStaff(@ModelAttribute Employee employee) {
        employeeService.updateEmployee(employee);
        return "redirect:/admin/staff_list";
    }


    @PostMapping("/search_employee")
    public String findEmployee(@RequestParam String last_name, Model model){
        Employee employee = employeeService.findByLastName(last_name);
        model.addAttribute("staff", employee);
        return "/privileges/staff/staff_list";
    }

    @PostMapping("/delete_employee/{id}")
    public String deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(parseLong(id));
        return "redirect:/admin/staff_list";
    }

    // ------------BOOKING------------
    @GetMapping("/booking_list")
    public String getBookingPage(Model model) {
        List<Booking> bookings = bookingService.findAllBookings();
        model.addAttribute("bookings", bookings);
        return "/privileges/booking/booking_list";
    }

    @PostMapping("/cancel_booking/{id}")
    public String cancelBooking(@PathVariable String id) {
        orderService.cancelBooking(parseLong(id));
        return "redirect:/admin/booking_list";
    }


}
