package ru.absens.lt.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.absens.lt.models.Test1;

@Data
@NoArgsConstructor
public class Test1Dto {

    private Long id;

    private String title;

    public Test1Dto(Test1 test1) {
        this.id = test1.getId();
        this.title = test1.getTitle();
    }
}
