package tmi.tmi_hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("entertainments")
public class Entertainments {

    @RequestMapping("/banquet_hall")
    public String getBanquet() {
        return "banquet_hall";
    }

    @RequestMapping("/bar")
    public String getBar() {
        return "bar";
    }

    @RequestMapping("/pool")
    public String getPool() {
        return "pool";
    }

    @RequestMapping("/restaurant")
    public String getRestaurant() {
        return "restaurant";
    }

    @RequestMapping("/veranda")
    public String getVeranda() {
        return "veranda";
    }
}
