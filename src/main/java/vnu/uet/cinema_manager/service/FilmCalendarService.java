package vnu.uet.cinema_manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vnu.uet.cinema_manager.repository.FilmCalendarRepository;

@Service
public class FilmCalendarService {

    private FilmCalendarRepository filmCalendarRepository;

    @Autowired
    public void setFilmCalendarRepository(FilmCalendarRepository filmCalendarRepository){
        this.filmCalendarRepository= filmCalendarRepository;
    }
}
