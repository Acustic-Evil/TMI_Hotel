package tmi.tmi_hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/entertainments")
public class Entertainments {

    @RequestMapping("/banquet_hall")
    public String getBanquet() {
        return "/entertainments/banquet_hall";
    }

    @RequestMapping("/bar")
    public String getBar() {
        return "/entertainments/bar";
    }

    @RequestMapping("/pool")
    public String getPool() {
        return "/entertainments/pool";
    }

    @RequestMapping("/restaurant")
    public String getRestaurant() {
        return "/entertainments/restaurant";
    }

    @RequestMapping("/veranda")
    public String getVeranda() {
        return "/entertainments/veranda";
    }
}
