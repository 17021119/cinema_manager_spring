package vnu.uet.cinema_manager.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vnu.uet.cinema_manager.repository.TicketRepository;

@Service
public class TicketService {

    private TicketRepository ticketRepository;

    @Autowired
    public void setTicketRepository(TicketRepository ticketRepository){
        this.ticketRepository= ticketRepository;
    }
}
