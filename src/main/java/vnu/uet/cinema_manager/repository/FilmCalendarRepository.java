package vnu.uet.cinema_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vnu.uet.cinema_manager.entity.Film;

public interface FilmCalendarRepository extends JpaRepository<Film, Long> {
}
