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

    private BigDecimal price;
    private Integer slotLocation;
    private LocalDate dateSell;

    @ManyToOne
    @JoinColumn
    private FilmCalendar filmCalendar;

}
