package app.controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import app.views.TaskOneView;
import app.views.TaskThreeView;
import app.views.TaskTwoView;

public class TaskController {

    private static final String title = """
        -----------------------
        Home work 3 String-task
        -----------------------
            """;
    private static final String menu = """
    choice 1 => Task One
    choice 2 => Task Two
    choice 3 => Task Three
    choice 4 => Close program
    """;

    static Scanner scanner = new Scanner(System.in);

    public void homeWorkProcessing() {
        System.out.println(title);
        while (true) {
            System.out.println(menu);
            System.out.print("Enter your choice: ");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        TaskOneView.processingViewTaskOne(choice);
                        break;
                    case 2:
                        TaskTwoView.processingViewTaskTwo(choice);
                        break;
                    case 3:
                        TaskThreeView.processingViewTaskThree(choice);
                        break;
                    case 4:
                        System.out.println("By-by");
                        scanner.close();
                        return;
                }
            } catch (InputMismatchException error) {
                System.out.println("Something went wrong, maybe your input is incorrect.");
                scanner.nextLine();
            }
        }
    }
}
