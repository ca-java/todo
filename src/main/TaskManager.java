import java.util.*;
import java.util.stream.Collectors;


public class TaskManager {

    private TaskDao taskDao;

    public TaskManager(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    public List<Task> tasks() {
        return taskDao.fetchTasks();
    }

    public List<Task> sortASC() {
        //Sorted tasks in ascending priority order
        return taskDao.fetchTasks().stream()
                .sorted(Comparator.comparing(Task::getPriority))
                .collect(Collectors.toList());
    }

    public List<Task> sortDESC() {
        //Sorted tasks in descending priority order
        return taskDao.fetchTasks().stream()
                .sorted(Comparator.comparing(Task::getPriority).reversed())
                .collect(Collectors.toList());
    }

    public void add(Task task) {
        taskDao.add(task);
    }

    public void remove(Task task) {
        taskDao.remove(task);
    }

    public boolean update(Task oldTask, Task newTask) {
        return taskDao.update(oldTask, newTask);
    }

    public List<Task> getCompletedTasks() {
        // return completed tasks
        return taskDao.fetchTasks().stream()
                .filter(obj -> obj.getCompleted())
                .filter(t -> t.getCompleted())
                .collect(Collectors.toList());
    }

    public List<Task> getActiveTasks() {
        // return incomplete tasks
        return taskDao.fetchTasks().stream()
                .filter(obj -> !obj.getCompleted())
                .collect(Collectors.toList());
    }

    public void removeAllCompleted() {
        // remove all completed tasks
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task task: tasks()) {
            if (task.getCompleted())
                tasksToRemove.add(task);
        }
        taskDao.removeAll(tasksToRemove);
    }

    public void setCompleted(Task task) {
        // logika surandu task'a ir ji complete'inu
        tasks().get(tasks().indexOf(task)).setCompleted();
    }
}
