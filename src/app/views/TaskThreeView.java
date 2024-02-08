package app.views;

import app.model.TaskThree;
import app.utils.PrintTaskDescription;
import app.utils.PrintHashTable;

import java.util.Hashtable;
import java.util.Scanner;


public class TaskThreeView {
    private static final Scanner scanner = new Scanner(System.in);
    public static void processingViewTaskThree(int taskNum) {
        boolean flag = true;
        PrintTaskDescription.printTaskDescription(TaskThree.taskDescription, taskNum);

        while (flag) {
            System.out.print("Input find name: ");
            String findName = scanner.nextLine();
            Hashtable<String,Integer> findResult = TaskThree.checkIfNameInArray(findName);
            PrintHashTable.printHashTable(findResult, "The name you were looking for was not found");
            flag = ifNeedContainFind();
        }
    }

    private static boolean ifNeedContainFind () {
        while (true) {
            System.out.println("Do you want to find another name? (yes/no)");
            String answer = scanner.nextLine();
            switch (answer) {
                case "no":
                    return false;
                case "yes":
                    return true;
                default:
                    System.out.println("I don't understand you, please input 'yes' or 'no'.");
                    break;
            }
        }
    }
}




