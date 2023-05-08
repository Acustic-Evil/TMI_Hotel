package tmi.tmi_hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;
import tmi.tmi_hotel.entity.Guest;

@Controller
public class Landing {



    /*@RequestMapping("/sign_in")
    public String getSingIn() {
        return "sign_in";
    }*/

    @RequestMapping("/sign_up")
    public String getSingUp(WebRequest request, Model model) {
        Guest guest = new Guest();
        model.addAttribute("user", guest);
        return "sign_up";
    }

}
