package app;
import app.controller.TaskController;
public class App {
    static final TaskController startApp = new TaskController();

    public void run() {
        startApp.homeWorkProcessing();
    }

    public static void main(String[] args) {
        new App().run();
    }
}
