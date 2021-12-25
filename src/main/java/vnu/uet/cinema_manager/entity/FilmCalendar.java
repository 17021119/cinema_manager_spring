package vnu.uet.cinema_manager.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class FilmCalendar {

    @Id
    @GeneratedValue
    private Long id;


    @ManyToOne
    @JoinColumn
    private Film film;

    @OneToOne
    @JoinColumn
    private Room room;
}
