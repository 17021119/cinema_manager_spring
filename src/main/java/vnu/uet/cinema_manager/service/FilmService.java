package vnu.uet.cinema_manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vnu.uet.cinema_manager.repository.FilmRepository;

@Service
public class FilmService {

    private FilmRepository filmRepository;

    @Autowired
    public void setFilmRepository(FilmRepository filmRepository){
        this.filmRepository= filmRepository;
    }
}
