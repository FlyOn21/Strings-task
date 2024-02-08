package app.utils;

import java.util.Hashtable;

public class PrintHashTable {
    public static void printHashTable(Hashtable<String, Integer> ptintedHashTable, String messageIfEmpty) {
        if (ptintedHashTable.isEmpty()){
            System.out.println(messageIfEmpty);
        } else {
            ptintedHashTable.forEach((key, value) -> System.out.println(key + " => " + value));
        }
    }
}
