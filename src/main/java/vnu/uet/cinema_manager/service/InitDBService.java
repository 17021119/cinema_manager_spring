package vnu.uet.cinema_manager.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vnu.uet.cinema_manager.entity.Admin;
import vnu.uet.cinema_manager.entity.User;
import vnu.uet.cinema_manager.repository.*;

import javax.annotation.PostConstruct;

@Service
public class InitDBService {

    private AdminRepository adminRepository;

    @Autowired
    public void setAdminRepository(AdminRepository adminRepository){
        this.adminRepository= adminRepository;
    }

    private BillRepository billRepository;

    @Autowired
    public void setBillRepository(BillRepository billRepository){
        this.billRepository= billRepository;
    }


    private CartRepository cartRepository;

    @Autowired
    public void setCartRepository(CartRepository cartRepository){
        this.cartRepository= cartRepository;
    }

    private CustomerRepository customerRepository;

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository){
        this.customerRepository= customerRepository;
    }

    private FilmCalendarRepository filmCalendarRepository;

    @Autowired
    public void setFilmCalendarRepository(FilmCalendarRepository filmCalendarRepository){
        this.filmCalendarRepository= filmCalendarRepository;
    }

    private FilmRepository filmRepository;

    @Autowired
    public void setFilmRepository(FilmRepository filmRepository){
        this.filmRepository= filmRepository;
    }

    private FoodDetailRepository foodDetailRepository;

    @Autowired
    public void setFoodDetailRepository(FoodDetailRepository foodDetailRepository) {
        this.foodDetailRepository = foodDetailRepository;
    }

    private FoodRepository foodRepository;

    @Autowired
    public void setFoodRepository(FoodRepository foodRepository){
        this.foodRepository= foodRepository;
    }

    private RoomRepository roomRepository;

    @Autowired
    public void setRoomRepository(RoomRepository roomRepository){
        this.roomRepository= roomRepository;
    }

    private TicketRepository ticketRepository;

    @Autowired
    public void setTicketRepository(TicketRepository ticketRepository){
        this.ticketRepository= ticketRepository;
    }

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository){
        this.userRepository= userRepository;
    }


    @PostConstruct // gọi khi các bean được khởi tạo hết
    public void init(){
        if(adminRepository.count()==0){ // nếu db chưa có dữ liệu

            User userAdmin1= new User("admin", "ROLE_ADMIN");
            Admin admin1= new Admin("Dương Hoài An", "andh@vnu.edu.vn", userAdmin1);

            userRepository.save(userAdmin1);
            adminRepository.save(admin1);


            User user1= new User("17021119");
            userRepository.save(user1);

        }
    }

}
