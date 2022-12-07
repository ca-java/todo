import java.util.*;


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
        List<Task> tasks = tasks();
        Collections.sort(tasks, new PriorityComparator());
        return tasks;
    }

    public List<Task> sortDESC() {
        //Sorted tasks in descending priority order
        List<Task> tasks = tasks();
        Collections.sort(tasks, new PriorityComparator().reversed());
        return tasks;
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
        List<Task> result = new ArrayList<>();
        for (Task task: tasks()) {
            if (task.isCompleted())
                result.add(task);
        }
        return result;
    }

    public List<Task> getActiveTasks() {
        // return incomplete tasks
        List<Task> result = new ArrayList<>();
        for (Task task: tasks()) {
            if (!task.isCompleted())
                result.add(task);
        }
        return result;
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

    public void setCompleted(Task task) {
        // logika surandu task'a ir ji complete'inu
        tasks().get(tasks().indexOf(task)).setCompleted();
    }
}
