package tacos.utils;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author makima
 * @data 2021/8/2 - 23:05
 */
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }

}
