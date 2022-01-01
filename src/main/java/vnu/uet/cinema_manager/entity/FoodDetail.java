package vnu.uet.cinema_manager.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import vnu.uet.cinema_manager.model.Size;
import vnu.uet.cinema_manager.model.Status;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class FoodDetail {

    @Id
    @GeneratedValue
    private Long id;
    @Enumerated(EnumType.STRING)
    private Size size;
    private BigDecimal price;
    private Integer count;
    @Column(nullable = false, columnDefinition = "TINYINT(1)")
    private boolean active;

    @ManyToOne
    @JoinColumn
    private Food food;

    public FoodDetail(Size size, BigDecimal price, Integer count, boolean active, Food food) {
        this.size = size;
        this.price = price;
        this.count = count;
        this.active = active;
        this.food = food;
    }
}
