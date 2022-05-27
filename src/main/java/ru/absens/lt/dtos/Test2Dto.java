package ru.absens.lt.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.absens.lt.models.Test2;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
public class Test2Dto {

    private Long id;

    private String title;

    private BigDecimal price;

    private String test1_title;

    public Test2Dto(Test2 test2) {
        this.id = test2.getId();
        this.title = test2.getTitle();
        this.price = test2.getPrice();
        this.test1_title = test2.getTest1().getTitle();
    }
}