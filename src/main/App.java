package main;
import java.util.List;

public class App {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        // naujos uzduotys
        Task t1 = new Task("Call Jonny");
        Task t2 = new Task("Download iOS update");
        Task t3 = new Task("Send message to Bobby");


        manager.add(t1);
        manager.add(t2);
        manager.add(t3);


        print(manager.tasks());
    }

    private static void print(List<Task> tasks) {
        for(Task task: tasks)
            System.out.println(task.toString());
    }
}
