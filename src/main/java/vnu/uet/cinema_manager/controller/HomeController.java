package vnu.uet.cinema_manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/", "/home"})
    public String home(){
        return "public/home";
    }

    @GetMapping(value = {"/about"})
    public String about(){
        return "public/about";
    }

    @GetMapping(value = {"/joinus"})
    public String joinus(){
        return "public/joinus";
    }

    @GetMapping(value = {"/contact"})
    public String contact(){
        return "public/contact";
    }

}
