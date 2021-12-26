package vnu.uet.cinema_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vnu.uet.cinema_manager.service.FilmService;

@Controller
public class AdminController {

    @Autowired
    private FilmService filmService;

    @GetMapping("/admin/manager/film")
    public String getFilm(Model model){

        model.addAttribute("listFilm", filmService.getAllFilm());
        return "admin/manager/film";
    }
}
