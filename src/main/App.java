import java.util.List;

public class App {

    public static void main(String[] args) {

        TaskManager manager = new TaskManager(new TaskDao());

        // add some tasks
//        Task t1 = new Task.Builder("Call Brother")
//                .build();
//        Task t2 = new Task.Builder("Order Pizza 🍕")
//                .build();
//        Task t3 = new Task.Builder("Call Mother")
//                .priority(4)
//                .build();

        // print all tasks
        print(manager.tasks(), "All");

        // update the task
        manager.update(manager.tasks().get(0), manager.tasks().get(2));

        // print all tasks
        print(manager.tasks(), "All");

        // set t3 completed and print inactive tasks
        manager.setCompleted(manager.tasks().get(2));
        print(manager.getCompletedTasks(), "Completed");

        // print active tasks
        print(manager.getActiveTasks(), "Active");

        //print sorted tasks
        print(manager.sortASC(), "Sorted tasks in ascending order");
        print(manager.sortDESC(), "Sorted tasks in descending priority order");

//        manager.setCompleted(t1);
//        manager.setCompleted(t2);
//        manager.setCompleted(t3);
        manager.removeAllCompleted();
        print(manager.tasks(), "All");
    }

    private static void print(List<Task> tasks, String printCategory) {
        System.out.printf("---- %s tasks readout ----%n", printCategory);
        for (Task task : tasks)
            System.out.println(task);
        System.out.printf("---- End of %s tasks readout ----%n%n", printCategory);

    }
}


