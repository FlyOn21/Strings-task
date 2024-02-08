package app.model;

import java.util.*;

public class TaskThree {

    public static String taskDescription = """
            1) У переліку:
            Bob, Alice, Tom, Lucy, Bob, Lisa
            зробіть пошук імені та підрахунок кількості
            однакових імен.
            2) Введення пошуку імені реалізуйте через
            Scanner.
            3) Реалізуйте виведення знайденого імені та його кількості
            в списку. Також реалізуйте можливість виводу
            повідомлення про відсутність даних, якщо такого імені
            у списку немає.
            4) Окремі маніпуляції із даними виконуйте в окремих методах.
            """;

    private static final String[] nameArray = new String[]{"Bob", "Alice", "Tom", "Lucy", "Bob", "Lisa"};
    static public ArrayList<String> namesList = new ArrayList<>(Arrays.asList(nameArray));

    public static Hashtable<String,Integer> checkIfNameInArray(String findName) {
        Hashtable<String,Integer> resultHashTable = new Hashtable<>();
        if (namesList.contains(findName)){
            int countName = Collections.frequency(namesList, findName);
            resultHashTable.put(findName, countName);
        }
        return resultHashTable;
    }
}
