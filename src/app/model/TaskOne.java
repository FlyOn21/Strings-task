package app.model;

import java.util.ArrayList;

public class TaskOne {

    public static String taskDescription = """
            1) У наборі:
            brange, plum, tomato, onibn, grape
            виправте слова з помилками.
            2) Виведіть виправлений набір слів у стовпець,
            із нумерацією пунктів.
            3) Окремі маніпуляції з даними (набором
            слів) робіть в окремих методах.
            """;

    private static final String[] wordsArrayTaskOne = new String[]{"brange", "plum", "tomato", "onibn", "grape"};


    public static ArrayList<String> correctMistake() {
        ArrayList<String> listToPrint = new ArrayList<>();
        for (String word : wordsArrayTaskOne) {
            if (word.equals("brange")) {
                listToPrint.add(word.substring(1));
            } else if (word.equals("onibn")) {
                listToPrint.add(word.replaceFirst("b", "o"));
            } else {
                listToPrint.add(word);
            }
        }
        return listToPrint;
    }
}
