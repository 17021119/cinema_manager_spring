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
public class Film {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String directors;
    private String actors;
    private String category;
    private LocalDate openDay;
    private Integer time;
    private BigDecimal price;
    private String description;
    private String banner;
}
