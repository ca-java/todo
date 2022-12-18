import java.util.ArrayList;
import java.util.List;

public class TaskDao {

    private final List<Task> tasks = new ArrayList<>();

    public TaskDao(){

        // add some tasks
        Task t1 = new Task.Builder("Call Brother")
                .build();
        Task t2 = new Task.Builder("Order Pizza 🍕")
                .build();
        Task t3 = new Task.Builder("Call Mother")
                .priority(4)
                .build();
        Task t4 = new Task.Builder("Clean apartment")
                .priority(3)
                .build();
        Task t5 = new Task.Builder("Service")
                .description("Bring car to the service")
                .priority(1)
                .build();
        Task t6 = new Task.Builder("Shopping")
                .description("Gifts for christmas 🎄😨")
                .priority(5)
                .build();

        List.of(t1, t2, t3, t4, t5, t6);

    }

    public List<Task> fetchTasks(){
        return tasks;
    }

    public void add(Task task) {
        // validate
        tasks.add(task);
    }

    public void remove(Task task) {
        // validate
        tasks.remove(task);
    }

    public boolean update(Task oldTask, Task newTask) {
        if (tasks.contains(oldTask)) {
            tasks.remove(oldTask);
            tasks.add(newTask);
            return true;
        } else
            return false;
    }

    public void removeAll(List<Task> tasks) {
        tasks.removeAll(tasks);
    }
}
