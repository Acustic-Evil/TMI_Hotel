package tmi.tmi_hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tmi.tmi_hotel.service.GuestService;
import tmi.tmi_hotel.service.OrderService;

import java.time.LocalDate;
import java.util.Objects;

@Controller
public class Landing {
    @Autowired
    GuestService guestService;

    @Autowired
    OrderService orderService;

    @RequestMapping("/main")
    public String getMainPage() {
        return "/landing/index";
    }

    @GetMapping("/sign_in")
    public String getSingIn() {
        return "/landing/sign_in";
    }

    @GetMapping("/sign_up")
    public String getSingUp() {
        return "/landing/sign_up";
    }

    @GetMapping("/book")
    public String getBook(Model model) {
        model.addAttribute("currentDate", LocalDate.now());
        return "/landing/book";
    }

    @PostMapping("/book")
    public String newOrder(@RequestParam("fio") String fio,
                           @RequestParam("phone_number") String phone_number,
                           @RequestParam("email") String email,
                           @RequestParam("rooms") String room_type,
                           @RequestParam("date_in") String date_in,
                           @RequestParam("date_out") String date_out) {
        String check = guestService.addNewGuest(fio, phone_number, email);

        if (Objects.equals(check, "all good")) {
            boolean order_check = orderService.order(room_type, date_in, date_out, email);
            if (!order_check) return "redirect:/landing/book?smth_wrong";
            return "redirect:/book?success";
        } else if (Objects.equals(check, "FIO")) {
            return "redirect:/book?FIO_err";
        }
        return "redirect:/book?smth_wrong";

        //при бронировании появляется заказ. комната с нужным типом получает id этого заказа. Букинг получает id комнаты
        //и заказ получает id пользователя сделавшего заказ
    }

}
