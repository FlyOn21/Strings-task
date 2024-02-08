package app.views;

import app.model.TaskTwo;
import app.utils.PrintTaskDescription;
import app.utils.PrintWithNumberInColumn;

public class TaskTwoView {
    public static void processingViewTaskTwo(int taskNum) {
        PrintTaskDescription.printTaskDescription(TaskTwo.taskDescription, taskNum);
        PrintWithNumberInColumn.printWithNumberInColumn(TaskTwo.wordList, TaskTwo.highlightedWord);
    }
}
