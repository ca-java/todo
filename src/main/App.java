

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
        print(manager.tasks(), "All");

        // update the task
        manager.update(t1, t3);

        // print all tasks
        print(manager.tasks(), "All");

        // get completed tasks
        t3.setCompleted();
        print(manager.getCompletedTasks(), "Completed");

        print(manager.getActiveTasks(), "Active");

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
