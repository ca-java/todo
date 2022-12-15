import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;


public class TaskManager {

    private TaskDao taskDao;

    public TaskManager(TaskDao taskDao) {
        this.taskDao = taskDao;
    }

    /*
    1. + Peržiūrėti visas esamas užduotis (tasks)
    2. + Pridėti naują užduotį
    3. + Ištrinti pasirinktą užduotį
    4. + Redaguoti pasirinktą užduotį
    5. + Pažymėti užduotį kaip atliktą
    6. + Išvesti į ekraną užduotis, kurios nėra atliktos
    7. + Išvesti į ekraną visas užduotis, kurios jau yra atliktos
    8. + Pašalinti visas atliktas užduotis
    9. + Rūšiuoti užduotis pagal prioriteto tvarką
     */

    public List<Task> tasks() {
        return taskDao.fetchTasks();
    }

    public List<Task> sortASC() {
        //Sorted tasks in ascending priority order
        return taskDao.fetchTasks().stream()
                        .sorted((o1, o2) -> o1.getPriority() - o2.getPriority())
                                .collect(Collectors.toList());

    }

    public List<Task> sortDESC() {
        //Sorted tasks in descending priority order
        return taskDao.fetchTasks().stream()
                .sorted((o1, o2) -> o2.getPriority() - o1.getPriority())
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
                .filter(e -> e.isCompleted())
                .collect(Collectors.toList());
    }

    public List<Task> getActiveTasks() {
        // return incomplete tasks
        return taskDao.fetchTasks().stream()
                .filter(e -> !e.isCompleted())
                .collect(Collectors.toList());
    }

    public void removeAllCompleted() {
        // remove all completed tasks
        List<Task> tasksToRemove = new ArrayList<>();
        for (Task task: tasks()) {
            if (task.isCompleted())
                tasksToRemove.add(task);
        }
        taskDao.removeAll(tasksToRemove);
    }

    public boolean setCompleted (Task task) {
        return taskDao.setCompleted(task);
    }


}
