package tmi.tmi_hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tmi.tmi_hotel.entity.Guest;
import tmi.tmi_hotel.service.GuestService;

import java.util.List;

@RequestMapping("/admin")
@Controller
public class Privileges {

    @Autowired
    GuestService guestService;
    @RequestMapping("/guest_list")
    public String getGuestPage(Model model) {
        List<Guest> guests = guestService.getAllGuests();
        model.addAttribute("guests", guests);
        return "guest_list";
    }

    @PostMapping("/search")
    public String findGuest(@RequestParam String email, Model model){
        Guest guest = guestService.getGuest(email);
        model.addAttribute("guests", guest);
        return "guest_list";
    }


}
