package vnu.uet.cinema_manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vnu.uet.cinema_manager.entity.*;
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
    private CustomerService customerService;

    @Autowired
    private CartService cartService;

    @Autowired
    private BillService billService;

    @Autowired
    private RoomService roomService;

    @Autowired
    private TicketService ticketService;

    @Autowired
    private UserService userService;


    //bill
    @GetMapping("/admin/manager/bill")
    public String getBill(Model model){
        model.addAttribute("listBill", billService.getAllBill());
        return "admin/manager/bill";
    }

    @GetMapping("/admin/manager/getBillById")
    @ResponseBody
    public Bill getBillById(Long id){
        return billService.getBillById(id);
    }

    @PostMapping("/admin/manager/saveBill")
    public String saveBill(Bill bill){
        billService.saveBill(bill);
        return "redirect:/admin/manager/bill";
    }

    //cart
    @GetMapping("/admin/manager/cart")
    public String getCart(Model model){
        model.addAttribute("listCart", cartService.getAllCart());
        return "admin/manager/cart";
    }

    @GetMapping("/admin/manager/getCartById")
    @ResponseBody
    public Cart getCartById(Long id){
        return cartService.getCartById(id);
    }

    @PostMapping("/admin/manager/saveCart")
    public String saveCart(Cart cart){
        cartService.saveCart(cart);
        return "redirect:/admin/manager/cart";
    }
    // customer
    @GetMapping("/admin/manager/customer")
    public String getCustomer(Model model){
        model.addAttribute("listCustomer", customerService.getAllCustomer());
        return "admin/manager/customer";
    }

    @GetMapping("/admin/manager/getCustomerById")
    @ResponseBody
    public Customer getCustomerById(Long id){
        return customerService.getCustomerById(id);
    }

    @PostMapping("/admin/manager/saveCustomer")
    public String saveCustomer(Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/admin/manager/customer";
    }

    // film
    @GetMapping("/admin/manager/film")
    public String getFilm(Model model){
        model.addAttribute("listFilm", filmService.getAllFilm());
        return "admin/manager/film";
    }

    @GetMapping("/admin/manager/getFilmById")
    @ResponseBody
    public Film getFilmById(Long id){
        return filmService.getFilmById(id);
    }

    @PostMapping("/admin/manager/saveFilm")
    public String saveFilm(Film film){
        filmService.saveFilm(film);
        return "redirect:/admin/manager/film";
    }

    // filmCalendar
    @GetMapping("/admin/manager/filmCalendar")
    public String getFilmCalendar(Model model){
        model.addAttribute("listFilmCalendar", filmCalendarService.getAllFilmCalendar());
        return "admin/manager/filmCalendar";
    }

    @GetMapping("/admin/manager/getFilmCalendarById")
    @ResponseBody
    public FilmCalendar getFilmCalendarById(Long id){
        return filmCalendarService.getFilmCalendarById(id);
    }

    @PostMapping("/admin/manager/saveFilmCalendar")
    public String saveFilmCalendar(FilmCalendar filmCalendar){
        filmCalendarService.saveFilmCalendar(filmCalendar);
        return "redirect:/admin/manager/filmCalendar";
    }


    // food
    @GetMapping("/admin/manager/food")
    public String getFood(Model model){
        model.addAttribute("listFood", foodService.getAllFood());
        return "admin/manager/food";
    }

    @GetMapping("/admin/manager/getFoodById")
    @ResponseBody
    public Food getFoodById(Long id){
        return foodService.getFoodById(id);
    }

    @PostMapping("/admin/manager/saveFood")
    public String saveFood(Food food){
        foodService.saveFood(food);
        return "redirect:/admin/manager/food";
    }

    // foodDetail
    @GetMapping("/admin/manager/foodDetail")
    public String getFoodDetail(Model model){
        model.addAttribute("listFoodDetail", foodDetailService.getAllFoodDetail());
        return "admin/manager/foodDetail";
    }

    @GetMapping("/admin/manager/getFoodDetailById")
    @ResponseBody
    public FoodDetail getFoodDetailById(Long id){
        return foodDetailService.getFoodDetailById(id);
    }

    @PostMapping("/admin/manager/saveFoodDetail")
    public String saveFoodDetail(FoodDetail foodDetail){
        foodDetailService.saveFoodDetail(foodDetail);
        return "redirect:/admin/manager/foodDetail";
    }
    // ticket
    @GetMapping("/admin/manager/ticket")
    public String getTicket(Model model){
        model.addAttribute("listTicket", ticketService.getAllTicket());
        return "admin/manager/ticket";
    }

    @GetMapping("/admin/manager/getTicketById")
    @ResponseBody
    public Ticket getTicketById(Long id){
        return ticketService.getTicketById(id);
    }

    @PostMapping("/admin/manager/saveTicket")
    public String saveTicket(Ticket ticket){
        ticketService.saveTicket(ticket);
        return "redirect:/admin/manager/ticket";
    }



    // room
    @GetMapping("/admin/manager/room")
    public String getRoom(Model model){
        model.addAttribute("listRoom", roomService.getAllRoom());
        return "admin/manager/room";
    }

    @GetMapping("/admin/manager/getRoomById")
    @ResponseBody
    public Room getRoomById(Long id){
        return roomService.getRoomById(id);
    }

    @PostMapping("/admin/manager/saveRoom")
    public String saveRoom(Room room){
        roomService.saveRoom(room);
        return "redirect:/admin/manager/room";
    }
    //user
    // user
    @GetMapping("/admin/manager/user")
    public String getUser(Model model){
        model.addAttribute("listUser", userService.getAllUser());
        return "admin/manager/user";
    }

    @GetMapping("/admin/manager/getUserById")
    @ResponseBody
    public User getUserById(String username){
        return userService.findByUsername(username);
    }

    @PostMapping("/admin/manager/saveUser")
    public String saveUser(User user){
        userService.saveUser(user);
        return "redirect:/admin/manager/user";
    }




}
