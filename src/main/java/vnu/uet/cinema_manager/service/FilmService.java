package vnu.uet.cinema_manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vnu.uet.cinema_manager.entity.Film;
import vnu.uet.cinema_manager.repository.FilmRepository;

import java.util.List;

@Service
public class FilmService {

    private FilmRepository filmRepository;

    @Autowired
    public void setFilmRepository(FilmRepository filmRepository){
        this.filmRepository= filmRepository;
    }

    public List<Film> getAllFilm(){
        return  filmRepository.findAll();
    }

}
