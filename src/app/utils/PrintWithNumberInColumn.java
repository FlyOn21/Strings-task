package app.utils;

import java.util.ArrayList;

public class PrintWithNumberInColumn {

    public static final String SET_PLAIN_TEXT = "\033[0;0m";
    public static final String SET_BOLD_TEXT = "\033[0;1m";
    public static final String SET_ITALIC_TEXT = "\033[0;3m";

    public static void printWithNumberInColumn(ArrayList<String> wordsList) {
        int startNum = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : wordsList) {
            stringBuilder.append(startNum)
                    .append(": ")
                    .append(word)
                    .append("\n");
            startNum++;
        }
        String result = stringBuilder.toString();
        System.out.println(result);
    }

    public static void printWithNumberInColumn(ArrayList<String> wordsList, String highlightedWord) {
        int startNum = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : wordsList) {
            if (word.equals(highlightedWord)) {
                stringBuilder.append(SET_BOLD_TEXT)
                        .append(startNum)
                        .append(": ")
                        .append(SET_ITALIC_TEXT)
                        .append(word)
                        .append(SET_PLAIN_TEXT)
                        .append("\n");
            } else {
                stringBuilder.append(SET_PLAIN_TEXT)
                        .append(startNum)
                        .append(": ")
                        .append(word)
                        .append("\n");
            }
            startNum++;

        }
        String result = stringBuilder.toString();
        System.out.println(result);
    }

}
