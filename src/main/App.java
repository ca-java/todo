import java.util.List;

public class App {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        // 1
        print(manager.tasks());
    }

    private static void print(List<Task> tasks) {
        for(Task task: tasks)
            System.out.println(task.toString());
    }
}
