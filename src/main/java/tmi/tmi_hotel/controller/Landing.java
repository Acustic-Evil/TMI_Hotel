package tmi.tmi_hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Landing {

    @RequestMapping("/main")
    public String getMainPage() {
        return "/landing/index";
    }

    @RequestMapping("/sign_in")
    public String getSingIn() {
        return "/landing/sign_in";
    }

    @RequestMapping("/sign_up")
    public String getSingUp() {
        return "/landing/sign_up";
    }

    @RequestMapping("/book")
    public String getBook() {
        return "/landing/book";
    }

}
