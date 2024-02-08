package app.model;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskTwo {
    public static String taskDescription = """
            1) У наборі:
            orange, plum, tomato, onion, grape, onion
            видаліть усі "onion".
            2) Виведіть оновлений набір слів у стовпець,
            із нумерацією пунктів.
            3) Окремі маніпуляції з даними (набором
            слів) робіть в окремих методах.
            """;

    private static final String[] wordsArrayTaskTwo = new String[]{"orange", "plum", "tomato", "onion", "grape", "onion"};
    static public ArrayList<String> wordList = new ArrayList<>(Arrays.asList(wordsArrayTaskTwo));

    static public String highlightedWord = "onion";

}
