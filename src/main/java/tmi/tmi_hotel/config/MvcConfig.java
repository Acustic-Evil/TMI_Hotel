package tmi.tmi_hotel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/images/**").addResourceLocations("file:resources/");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    public void addViewControllers(ViewControllerRegistry registry) {
        // landing
        registry.addViewController("/main").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/sign_in").setViewName("sign_in");
//        registry.addViewController("/sign_up").setViewName("sign_up");

        // entertainments
        registry.addViewController("/entertainments/banquet_hall").setViewName("banquet_hall");
        registry.addViewController("/entertainments/bar").setViewName("bar");
        registry.addViewController("/entertainments/pool").setViewName("pool");
        registry.addViewController("/entertainments/restaurant").setViewName("restaurant");
        registry.addViewController("/entertainments/veranda").setViewName("veranda");

        // admin utilities
        registry.addViewController("/book").setViewName("book");
        registry.addViewController("/all_lists").setViewName("all_lists");
        registry.addViewController("/staff_list").setViewName("staff_list");

        // apartments
        registry.addViewController("/apartment/deluxe").setViewName("deluxe_appartment");
        registry.addViewController("/apartment/luxury").setViewName("luxury_appartment");
        registry.addViewController("/apartment/onep_luxury").setViewName("onep_luxury_appartment");

    }


}
