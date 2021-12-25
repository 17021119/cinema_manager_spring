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
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn
    private Food food;


}
