package tacos.utils;

import lombok.Data;


import java.util.List;

/**
 * @author makima
 * @data 2021/8/2 - 23:32
 */

@Data
public class Taco {

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters long")
    private String name;

    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<String> ingredients;
}