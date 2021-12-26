package vnu.uet.cinema_manager.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Ticket {

    @Id
    @GeneratedValue
    private Long id;

    private Integer slotLocation;
    private LocalDate dateSell;

    @ManyToOne
    @JoinColumn
    private FilmCalendar filmCalendar;

    public Ticket(Integer slotLocation, LocalDate dateSell, FilmCalendar filmCalendar) {
        this.slotLocation = slotLocation;
        this.dateSell = dateSell;
        this.filmCalendar = filmCalendar;
    }
}
