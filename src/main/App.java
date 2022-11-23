import java.util.List;

public class App {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // add some tasks
        Task t1 = new Task("Call Brother");
        Task t2 = new Task("Order Pizza 🍕");
        Task t3 = new Task("Call Mother");

        manager.add(t1);
        manager.add(t2);

        // print all tasks
        print(manager.tasks());

        // update the task
        manager.update(t1, t3);

        // print all tasks
        print(manager.tasks());
    }

    private static void print(List<Task> tasks) {
        System.out.println("---- Printing all tasks ----");
        for(Task task: tasks)
            System.out.println(task);
    }
}
