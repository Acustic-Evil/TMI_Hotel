package tmi.tmi_hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/apartment")
public class Apartments {

    @RequestMapping("/deluxe")
    public String getDeluxeApartment() {
        return "deluxe_appartment";
    }

    @RequestMapping("/luxury")
    public String getLuxuryApartment() {
        return "luxury_apartment";
    }

    @RequestMapping("/onep_luxury")
    public String getOnepLuxuryApartment() {
        return "onep_luxury_apartment";
    }

}
