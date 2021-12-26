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
    private String time;
    private BigDecimal price;
    @Lob
    private String description;
    private String banner;

    public Film(String name, String directors, String actors, String category, LocalDate openDay, String time, BigDecimal price, String description, String banner) {
        this.name = name;
        this.directors = directors;
        this.actors = actors;
        this.category = category;
        this.openDay = openDay;
        this.time = time;
        this.price = price;
        this.description = description;
        this.banner = banner;
    }
}
