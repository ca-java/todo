import java.util.List;
public class App {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        // add some tasks
        Task t1 = new Task("Call Brother");
        Task t2 = new Task("Order Pizza 🍕");
        Task t3 = new Task("Call Mother");
        Task t4 = new Task("Clean apartment");
        Task t5 = new Task("Service", "Bring car to the service");
        Task t6 = new Task("Shopping", "Gifts for christmas 🎄😨");

        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);

        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);

        // print all tasks
        print(manager.tasks(), "All");

        // update the task
        manager.update(t1, t3);

        // print all tasks
        print(manager.tasks(), "All");

        // set t3 completed and print inactive tasks
         t3.setCompleted();
        print(manager.getCompletedTasks(), "Completed");

        // print active tasks
        print(manager.getActiveTasks(), "Active");

        t1.setCompleted();
        t2.setCompleted();
        t3.setCompleted();
        manager.removeAllCompleted();
        print(manager.tasks(), "All");
    }

    private static void print(List<Task> tasks, String printCategory) {
        System.out.printf("---- %s tasks readout ----%n", printCategory);
        for(Task task: tasks)
            System.out.println(task);
        System.out.printf("---- End of %s tasks readout ----%n%n", printCategory);
    }
}
