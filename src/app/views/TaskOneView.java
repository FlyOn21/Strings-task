package app.views;

import app.utils.PrintTaskDescription;
import app.utils.PrintWithNumberInColumn;
import app.model.TaskOne;

import java.util.ArrayList;

public class TaskOneView {
    public static void processingViewTaskOne(int taskNum) {
        PrintTaskDescription.printTaskDescription(TaskOne.taskDescription, taskNum);
        ArrayList<String> taskOneResult = TaskOne.correctMistake();
        PrintWithNumberInColumn.printWithNumberInColumn(taskOneResult);
    }
}
