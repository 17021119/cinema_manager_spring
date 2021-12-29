package vnu.uet.cinema_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vnu.uet.cinema_manager.entity.Cart;
import vnu.uet.cinema_manager.entity.Film;
import vnu.uet.cinema_manager.entity.FilmCalendar;
import vnu.uet.cinema_manager.entity.FoodDetail;
import vnu.uet.cinema_manager.service.*;

@Controller
public class AdminController {

    @Autowired
    private FilmService filmService;

    @Autowired
    private FilmCalendarService filmCalendarService;

    @Autowired
    private FoodDetailService foodDetailService;

    @Autowired
    private FoodService foodService;

    @Autowired
    private CartService cartService;



    @GetMapping("/admin/manager/film")
    public String getFilm(Model model){
        model.addAttribute("listFilm", filmService.getAllFilm());
        return "admin/manager/film/film";
    }

    @GetMapping("/admin/manager/addFilm")
    public String addFilmPage(Model model){
        Film film= new Film();
        film.setName("this is film");
        model.addAttribute("film", film);
        return "admin/manager/film/addFilm";
    }

    @PostMapping("/saveNewFilm")
    public String saveNewFilm(@ModelAttribute("film") Film film){
        System.out.println("saveNewFilm id: "+ film.getId());
        filmService.saveFilm(film);
        return "redirect:/admin/manager/film";
    }


    @PostMapping("/saveFilm")
    public String saveFilm(Film film){
        System.out.println(film.getOpenDay());
        filmService.saveFilm(film);

        return "redirect:/admin/manager/film";
    }

    @GetMapping("/admin/manager/showFormUpdateFilm/{id}")
    public String showFormUpdateFilm(@PathVariable(value= "id") long id, Model model){
        // get employee from the service
        Film film= filmService.getFilmById(id);
        System.out.println("showFormUpdateFilm id:"+ film.getId());
        // set  employee as a model
        model.addAttribute("film", film);
        return "admin/manager/film/updateFilm";
    }

    @GetMapping("admin/manager/delete/{id}")
    public String deleteFilm(@PathVariable( value = "id") long id){
        filmService.deletFilm(id);

        return "redirect:/admin/manager/film";
    }



    @GetMapping("/admin/manager/food")
    public String getFood(Model model){

        model.addAttribute("listFood", foodService.getAllFood());
        return "admin/manager/food";
    }
}
